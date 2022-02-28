/**
 * @author Cody Haigler
 */
package CommandDesignPattern;

public class QuitCommand {
    
    public QuitCommand(Player player) {
    }

    public void execute() {
        System.exit(0);
    }
}