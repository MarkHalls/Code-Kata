package com.romannumeral;

//==============================================================================
public class KataApp {
	//--------------------------------------------------------------------------
	public static void main( String[] args ) {
		RomanNumeral numeral = new RomanNumeral();
		System.out.println(numeral.set( 1999 ).toString() );
		RomanNumeral num = new RomanNumeral();
		System.out.println(num.set( 23331 ).toString() );

	}
	//--------------------------------------------------------------------------
}
//------------------------------------------------------------------------------
