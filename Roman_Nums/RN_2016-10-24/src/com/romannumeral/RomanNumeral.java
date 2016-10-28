package com.romannumeral;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mh353f on 10/24/2016.
 */
public class RomanNumeral {
	int number;
	String ones;
	String fivs;
	String tens;

	private Map<String, Integer> romanNumeralMap = new HashMap<>();
	private Map<Integer, String> numberMap = new HashMap<>();

	private void init() {
		numberMap.put( 1, ones                  );
		numberMap.put( 2, ones + ones           );
		numberMap.put( 3, ones + ones + ones    );
		numberMap.put( 4, ones + fivs           );
		numberMap.put( 5, fivs                  );
		numberMap.put( 6, fivs + ones           );
		numberMap.put( 7, fivs + ones + ones    );
		numberMap.put( 8, fivs + ones + ones    );
		numberMap.put( 9, ones + tens           );

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
		StringBuilder numeral = new StringBuilder();
		int magnitude = 1000;

		int positionValue = (int) ( number % ( magnitude * 10f ) / magnitude );

		switch ( positionValue ) {
			case 1:


		}



					for ( Map.Entry<String, Integer> entry : romanNumeralMap.entrySet() ) {



//				if ( romanNumeralMap.getOrDefault(  ) ) {

//					}
//					numeral.append( entry.getKey() );
//					}
//			magnitude /= 10;
//				}
//		return numeral.toString();
			}
		}
	}

