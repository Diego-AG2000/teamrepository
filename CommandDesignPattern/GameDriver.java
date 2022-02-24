package command;

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String command = "";

		Player player = new Player();
		InputHandler inHandler = new InputHandler(player);

		while (!command.contentEquals("quit")) {
			System.out.print("Enter command: ");
			command = in.next().toLowerCase().trim();
			inHandler.buttonPressed(command);
		}
	}
}
