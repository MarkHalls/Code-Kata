package com.romannumeral;

/**
 * Created by mh353f on 10/24/2016.
 */
public class RomanNumeral {
    int number;
    String numeral;

    RomanNumeral(int number) {
        this.number = number;
    }

    RomanNumeral(String numeral) {
        this.numeral = numeral;
    }

    private String formatString(int magnitude, String tens, String fivs, String ones) {
        int position = (int) (number % (magnitude * 10f) / magnitude);

        switch (position) {
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
        int tempNumber = 0;
        for (int position = 0; position < numeral.length(); position++) {
            if ((numeral.length() - position) >= 2) {
                String tempNumeral = String.valueOf(( numeral.charAt(position) + numeral.charAt(position + 1)));
                System.out.println(tempNumeral);
                switch ( tempNumeral ){
                    case "CM":
                        tempNumber += 900;
                        break;
                    case "CD":
                        tempNumber += 400;
                        break;
                    case "LC":
                        tempNumber += 90;
                        break;
                    case "XL":
                        tempNumber += 40;
                        break;
                    case "IX":
                        tempNumber += 9;
                        break;
                    default:
                        tempNumeral = String.valueOf(numeral.charAt(position));
                        switch (tempNumeral) {
                            case "M":
                                tempNumber += 1000;
                                break;
                            case "D":
                                tempNumber += 500;
                                break;
                            case "C":
                                tempNumber += 100;
                                break;
                            case "L":
                                tempNumber += 50;
                                break;
                            case "X":
                                tempNumber += 10;
                                break;
                            case "V":
                                tempNumber += 5;
                                break;
                            case "I":
                                tempNumber += 5;
                                break;
                            default:
                                break;
                        }
                }
            }
                if ((numeral.length() - position) <= 1) {
                    String tempNumeral = String.valueOf(numeral.charAt(position));
                    switch (tempNumeral) {
                        case "M":
                            tempNumber += 1000;
                            break;
                        case "D":
                            tempNumber += 500;
                            break;
                        case "C":
                            tempNumber += 100;
                            break;
                        case "L":
                            tempNumber += 50;
                            break;
                        case "X":
                            tempNumber += 10;
                            break;
                        case "V":
                            tempNumber += 5;
                            break;
                        case "I":
                            tempNumber += 5;
                            break;
                        default:
                            break;
                    }

                }

            }
        return tempNumber;
    }
}
