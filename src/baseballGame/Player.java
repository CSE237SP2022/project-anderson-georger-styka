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
			if(one.updatePosition(num)){
				this.score ++;
				one.reset();
			}
			return;
		}
		else if(two.getPosition() == 0){
			if(one.updatePosition(num)){
				this.score ++;
				one.reset();
			}
			if(two.updatePosition(num)){
				this.score ++;
				two.reset();
			}
			return;
		}
		else if(three.getPosition() == 0){
			if(one.updatePosition(num)){
				this.score ++;
				one.reset();
			}
			if(two.updatePosition(num)){
				this.score ++;
				two.reset();
			}
			if(three.updatePosition(num)){
				this.score ++;
				three.reset();
			}
			return;
		}
		else if(four.getPosition() == 0){
			if(one.updatePosition(num)){
				this.score ++;
				one.reset();
			}
			if(two.updatePosition(num)){
				this.score ++;
				two.reset();
			}
			if(three.updatePosition(num)){
				this.score ++;
				three.reset();
			}
			if(four.updatePosition(num)){
				this.score ++;
				four.reset();
			}
			return;
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
