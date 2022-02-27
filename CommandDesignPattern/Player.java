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
       JumpCommand jump = new JumpCommand(player);
       jump.execute();
    }

    /**
     * Makes player fire
     */
    public void fire() {
        FireCommand fire = new FireCommand(player);
        fire.execute();
    }

    /**
     * Makes player run
     */
    public void runForward() {
        RunCommand run = new RunCommand(player);
        run.execute();
    }
}
