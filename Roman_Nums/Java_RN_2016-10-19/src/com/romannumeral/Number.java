package com.romannumeral;
//MCMXCIX
//==============================================================================
public class Number {

	private int storedNumber;
	private String myNumeral = "";
	private int numeralMultiplier;

	//--------------------------------------------------------------------------
	public Number( int storedNumber ){
		this.storedNumber = storedNumber;

	}
	public void calculate(){
		System.out.println( storedNumber );
	}

	public String intToString(){
		return Integer.toString( storedNumber );
	}

	public void showStringLength(){
		System.out.println(intToString().length());
	}
	public int getStringLength(){
		return intToString().length();
	}

	public void expandMultiplierToNumeral( String onesPlace, String fivesPlace, String tensPlace ){
		if ( numeralMultiplier < 4 && numeralMultiplier > 0 )
			for ( int i = 0; i < numeralMultiplier; i++ ) {
				myNumeral += onesPlace;
			}
		if ( numeralMultiplier == 4 ) {
			myNumeral += onesPlace;
			myNumeral += fivesPlace;
		}
		if ( numeralMultiplier == 5 ) {
			myNumeral += fivesPlace;
		}
		if ( numeralMultiplier > 5 && numeralMultiplier < 9 ) {
			myNumeral += fivesPlace;
			for ( int i = 0; i < numeralMultiplier - 1; i++ ) {
				myNumeral += onesPlace;
			}
		}
		if ( numeralMultiplier == 9 ) {
			myNumeral += onesPlace;
			myNumeral += tensPlace;
		}
	}

	public void calculateNumeral(){
		switch ( getStringLength() ){
			case 4:
				numeralMultiplier = storedNumber / 1000;
				expandMultiplierToNumeral( "M", "MMMMM", "Error2" );
				storedNumber %= 1000;

			case 3:
				numeralMultiplier = storedNumber / 100;
				expandMultiplierToNumeral( "C", "D", "M" );
				storedNumber %= 100;

			case 2:
				numeralMultiplier = storedNumber / 10;
				expandMultiplierToNumeral( "X", "L", "C" );
				storedNumber %= 10;

			case 1:
				numeralMultiplier = storedNumber / 1;
				expandMultiplierToNumeral( "I", "V", "X" );

		}
		System.out.println(myNumeral);
	}
	//--------------------------------------------------------------------------
}
//------------------------------------------------------------------------------
