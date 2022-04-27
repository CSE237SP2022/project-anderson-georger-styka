package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Game;
import baseballGame.Runner;

class RunnerClassTest extends Runner {
	
	Runner runner = new Runner();

	@Test
	void updateRunnerTrueTest() {
		assertEquals(runner.updatePosition(4), true);
	}
	
	@Test
	void updateRunnerFalseTest() {
		assertEquals(runner.updatePosition(2), false);
	}
	
	@Test
	void getPositionTest() {
		Game game = new Game();
		game.updatePlay1Score(2);
		assertEquals(game.player1.one.getPosition(), 2);
	}
	
	@Test
	void getPosition2Test() {
		Game game = new Game();
		game.updatePlay1Score(1);
		game.updatePlay1Score(2);
		assertEquals(game.player1.one.getPosition(), 3);
	}
	
	@Test
	void resetRunnerTest() {
		Game game = new Game();
		game.updatePlay1Score(1);
		game.updatePlay1Score(2);
		game.player1.one.reset();
		assertEquals(game.player1.one.getPosition(), 0);
	}

}
