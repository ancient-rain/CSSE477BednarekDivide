package edu.rosehulman.csse477.calculator.bednartd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {

	@Test
	public void testExecute() {
		Divide subtract = new Divide();
		
		double expected = 1;
		double actual = subtract.execute(4, 5, 5);
		
		assertEquals(expected, actual, 0.000001);
	}

}
