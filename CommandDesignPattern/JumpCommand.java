/**
 * @author csimons637
 */
package CommandDesignPattern;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.Scanner;

public class JumpCommand implements Command {
    public Player player;
    File jump = new File("./jump.txt");
    Scanner read = new Scanner(jump);

    public JumpCommand(Player player) {
        this.player = player;
    }

    public void execute() {
        while(read.hasNextLine()) {
            int i = 0;
            for (i = 0; i < 6; i++) { // reads from zero to five
                System.out.println(read.nextLine());
            }
            i = 0;
            sleep(1);
        }
        clear();
    }

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }

    private void clear() {
        System.out.println("\033[H\033[2]");
    }


}
