package com.romannumeral;

//==============================================================================
public class Number {
	private int storedNumber;
	StringBuilder builder = new StringBuilder();
	//--------------------------------------------------------------------------
	public void setNumber( int myNumber ){
		storedNumber = myNumber;
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	public int getNumber() {
		return storedNumber;
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	public void calculateStored( int modulus, String tens, String fives, String ones) {
		int tempNumber = storedNumber % (modulus * 10) / modulus;
		if ( tempNumber > 0 && tempNumber < 4 ) {
			for ( int i = 0; i < tempNumber; i++ ) {
				builder.append( ones );
			}
		}
		if ( tempNumber == 4 ) {
			builder.append( ones ).append( fives );
		}
		if ( tempNumber == 5 ) { builder.append( fives ); }
		if ( tempNumber > 5 && tempNumber < 9 ) {
			builder.append( fives );
			for ( int i = 0; i < tempNumber - 5; i++ ) {
				builder.append( ones );
			}
		}
		if ( tempNumber == 9 ) {
			builder.append( ones ).append( tens );
		}
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	public void convertToRomanNumeral(){
		//int magnitude = (int) Math.pow( 10.0, Integer.toString( storedNumber ).length() - 1 );

		while ( storedNumber >= 1000 ){
			builder.append( "M" );
			storedNumber -= 1000;
		}

		calculateStored( 100, "M", "D", "C");
		calculateStored( 10, "C", "L", "X" );
		calculateStored( 1, "X", "V", "I" );
		System.out.println(builder);
	}

}
//------------------------------------------------------------------------------
