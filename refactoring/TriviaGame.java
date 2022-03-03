import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

/**
 * Holds all the information and logic for a True/False Trivia Game
 */
class TriviaGame {
    private String[][] questions = new String[20][2];
    private int count = 0;
    private Random rand;
    private int score = 0;
    private boolean playAgain = true;
    private Score myScore = new Score(0, 0, 0);

    /**
     * Creates a new Trivia Game
     * Loads all the question Data
     */
    public TriviaGame() {
        rand = new Random();

        try {
            File file = new File("questions.txt");
            Scanner scanner = new Scanner(file);

            // loop through to get each question
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String question = data[0].trim();
                String answer = data[1].trim().toLowerCase();
                questions[count][0] = question;
                questions[count][1] = answer;
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, we could not properly read the questions file");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Plays the game,
     * Will keep playing as the long as the user indicates they want to
     */
    public void play() {
        System.out.println("Welcome to our Trivia Game");

        while (playAgain == true) {
            playRound();
        }

        System.out.println("Goodbye");
        System.out.println(
                "You got " + myScore.getUserScore() + " out of " + myScore.getTotalGames() + " questions right.");
        System.out.println(
                "Comp got " + myScore.getCompScore() + " out of " + myScore.getTotalGames() + " questions right.");
    }

    /**
     * Plays one round of the game, asking and answering a random quesiton
     * Each time a question is presented we ensure the question is not asked again
     * Will increment the score if the user wins.
     */
    public void playRound() {
        Scanner in = new Scanner(System.in);

        int questionNum = rand.nextInt(questions.length);
        System.out.println(questions[questionNum][0]);
        System.out.print("Enter answer, True or False: ");
        String userAns = in.nextLine().trim().toLowerCase();

        if (userAns.equals(questions[questionNum][1])) {
            System.out.println("Yay you got it!");
            int prevScore = myScore.getUserScore();
            myScore.setUserScore(prevScore + 1);
            int numGames = myScore.getTotalGames();
            myScore.setTotalGames(numGames + 1);
        } else {
            System.out.println("Sorry that was incorrect.");
            int prevScore = myScore.getCompScore();
            myScore.setCompScore(prevScore + 1);
            int numGames = myScore.getTotalGames();
            myScore.setTotalGames(numGames + 1);
        }
        removeItemFromList(questionNum);

        if (count == 0) {
            System.out.println("Game Over! You answered all the questions");
            playAgain = false;
            return;
        }

        System.out.print("Do you want to play again, (Y)es or (N)o: ");
        String contInput = in.nextLine().trim().toLowerCase();

        if (contInput.equals("y") || contInput.equals("yes")) {
            playAgain = true;
        } else {
            playAgain = false;
        }
    }

    /**
     * Will remove the given index from the two dimensional qeustion array
     * 
     * @param questNumber The index to remove
     */
    public void removeItemFromList(int questNumber) {
        String[][] temp = new String[count - 1][2];

        // copy items over except questNumber
        int index = 0;
        for (int i = 0; i < questions.length; i++) {

            if (i != questNumber) {
                temp[index][0] = questions[i][0];
                temp[index][1] = questions[i][1];
                index++;
            }
        }
        questions = temp;
        count = questions.length;
    }

    public static void main(String[] args) {
        TriviaGame game = new TriviaGame();
        game.play();
    }
}