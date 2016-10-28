package com.romannumeral;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mh353f on 10/24/2016.
 */
public class RomanNumeral {
    int number;
    String numeral;
	private Map<String, Integer> numerals1 = new HashMap<>();

	private void init(){
		numerals1.put(  "I",    1 );
		numerals1.put( "IV",    4 );
		numerals1.put(  "V",    5 );
		numerals1.put( "IX",    9 );
		numerals1.put(  "X",   10 );
		numerals1.put( "XL",   40 );
		numerals1.put( "XC",   90 );
		numerals1.put(  "C",  100 );
		numerals1.put( "CD",  400 );
		numerals1.put(  "D",  500 );
		numerals1.put( "CM",  900 );
		numerals1.put(  "M", 1000 );
	}

    RomanNumeral(int number) {
        init();
	    this.number = number;
    }

    RomanNumeral(String numeral) {
	    init();
	    this.numeral = numeral;
    }

    private String formatString(int magnitude, String tens, String fivs, String ones) {
        int positionValue = (int) (number % (magnitude * 10f) / magnitude);

	    for ( Map.Entry<String, Integer> entry : numerals1.entrySet() ){
	        if ( positionValue == entry.getValue() ) {
		        numeral += entry.getKey();
	        }
    }
        switch (positionValue) {
            case 1:
                return ones;
            case 2:
                return ones + ones;
            case 3:
                return ones + ones + ones;
            case 4:
                return ones + fivs;
            case 5:
                return fivs;
            case 6:
                return fivs + ones;
            case 7:
                return fivs + ones + ones;
            case 8:
                return fivs + ones + ones + ones;
            case 9:
                return ones + tens;
            default:
                return "";
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        while (number > 1000) {
            builder.append("M");
            number -= 1000;
        }

        builder.append(formatString(100, "M", "D", "C"));
        builder.append(formatString(10, "C", "L", "X"));
        builder.append(formatString(1, "X", "V", "I"));
        return builder.toString();
    }



    public int toInt() {


}
