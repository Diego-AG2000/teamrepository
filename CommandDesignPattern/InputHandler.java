package CommandDesignPattern;

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Player player) {
        commands = new HashMap<>();
       
        /**
         * @author Christopher ngo
         * - The key values should be correct. 
         * - will need to add player 
         * 
         */

       commands.put("Run", new RunCommand(player));
        commands.put("Jump", new JumpCommand(player));
        commands.put("Fire", new FireCommand(player));
        commands.put("Quit",new QuitCommand(player));        
    }

    public void buttonPressed(String button){
        String input = button.trim();

        if (commands.containsKey(input)) {
            commands.get(input).execute();
            
        }

    }




}