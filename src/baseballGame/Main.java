package baseballGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game play = new Game();
		double min = 0.0;
		double max = 1.1;
		int holder;
		String userInput = "";
		String postGameInput = "";
		
		try (Scanner read = new Scanner(System.in)) {
			while (!userInput.equalsIgnoreCase("quit")) {

				System.out.println("\nWELCOME TO STOPWATCH BASEBALL!\nBy pressing the space bar, your goal"
						+ " is\n	to start and stop the on-screen stopwatch as close to 1 second as possible.\n\n"
						+ "Type 'help' for a more extensive look into the rules\n"
						+ "Type 'quit' to end the game at any time\n"
						+ "Type 'start' if you are ready to begin!");

				userInput = read.nextLine();
				
				switch(userInput) {
				
				case "help":
					
					System.out.println("\nTHE RULES:\nThe user player will play 3 innings of stopwatch baseball against a computer player\n"
							+ "Each inning has a top half and a bottom half, giving both players an inning on offense\n"
							+ "In order to complete a half inning, the offense will need to record 3 outs\n"
							+ "An out is recorded if the user/computer's time elapsed between clicks is greater than 1 second or less than 0.85 seconds\n"
							+ "If the user/computer stops the watch between 0.85 and 1 second(s), they will be rewarded with a baserunner as follows:\n"
							+ "Between 0.85 and 0.88 - Single, baserunners move 1 spot\n"
							+ "Between 0.89 and 0.92 - Double, baserunners move 2 spots\n"
							+ "Between 0.93 and 0.96 - Triple, baserunners move 3 spots\n"
							+ "Between 0.97 and 1.0 - Home Run, all baserunners score\n"
							+ "A baserunner will score 1 point for their team if they move 4 spots total around the bases, which can be dictated by their own turn or turns after\n"
							+ "After 3 top and bottom innings, the player with the higher score wins!\n\n"
							+ "Press return/enter to return to the start page");
					String anyKey = read.nextLine();
				
					break;
					
				case "start":
					
					play = new Game();
					
					while(play.getTurnNum() < 6) {
						//double randomNumber = (double)Math.floor(Math.random()*(max-min+1)+min);
						double randomNumber = (double)(Math.random() * 1.1);
							if(randomNumber < 0.7) {
								holder = 0;
							}
							else if(randomNumber < 0.8) {
								holder = 1;
							}
							else if(randomNumber < 0.9) {
								holder = 2;
							}
							else if(randomNumber < 1.0) {
								holder = 3;
							}
							else if(randomNumber > 1.0 && randomNumber < 1.1) {
								holder = 4;
							}
							else {
								holder = 0;
							}
						if(play.getPlayerTurn()) {
							play.updatePlay1Score(holder);
							//System.out.print(getScore)
							play.nextTurn();
						}
						else{
							play.updatePlay2Score(holder);
							//System.out.print(getScore)
							play.nextTurn();
						}
						System.out.println("Round " + play.getTurnNum() + ":");
						System.out.println("Player 1 Score = " + play.getPlayer1Score());
						System.out.println("Player 2 Score = " + play.getPlayer2Score());
						System.out.println();

					}
					
					System.out.println("FINAL:");
					if(play.getPlayer1Score() > play.getPlayer2Score()) {
						System.out.println("Congratulations, you win!");
					}
					else if(play.getPlayer1Score() < play.getPlayer2Score()) {
						System.out.println("The computer player wins! Better luck next time.");
					}
					else {
						System.out.println("It's a tie! Great game!");
					}
					
					System.out.println("\nWould you like to play again? (yes/no)");
					
					postGameInput = read.nextLine();
					
					if(postGameInput.equals("yes")) {
						System.out.println("\nLet's run it back!!");
					}
					else if(postGameInput.equals("no")) {
						userInput = "quit";
					}
					break;
				
				}
			}
			
			System.out.println("\nThank you for playing Stopwatch Baseball!\n");
		}
			
	}
}

