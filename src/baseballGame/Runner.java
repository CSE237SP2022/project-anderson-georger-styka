package baseballGame;

//Class to hold runner objects that store position and return if a run scored
public class Runner {
	private int position;
	
	
	public Boolean updatePosition(int pos) {
		this.position += pos;
		if(this.position < 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getPosition() {
		return this.position;
	}

}
