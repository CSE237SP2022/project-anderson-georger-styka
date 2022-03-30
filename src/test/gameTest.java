package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Game;

class gameTest {
	
	Game game;

//	@BeforeEach
//	public void setup() {
//		game = new Game();
//	}

	@Test
	void player1Created() {
		game = new Game();
		assertNotNull(game.player1);
	}
	
	@Test
	void player2Created() {
		game = new Game();
		assertNotNull(game.player2);
	}

}