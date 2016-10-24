package com.romannumeral;

//==============================================================================
public class RomanNumeral {
	//--------------------------------------------------------------------------
	private int number;
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	RomanNumeral( int number ){
		this.number = number;
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	private String formatString( int magnitude, String tens, String fivs, String ones ){
		int position = (int) (number % ( magnitude * 10f ) / magnitude);

		switch ( position ) {
			case 1:	 return ones;
			case 2:	 return ones + ones;
			case 3:	 return ones + ones + ones;
			case 4:	 return ones + fivs;
			case 5:	 return fivs;
			case 6:	 return fivs + ones;
			case 7:	 return fivs + ones + ones;
			case 8:	 return fivs + ones + ones + ones;
			case 9:	 return ones + tens;
			default: return "";
		}
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	@Override public String toString(){
		StringBuilder builder = new StringBuilder();

		while( number > 1000 ) {
			builder.append( "M" );
			number -= 1000;
		}

		builder.append( formatString( 100, "M","D","C" ) );
		builder.append( formatString( 10, "C","L","X" ) );
		builder.append( formatString( 1, "X","V","I" ) );
		return builder.toString();
	}
	//--------------------------------------------------------------------------
}
//------------------------------------------------------------------------------
