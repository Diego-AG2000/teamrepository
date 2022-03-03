/**
 * Holds the scores for the trivia game
 */
public class Score {
    private int userScore = 0;
    private int compScore = 0;
    private int totalGames = 0;

    /**
     * Initializes all the scores
     * 
     * @param userScore  The score the player got
     * @param compScore  The scroe the computer got
     * @param totalGames The total number of games played
     */
    public Score(int userScore, int compScore, int totalGames) {
        this.userScore = userScore;
        this.compScore = compScore;
        this.totalGames = totalGames;
    }

    /**
     * Returns the score that the player currently has
     * 
     * @return The users score
     */
    public int getUserScore() {
        return userScore;
    }

    /**
     * Returns the score that the computer currently has
     * 
     * @return The computers score
     */
    public int getCompScore() {
        return compScore;
    }

    /**
     * Returns the total number of rounds of the game played
     * 
     * @return The total number of games
     */
    public int getTotalGames() {
        return totalGames;
    }

    /**
     * Updates the users score
     * 
     * @param score The new score for the user
     */
    public void setUserScore(int score) {
        this.userScore = score;
    }

    /**
     * Updates the computers score
     * 
     * @param score The new score for the computer
     */
    public void setCompScore(int score) {
        this.compScore = score;
    }

    /**
     * Updates the total number of games played
     * 
     * @param total The number of games played
     */
    public void setTotalGames(int total) {
        this.totalGames = total;
    }
}
