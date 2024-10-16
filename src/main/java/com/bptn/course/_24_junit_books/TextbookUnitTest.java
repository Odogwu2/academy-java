package com.bptn.course._24_junit_books;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TextbookUnitTest {

	@Test
	//this test case verifies the correctness of the getTitle() method of the Textbook class. 
	public void testGetTitle() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science", tb.getTitle());
	}

	@Test
	//this test case verifies the correctness of the getEdition() method of the Textbook class.
	public void testGetEdition() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals(9, tb.getEdition());
	}

	@Test
	//this test case verifies the correctness of the getBookInfo() method of the Textbook class.
	public void testGetBookInfo() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science-14.99-9", tb.getBookInfo());
	}

	@Test
	//this test case verifies the correctness of the canSubstitute for() method of the Textbook class.
	//when the two textbooks can substitute for each other. 
	public void testCanSubstituteFor_canSubstitute() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Computer Science", 19.99, 2);
		assertEquals(true, tb.canSubstituteFor(tb2));
	}

	
	@Test
	//this test case verifies the correctness of the canSubstitute for() method of the Textbook class.
	//when the two textbooks CANNOT substitute for each other. 
	public void testCanSubstituteFor_cannotSubstitute() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
		assertEquals(false, tb.canSubstituteFor(tb2));
	}

}
