package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Game;
import baseballGame.Player;

class playersCreated extends Player {

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
