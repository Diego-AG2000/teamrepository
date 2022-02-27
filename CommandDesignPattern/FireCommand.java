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
    File fire = new File("./fire.txt");
    Scanner read = new Scanner(fire);

    public FireCommand(Player player) {
        this.player = player;
    }

    public void execute(){
        while(read.hasNextLine()) {
            int i = 0;
            for(i = 0; i < 4; i++) {
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
            System.out.println("Timmer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
    
}