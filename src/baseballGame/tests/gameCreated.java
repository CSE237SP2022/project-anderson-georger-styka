package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Game;

class gameCreated extends Game {

	@Test
	void testGameCreation() {
		Game game = new Game();
		assertEquals( game.getTurnNum(), 0);
	}
}
