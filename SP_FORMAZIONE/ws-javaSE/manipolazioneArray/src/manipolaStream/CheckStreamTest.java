package manipolaStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CheckStreamTest {

	@Test
	void emptyString() {
		CheckStream cs = new CheckStream();
		String s = "";
		String msg = cs.soluzione(s);
		String methodInput = "invalid input";
		assertEquals(methodInput, msg);
	}
	
	@Test
	void goodString() {
		CheckStream cs = new CheckStream();
		String s = "1994-12-01 845 very-long-filename.rar ";
		String msg = cs.soluzione(s);
		String count = "1";
		assertEquals(count, msg);
	}
	
	@Test
	void badStringDate() {
		CheckStream cs = new CheckStream();
		String s = "2004-12-01 845 very-long-filename.rar ";
		String msg = cs.soluzione(s);
		String methodInput = "invalid input";
		assertEquals(methodInput, msg);
	}
	
	@Test
	void badStringDimension() {
		CheckStream cs = new CheckStream();
		String s = "1994-12-01 265329 very-long-filename.rar ";
		String msg = cs.soluzione(s);
		String methodInput = "invalid input";
		assertEquals(methodInput, msg);
	}
	
	@Test
	void badStringPath() {
		CheckStream cs = new CheckStream();
		String s = "1994-12-01 845 very-long-filename.csv ";
		String msg = cs.soluzione(s);
		String methodInput = "invalid input";
		assertEquals(methodInput, msg);
	}

}
