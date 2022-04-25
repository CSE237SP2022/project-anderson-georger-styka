package baseballGame;

import java.util.Scanner;

public class Menu {
	int turns;
	Game play = new Game();
	Scanner read;
	
	public void startGame(Scanner read, int turns) {
		this.read = read;
		this.turns = turns;
		this.startMessage();
		String in = this.read.nextLine();
		if (in.equals("help")) {
			this.usage();
		}
		else if (in.equals("start")) {
			while(this.play.getTurnNum() < this.turns) {
				if(this.play.getPlayerTurn()) {
					this.playTurn(1);
				}
				else {
					this.playTurn(2);
				}
				this.printScore();
				this.play.nextTurn();
			}
			this.finalOutput();
		}
	}
	
	public void startMessage() {
		System.out.println("\nWELCOME TO STOPWATCH BASEBALL!\nBy pressing the space bar, your goal"
				+ " is\n	to start and stop the on-screen stopwatch as close to 1 second as possible.\n\n"
				+ "Type 'help' for a more extensive look into the rules\n"
				+ "Type 'quit' to end the game at any time\n"
				+ "Type 'start' if you are ready to begin!");
	}
	public void usage() {
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
	}
	
	public void finalOutput()
	{
		System.out.println("FINAL:");
		if (this.play.getPlayer1Score() > this.play.getPlayer2Score()) {
			System.out.println("Congratulations, Player 1 wins!");
		}
		else if(this.play.getPlayer1Score() < this.play.getPlayer2Score()) {
			System.out.println("Congratulations, Player 2 wins!");
		}
		else {
			System.out.println("It's a tie! Great game!");
		}
	}
	
	public void playTurn(int i) {
		int[] runners;
		if (i == 1) {
			runners = this.play.getRunnersP1();
		}
		else {
			runners = this.play.getRunnersP2();
		}
		int outcome = this.play.batterOutcome();
		printTurns(runners, i, this.play.getTurnNum(), outcome);
		this.playerGameInput(outcome);
	}
	
	public void playerGameInput(int outcome) {
		while(true) {
			String input = this.read.nextLine();
			if(input.equals("")) {
				System.out.println("The batter got "+ outcome + " base(s).");
				this.play.updatePlay1Score(outcome);
				return;
			}
			else if(input.equals("quit")) {
				System.out.print("The game is over!");
				System.exit(0);
			}
			else {
				System.out.println(" (Press Enter to Play)");
			}
		}
		
	}
	
	public void printScore() {
		System.out.println("There are " + this.play.getOuts() + " out(s).");
		System.out.println("Player 1 Score = " + this.play.getPlayer1Score());
		System.out.println("Player 2 Score = " + this.play.getPlayer2Score());
		System.out.println();
	}
	
	/**
	 * This function is a helper method to make the printing in the main function cleaner
	 * @param runners > the runners that are on base
	 * @param player > which player is playing
	 * @param turn > the amount of turns that have been played
	 * @param bases > the result of the batter
	 */
	public void printTurns(int[] runners, int player, int turn, int bases) {
		if(player == 1) {
			System.out.println("Top Half of Round " + (turn + 1)+ ":");

		}
		else {
			System.out.println("Bottom Half of Round " + (turn + 1)+ ":");

		}
		System.out.println("There are " + this.play.getOuts() + " out(s).");
		if(runners[0] == 2 || runners[1] == 2 || runners[2] == 2 || runners[3] == 2){
			System.out.println("          _          ");
			System.out.println("         |\u2588|         ");
		}
		else {
			System.out.println("          _          ");
			System.out.println("         |_|         ");
		}
		
		System.out.println("        /   \\        ");
		System.out.println("       /     \\       ");
		System.out.println("     _/       \\_     ");
		boolean first = (runners[0] == 1 || runners[1] == 1 || runners[2] == 1 || runners[3] == 1);
		boolean third = (runners[0] == 3 || runners[1] == 3 || runners[2] == 3 || runners[3] == 3);
		if(first && third) {
			System.out.println("    |\u2588|       |\u2588|    ");
		}
		else if(first) {
			System.out.println("    |_|       |\u2588|    ");
		}
		else if(third) {
			System.out.println("    |\u2588|       |_|    ");
		}
		else {
			System.out.println("    |_|       |_|    ");
		}
		runners = null;
		System.out.println("      \\   _   /      ");
		System.out.println("       \\     /       ");
		System.out.println("        \\ _ /        ");
		System.out.println("         |_|         ");
		System.out.println("      Batter Up!      ");
		System.out.println(" (Press Enter to Play)");
	}
}
