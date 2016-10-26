package com.romannumeral;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by mh353f on 10/24/2016.
 */
public class RomanNumeralTest {
    @Test
    public void toStringTest(){
        assertEquals( "MCMLXXXVII", new RomanNumeral(1987).toString() );
    }

}