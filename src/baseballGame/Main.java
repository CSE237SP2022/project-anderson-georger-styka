package baseballGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu game = new Menu();
		try (Scanner read = new Scanner(System.in)) {

			game.startGame(read, 3);

			System.out.println("\nThank you for playing Stopwatch Baseball!\n");
		}
			
	}
	
	
}


