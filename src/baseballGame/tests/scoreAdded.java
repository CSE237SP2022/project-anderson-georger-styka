package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Player;

class scoreAdded extends Player {

	int magicNumber = 4; //arbitrary number for testing
	Player player = new Player();
	
	@Test
	void scoreAddedtoPlayer1() {
		int initialScore = player.getScore();
		player.addScore(magicNumber);
		int finalScore = player.getScore();
		
		assertEquals(initialScore + 1, finalScore);
	}
	
	@Test
	void scoreAddedtoPlayer2() {
		int initialScore = player.getScore();
		player.addScore(1);
		player.addScore(3);
		player.addScore(1);
		player.addScore(2);
		int finalScore = player.getScore();
		
		assertEquals(initialScore + 2, finalScore);
	}
	
	@Test
	void scoreAddedtoPlayer3() {
		int initialScore = player.getScore();
		player.addScore(2);
		player.addScore(1);
		player.addScore(4);
		player.addScore(1);
		player.addScore(2);
		player.addScore(1);
		int finalScore = player.getScore();
		
		assertEquals(initialScore + 4, finalScore);
	}

}
