/**
 * @author csimons637
 */
package CommandDesignPattern;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.Scanner;

public class JumpCommand implements Command {
    public Player player;
    

    /**
     * Creates a new jump command
     * @param player - The player that will be made to jump
     */
    public JumpCommand(Player player) {
        this.player = player;
    }

    /**
     * Executes the jump command
     * Reads the text file and make the player look lik they're jumping
     */
    public void execute() {
        File jump = new File("./jump.txt");
        Scanner read = new Scanner(jump);

        while(read.hasNextLine()) {
            int i = 0;
            for (i = 0; i < 6; i++) { // reads from zero to five
                System.out.println(read.nextLine());
            }
            i = 0;
            sleep(1);
        }
        clear();
        read.close();
    }

    /**
     * Makes the execute sleep for a period of time before reading the next group of lines from jump.txt
     * @param num - Period to wait (in milliseconds)
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
