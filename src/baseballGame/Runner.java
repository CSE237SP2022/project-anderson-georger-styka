package baseballGame;

//Class to hold runner objects that store position and return if a run scored
public class Runner {
	private int position = 0;
	
	
	public Boolean updatePosition(int pos) {
		this.position += pos;
		if(this.position < 4) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int getPosition() {
//		System.out.print(this.position);
		return this.position;
	}

	public void reset(){
		this.position = 0;
	}

}
