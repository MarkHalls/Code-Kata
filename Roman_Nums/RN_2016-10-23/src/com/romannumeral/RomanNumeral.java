package com.romannumeral;

//==============================================================================
public class RomanNumeral {
	//--------------------------------------------------------------------------
	private int number;
	private StringBuilder builder = new StringBuilder();

	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	RomanNumeral set( int number ) {
		this.number = number;
		return this;
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	private void stringFormatter( int magnitude, String tens, String fivs, String ones ) {
		int position = (int) (number % ( magnitude * 10f ) / magnitude);

		switch ( position ) {
			case 1:
				builder.append( ones );
				break;
			case 2:
				builder.append( ones ).append( ones );
				break;
			case 3:
				builder.append( ones ).append( ones ).append( ones );
				break;
			case 4:
				builder.append( ones ).append( fivs );
				break;
			case 5:
				builder.append( fivs );
				break;
			case 6:
				builder.append( fivs ).append( ones );
				break;
			case 7:
				builder.append( fivs ).append( ones ).append( ones );
				break;
			case 8:
				builder.append( fivs ).append( ones ).append( ones ).append( ones );
				break;
			case 9:
				builder.append( ones ).append( tens );
				break;
		}
	}
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	@Override public String toString() {
		while( number > 1000 ) {
			builder.append( "M" );
			number -= 1000;
		}
		stringFormatter( 100, "M", "D", "C" );
		stringFormatter( 10, "C", "L", "X" );
		stringFormatter( 1, "X", "V", "I" );
		return builder.toString();
	}


}
//------------------------------------------------------------------------------
