/**
 * @author csimons637
 */
package CommandDesignPattern;

public class Player {
    
    /**
     * Default constructor
     */
    public Player() {}
    
    /**
     * Makes player jump
     */
    public void jump() {
        JumpCommand.execute();
    }

    /**
     * Makes player fire
     */
    public void fire() {
        FireCommand.execute();
    }

    /**
     * Makes player run
     */
    public void runForward() {
        RunCommand.execute();
    }
}
