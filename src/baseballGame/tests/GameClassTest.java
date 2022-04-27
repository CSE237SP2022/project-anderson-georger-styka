package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Game;

class GameClassTest extends Game {

	Game game = new Game();
	
	
	@Test
	void getTurnNumTest() {
		assertEquals( game.getTurnNum(), 0);
		
	}
	
	@Test
	void getPlayerTurnTest() {
		assertEquals( game.getPlayerTurn(), true);
	}
	
	@Test
	void getPlayer1ScoreTest() {
		assertEquals( game.getPlayer1Score(), 0);
	}
	
	@Test
	void getPlayer2ScoreTest() {
		assertEquals( game.getPlayer2Score(), 0);
	}
	
	@Test
	void updatePlay1ScoreTest() {
		game.updatePlay1Score(4);
		assertEquals( game.getPlayer1Score(), 1);
	}
	
	@Test
	void updatePlay2ScoreTest() {
		game.updatePlay2Score(3);
		game.updatePlay2Score(2);
		game.updatePlay2Score(3);
		assertEquals( game.getPlayer2Score(), 1);
	}
	
	@Test
	void updatePlay1ScoreOutTest() {
		game.updatePlay2Score(0);
		game.updatePlay2Score(0);
		assertEquals( game.getOuts(), 2);
	}
	
	@Test
	void nextTurnPlayerTest() {
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		assertEquals( game.getPlayerTurn(), false);
	}
	
	@Test
	void nextTurnOutsTest() {
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		assertEquals( game.getOuts(), 0);
	}
	
	@Test
	void nextTurnTest() {
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		game.updatePlay2Score(0);
		game.updatePlay2Score(0);
		game.updatePlay2Score(0);
		game.nextTurn();
		assertEquals( game.getTurnNum(), 1);
	}
	
	@Test
	void batterOutcomeTest() {
		int ret = game.batterOutcome();
		assertNotNull(ret);
	}
	
	@Test
	void getRunnersP1Test() {
		game.updatePlay1Score(2);
		game.updatePlay1Score(1);
		int[] positions = {3, 1, 0, 0};
		assertEquals(game.getRunnersP1()[1], positions[1]);
	}
	
	@Test
	void getRunnersP2Test() {
		game.updatePlay2Score(1);
		game.updatePlay2Score(2);
		int[] positions = {3, 2, 0, 0};
		assertEquals(game.getRunnersP2()[0], positions[0]);
	}
	
	@Test
	void getOutsTest() {
		game.updatePlay1Score(0);
		assertEquals(game.getOuts(), 1);
	}
	
	@Test
	void resetGameOutsTest() {
		game.updatePlay1Score(0);
		game.updatePlay1Score(3);
		game.updatePlay1Score(2);
		game.updatePlay1Score(0);
		game.updatePlay1Score(1);
		game.resetGame();
		assertEquals(game.getOuts(), 0);
	}
	
	@Test
	void resetGameTurnTest() {
		game.updatePlay1Score(0);
		game.updatePlay1Score(3);
		game.updatePlay1Score(2);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		game.updatePlay1Score(0);
		game.updatePlay1Score(2);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		game.resetGame();
		assertEquals(game.getTurnNum(), 0);
	}
	
	@Test
	void resetGamePlayerTurnTest() {
		game.updatePlay1Score(0);
		game.updatePlay1Score(3);
		game.updatePlay1Score(2);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		game.updatePlay1Score(0);
		game.updatePlay1Score(2);
		game.updatePlay1Score(0);
		game.updatePlay1Score(0);
		game.nextTurn();
		game.resetGame();
		assertEquals(game.getPlayerTurn(), true);
	}
	

}
