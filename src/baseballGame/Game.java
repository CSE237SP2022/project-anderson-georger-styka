package baseballGame;

public class Game {
	
	private int turnNum = 0;
	private boolean playerTurn = true;
	private Player player1;
	private Player player2;
	
	
	public int getTurnNum(){
		return this.turnNum;
	}
	
	public boolean getPlayerTurn() {
		return this.playerTurn;
	}
	
	public int getPlayer1Score() {
		return this.player1.getScore();
	}
	
	public int getPlayer2Score() {
		return this.player2.getScore();
	}
	
	public void updatePlay1Score(int num) {
		this.player1.addScore(num);
	}
	
	public void updatePlay2Score(int num) {
		this.player2.addScore(num);
	}
	
	private void nextTurn() {
		if(this.playerTurn) {
			this.playerTurn = false;
		}
		else {
			this.playerTurn = true;
			this.turnNum ++;
		}
	}
	
	public int playHalf() {
		double n =  Math.random();
		if(n < 1/6) {
			return 1;
		}
		else if(n < 1/3) {
			return 2;
		}
		else if(n < 1/2) {
			return 3;
		}
		else if(n < 2/3) {
			return 4;
		}
		else {
			return 0;
		}
		
	}
	
	public void resetGame() {
		this.player1 = new Player();
		this.player2 = new Player();
		this.playerTurn = true;
		this.turnNum = 0;
	}
}
