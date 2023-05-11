package manipolazioneJavaIo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReaderDemoTest {

	@Test
	void testStringReader() {
		ReaderFileDemo rd = new ReaderFileDemo();
		assertEquals("Riga 1fRiga 2ciao", rd.readFileChar());
	}

}
