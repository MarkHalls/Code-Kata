package com.romannumeral;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mh353f on 10/24/2016.
 */
public class RomanNumeral {
	int number;
	StringBuilder numeral = new StringBuilder();
	private Map<String, Integer> romanNumeralMap = new HashMap<>();

	private void init() {
		romanNumeralMap.put( " I", 1 );
		romanNumeralMap.put( " V", 5 );
		romanNumeralMap.put( " X", 10 );
		romanNumeralMap.put( " L", 50 );
		romanNumeralMap.put( " C", 100 );
		romanNumeralMap.put( " D", 500 );
		romanNumeralMap.put( " M", 1000 );
	}

	RomanNumeral( int number ) {
		init();
		this.number = number;
	}

	RomanNumeral( String numeral ) {
		init();
		this.numeral.append( numeral );
	}

	@Override
	public String toString() {
		int magnitude = 1000;
		while ( magnitude >= 1 ){
		int positionValue = (int) ( number % ( magnitude * 10f ) / magnitude );
		for ( Map.Entry<String, Integer> entry : romanNumeralMap.entrySet() ) {
				if ( entry.getValue() / magnitude > 0 ) {

					}
					numeral.append( entry.getKey() );
					}
				}
			magnitude /= 10;
			}
		return numeral.toString();
		}
	}

