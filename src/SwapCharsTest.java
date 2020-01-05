import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharsTest {

	@Test
	void swapstringwith2chars() {
		assertEquals("AB", SwapChar.Swap2("BA"));

	}

	@Test
	void swapstringwith6chars() {
		assertEquals("fe", SwapChar.Swap2("abcdef"));

	}

	@Test
	void swapstringwith1chars() {
		assertEquals("1", SwapChar.Swap2("1"));

	}

	@Test
	void swapemptystring() {
		assertEquals("", SwapChar.Swap2(""));
	}
}