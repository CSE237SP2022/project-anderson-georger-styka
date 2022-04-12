package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Player;

class scoreAdded extends Player {

	int magicNumber = 9; //arbitrary number for testing
	
	@Test
	void scoreAddedtoPlayer() {
		Player player = new Player();
		int initialScore = player.getScore();
		player.addScore(magicNumber);
		int finalScore = player.getScore();
		
		assertEquals(initialScore + magicNumber, finalScore);
	}

}
