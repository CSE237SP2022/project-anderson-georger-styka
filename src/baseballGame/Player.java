package baseballGame;

public class Player {
	private int score;
	
	public int getScore() {
		return this.score;
	}
	
	public void addScore(int num) {
		this.score += num;
	}
	
	public void resetPlayer() {
		this.score = 0;
	}
}
