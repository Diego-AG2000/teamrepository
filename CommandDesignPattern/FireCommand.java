/**
 * 
 * @author Diego Gonzalez
 */
package CommandDesignPattern;

import java.util.concurrent.TimeUnit;

import java.io.File;
import java.util.Scanner;

public class FireCommand implements Command{
    public Player player;
    
>>>>>>> d4601120be600ef623454be8cf59b34bb55fe05b
    public FireCommand(Player player) {
        this.player = player;
    }
    /**
     * Run through the file and prints the appropriate image
     */
    public void execute(){
        File fire = new File("./fire.txt");
        Scanner read = new Scanner(fire);

        while(read.hasNextLine()) {
            int i = 0;
            for(i = 0; i < 4; i++) {
                System.out.println(read.nextLine());
            }
            i = 0;
            sleep(1);
        }
        clear();
        read.close();
    }
    /**
     * Sleeps the program
     * @param num
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
    
}