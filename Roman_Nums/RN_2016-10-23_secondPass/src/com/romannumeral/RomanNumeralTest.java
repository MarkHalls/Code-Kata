package com.romannumeral;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralTest {
	@Test
	public void whenInteger1987ThenReturnMCMLXXXVII(){
		Assert.assertEquals( "MCMLXXXVII", new RomanNumeral( 1987 ).toString() );
	}
}