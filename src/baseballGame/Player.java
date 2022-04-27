package baseballGame;


public class Player {
	private int score;
	public Runner one = new Runner();
	public Runner two = new Runner();
	public Runner three = new Runner();
	public Runner four = new Runner();
	
	public int getScore() {
		return this.score;
	}
	
	//Updates the score of the game using the position of the runners.
	//It updates the position of four runners bases on how many bases the hitter got
	//If the runner position is updated to 4 or more the score gets updated
	public void addScore(int num) {
		if(one.getPosition() == 0){
			this.addScoreHelper(one, num);
			return;
		}
		else if(two.getPosition() == 0){
			this.addScoreHelper(one, num);
			this.addScoreHelper(two, num);
			return;
		}
		else if(three.getPosition() == 0){
			this.addScoreHelper(one, num);
			this.addScoreHelper(two, num);
			this.addScoreHelper(three, num);
			return;
		}
		else if(four.getPosition() == 0){
			this.addScoreHelper(one, num);
			this.addScoreHelper(two, num);
			this.addScoreHelper(three, num);
			this.addScoreHelper(four, num);
			return;
		}
	}

	public void addScoreHelper (Runner r, int num) {
		if(r.updatePosition(num)){
			this.score ++;
			r.reset();
		}
	}
	public int[] getRunnerPos() {
		int[] t = {this.one.getPosition(), this.two.getPosition(), this.three.getPosition(), this.four.getPosition()};
		return t;
	}
	
	public void resetRunners() {
		one.reset();
		two.reset();
		three.reset();
		four.reset();
	}
	
	public void resetPlayer() {
		this.score = 0;
	}
}
