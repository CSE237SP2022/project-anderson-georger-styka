package baseballGame;

public class Game {
	
	private int turnNum = 0;
	private boolean playerTurn = true;
	private int outs = 0;
	public Player player1 = new Player();
	public Player player2 = new Player();
	
	
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
		if(num == 0) {
			this.outs ++;
//			System.out.print(this.outs);
		}
		else {
			this.player1.addScore(num);
		}
		
	}
	
	public void updatePlay2Score(int num) {
		if(num == 0) {
			this.outs ++;
//			System.out.print(this.outs);
		}
		else {
			this.player2.addScore(num);
		}
	}
	
	public void nextTurn() {
		if(this.playerTurn && this.outs == 3) {
			this.playerTurn = false;
			this.outs = 0;
			this.player1.resetRunners();
		}
		else if (this.playerTurn == false && this.outs == 3){
			this.playerTurn = true;
			this.outs = 0;
			this.turnNum ++;
			this.player2.resetRunners();
		}
		
	}
	
	public int getOuts() {
		return this.outs;
	}
	
	
	public void resetGame() {
		this.player1 = new Player();
		this.player2 = new Player();
		this.playerTurn = true;
		this.turnNum = 0;
		this.outs = 0;
	}
}
