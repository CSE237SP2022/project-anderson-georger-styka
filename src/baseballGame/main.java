package baseballGame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game play = new Game();
		
		while(play.getTurnNum() < 5) {
				if(play.getPlayerTurn()) {
					play.updatePlay1Score(play.playHalf());
					//System.out.print(getScore)
					play.nextTurn();
				}
				else{
					play.updatePlay2Score(play.playHalf());
					//System.out.print(getScore)
					play.nextTurn();
				}
				System.out.print("Turn: " + play.getTurnNum() + "; Player 1 Score = " + play.getPlayer1Score() + "; Player 2 Score = " + play.getPlayer2Score() + "\n");
			}
	}

}
