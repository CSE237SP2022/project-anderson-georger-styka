package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class gameTest {


	@BeforeEach
	public void setup() {
		game = new Game();
		knownWords = new KnownWords();
	}

	@Test
	//TASK #1
	void testNumWordsKnown() {
		int testNumWords = knownWords.length;
		//would have a getter for the words known in our spellchecker
		int getterNumWords = spellcheck.getNumWordsKnown();
		assertEquals(testNumWords, getterNumWords, 0.05);
	}

	//TASK #2
	//assuming that our addWord(word) function handles the case in which
	//		a user tries to add an existing word to the spellchecker list,
	//		it will refrain from doing so if it is a repeated word and return 0.
	//		If it successfully adds a new word, then it returns 1.
	@Test
	void testAddWord() {
		int initialWordCount = spellcheck.getNumWordsKnown();
		// addWord(word) will return 1 upon successfully adding a new word,
		//		and will return 0 otherwise
		if(spellcheck.addWord(word)) {
			int finalWordCount = spellcheck.getNumWordsKnown();
			assertEquals(initialWordCount + 1, finalWordCount, 0.05);
		}
	}
	
	
	//TASK #3
	@Test
	void testAddWord() {
		int initialWordCount = spellcheck.getNumWordsKnown();
		// addWord(word) will return 1 upon successfully adding a new word,
		//		and will return 0 otherwise
		if(!(spellcheck.addWord(word))) {
			int finalWordCount = spellcheck.getNumWordsKnown();
			assertEquals(initialWordCount + 1, finalWordCount, 0.05);
		}
	}
	
	//TASK #4
	@Test
	void testProperlySpelledWord() {
		// useSpellcheck(word) will process the word through the entire spellcheck mechanism
		//		upon completion, it will return 1 if the word entered was spelled correctly
		//		if the spellchecker detects incorrect spelling, then it will return 0
		int testSpelling = spellcheck.useSpellcheck(word);
		assertEquals(testSpelling, 1, 0.05);
	}
	
	
	//TASK #5
	@Test
	void testImproperlySpelledWord() {
		// useSpellcheck(word) will process the word through the entire spellcheck mechanism
		//		upon completion, it will return 1 if the word entered was spelled correctly
		//		if the spellchecker detects incorrect spelling, then it will return 0
		int testSpelling = spellcheck.useSpellcheck(word);
		assertEquals(testSpelling, 0, 0.05);
	}
	
	
	//TASK #6
	// for this test, we assume that our spellchecker's array of words are all spelled with lowercase letters
	@Test
	void testCaseSensitivity() {
		int originalCaseWord = spellcheck.useSpellcheck(word);
		int allLowercase = originalCaseWord.toLowerCase();
		int finalWord = spellcheck.useSpellcheck(word);
		assertEquals(originalCaseWord, finalWord, 0.05);
	}
	
	
	//TASK #7
	@Test
	void testRecommendedWordForMisspelled() {
		//recommendWord(word) will process the word through the entire spellcheck mechanism
		//		upon completion, it will return the same String that was provided as a parameter
		//			if the word is spelled correctly and found in the spellcheck array of words
		//		it will return a recommended word as a String if the provided word is misspelled.
		//			this recommended word will be the closest word alphabetically to the provided word
		boolean wordCheckInArray = false;
		String recommendedString = spellcheck.recommendWord(word);
		for(int i = 0; i < knownWords.length; i++) {
			if(knownWords[i].equals(recommendedString)) {
				wordCheckInArray = true;
			}
		}
		if(wordCheckInArray) {
			assertNotEquals(recommendedString, word, 0.05);
		}
		else {
			fail("recommended word was not found in list of known words.");
		}
		// confirms that recommended word was different than input word, and is in the spellchecker known words list
		// the spellchecker takes care of finding the closest alphabetically-ordered word in recommendedWord(word)
	}
	
	
	//TASK #8
	@Test
	void testRecommendedWordForCorrect() {
		//recommendWord(word) will process the word through the entire spellcheck mechanism
		//		upon completion, it will return the same String that was provided as a parameter
		//			if the word is spelled correctly and found in the spellcheck array of words
		//		it will return a recommended word as a String if the provided word is misspelled.
		//			this recommended word will be the closest word alphabetically to the provided word
		String recommendedString = spellcheck.recommendWord(word);
		for(int i = 0; i < knownWords.length; i++) {
			if(knownWords[i].equals(recommendedString)) {
				fail("word found in spellcheck dictionary, unsuccessful recommendation");
			}
		}
		assertEquals(recommendedString, word, 0.05);
		// confirms that recommended word was different than input word, and is in the spellchecker known words list
		// the spellchecker takes care of finding the closest alphabetically-ordered word in recommendedWord(word)
	}

}