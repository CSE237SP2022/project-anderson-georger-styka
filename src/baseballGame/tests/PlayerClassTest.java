package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Game;
import baseballGame.Player;

class PlayerClassTest extends Player {

	Game game = new Game();
	Player player = new Player();
	int magicNumber = 4; //arbitrary number for testing
	
	
	@Test
	void player1CreatedTest() {
		game = new Game();
		assertNotNull(game.player1);
	}
	
	@Test
	void player2CreatedTest() {
		game = new Game();
		assertNotNull(game.player2);
	}
	
	@Test
	void Runner1UpdateTest() {
		player.addScore(1); //put runner on first base
		player.addScore(2);
		assertEquals( player.one.getPosition(), 3);
		assertEquals( player.two.getPosition(), 2);
	}
	
	@Test
	void Runner2UpdateTest() {
		player.addScore(4); //hit home run
		assertEquals( player.one.getPosition(), 0);
	}
	
	@Test
	void Runner3UpdateTest() {
		player.addScore(2); //hit double
		player.addScore(1); //hit single
		assertEquals( player.one.getPosition(), 3);
		assertEquals( player.two.getPosition(), 1);
	}
	
	@Test
	void Runner4UpdateTest() {
		player.addScore(1); //hit single
		player.addScore(2); //hit double
		player.addScore(1); //hit single
		assertEquals( player.one.getPosition(), 0);
		assertEquals( player.two.getPosition(), 3);
		assertEquals( player.three.getPosition(), 1);
	}
	
	@Test
	void Runner5UpdateTest() {
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		assertEquals( player.one.getPosition(), 3);
		assertEquals( player.two.getPosition(), 2);
		assertEquals( player.three.getPosition(), 1);
	}
	
	@Test
	void Runner6UpdateTest() {
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		player.addScore(2); //hit double
		assertEquals( player.one.getPosition(), 0);
		assertEquals( player.two.getPosition(), 0);
		assertEquals( player.three.getPosition(), 3);
		assertEquals( player.four.getPosition(), 2);
	}
	
	@Test
	void scoreAddedtoPlayer1Test() {
		int initialScore = player.getScore();
		player.addScore(magicNumber);
		int finalScore = player.getScore();
		
		assertEquals(initialScore + 1, finalScore);
	}
	
	@Test
	void scoreAddedtoPlayer2Test() {
		int initialScore = player.getScore();
		player.addScore(1);
		player.addScore(3);
		player.addScore(1);
		player.addScore(2);
		int finalScore = player.getScore();
		
		assertEquals(initialScore + 2, finalScore);
	}
	
	@Test
	void scoreAddedtoPlayer3Test() {
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
	
	@Test
	void getRunnerPosTest() {
		player.addScore(1);
		player.addScore(1);
		player.addScore(1);
		int[] pos = {3, 2, 1, 0};
		assertEquals(player.getRunnerPos()[2], pos[2]);
	}
	
	@Test
	void resetRunnersPosTest() {
		player.addScore(2);
		player.addScore(1);
		player.addScore(4);
		player.addScore(1);
		player.addScore(2);
		player.addScore(1);
		player.resetRunners();
		int[] pos = {0, 0, 0, 0};
		
		assertEquals(player.getRunnerPos()[3], pos[3]);
	}
	
	@Test
	void addScoreHelperPositionTest() {
		player.addScoreHelper(player.one, 3);
		assertEquals(player.one.getPosition(), 3);
	}
	
	@Test
	void addScoreHelperScoreTest() {
		player.addScoreHelper(player.one, 4);
		assertEquals(player.getScore(), 1);
	}
	
	@Test
	void resetPlayerTest() {
		player.addScore(2);
		player.addScore(1);
		player.addScore(4);
		player.addScore(1);
		player.addScore(2);
		player.addScore(1);
		player.addScore(3);
		player.resetPlayer();
		
		assertEquals(player.getScore(), 0);
	}
	

}
