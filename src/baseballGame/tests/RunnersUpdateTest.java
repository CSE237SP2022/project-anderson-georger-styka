package baseballGame.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import baseballGame.Player;

class RunnersUpdateTest extends Player {

	Player player = new Player();
	@Test
	void Runner1Update() {
		player.addScore(1); //put runner on first base
		player.addScore(2);
		assertEquals( player.one.getPosition(), 3);
		assertEquals( player.two.getPosition(), 2);
	}
	
	@Test
	void Runner2Update() {
		player.addScore(4); //hit home run
		assertEquals( player.one.getPosition(), 0);
	}
	
	@Test
	void Runner3Update() {
		player.addScore(2); //hit double
		player.addScore(1); //hit single
		assertEquals( player.one.getPosition(), 3);
		assertEquals( player.two.getPosition(), 1);
	}
	
	@Test
	void Runner4Update() {
		player.addScore(1); //hit single
		player.addScore(2); //hit double
		player.addScore(1); //hit single
		assertEquals( player.one.getPosition(), 0);
		assertEquals( player.two.getPosition(), 3);
		assertEquals( player.three.getPosition(), 1);
	}
	
	@Test
	void Runner5Update() {
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		assertEquals( player.one.getPosition(), 3);
		assertEquals( player.two.getPosition(), 2);
		assertEquals( player.three.getPosition(), 1);
	}
	
	@Test
	void Runner6Update() {
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		player.addScore(1); //hit single
		player.addScore(2); //hit double
		assertEquals( player.one.getPosition(), 0);
		assertEquals( player.two.getPosition(), 0);
		assertEquals( player.three.getPosition(), 3);
		assertEquals( player.four.getPosition(), 2);
	}

}
