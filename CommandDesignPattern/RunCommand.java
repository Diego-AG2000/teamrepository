package CommandDesignPattern;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.Scanner;

public class RunCommand implements Command{
    public Player player;
    File run = new File("./run.txt");
    Scanner read = new Scanner(run);

    /**
     * default constructor
     * @param player
     */
    public RunCommand(Player player){
        this.player = player;
    }
      /**
     * Run through the file and prints the appropriate image
     */
    public void execute(){
        while(read.hasNextLine()) {
            int i = 0;
            for (i = 0; i < 4; i++) { // reads from zero to three
                System.out.println(read.nextLine());
            }
            i = 0;
            sleep(1);
        }
        clear();
    }
    /**
     * Sleeps the program
     * @param num
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
    /**
     * Clears the console
     */
    private void clear() {
        System.out.println("\033[H\033[2]");
    }
    
}
