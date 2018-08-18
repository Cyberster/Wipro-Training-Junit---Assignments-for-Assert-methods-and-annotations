package com.w3epic.wiprotraining.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {
	MyUnit myunit = new MyUnit();

	@Test
	public void testPalindromeCheck() {
//		assertEquals("Result:", true, myunit.palindromeCheck("madam"));
//		assertEquals("Result:", true, myunit.palindromeCheck("mom"));
//		assertEquals("Result:", true, myunit.palindromeCheck("dad"));
//		assertEquals("Result:", true, myunit.palindromeCheck("malayalam"));
//		assertEquals("Result:", false, myunit.palindromeCheck("kerala"));
		assertTrue("Result: ", myunit.palindromeCheck("madam"));
		assertTrue("Result: ", myunit.palindromeCheck("mom"));
		assertTrue("Result: ", myunit.palindromeCheck("dad"));
		assertTrue("Result: ", myunit.palindromeCheck("malayalam"));
		assertFalse("Result: ", myunit.palindromeCheck("kerala"));
		assertFalse("Result: ", myunit.palindromeCheck("india"));
	}

}
