package baseballGame;


public class Player {
	private int score;
	private Runner one;
	private Runner two;
	private Runner three;
	private Runner four;
	
	public int getScore() {
		return this.score;
	}
	
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
	
	public void resetPlayer() {
		this.score = 0;
	}
}
