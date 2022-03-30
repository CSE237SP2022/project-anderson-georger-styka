package baseballGame;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game play = new Game();
		double min = 0.0;
		double max = 1.1;
		int holder;
		
		while(play.getTurnNum() < 5) {
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
			
	}
}
