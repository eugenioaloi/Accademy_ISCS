package checkString;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class CheckStringTest {

	@Test
	void  checkStringTest() {
		String s = "123 ciao 0.2";
		
		assertTrue(CheckString.checkString(s));
	}

}
