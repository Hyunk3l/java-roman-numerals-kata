package com.hyunkel.romannumerals;

public class RomanNumeralsGenerator {

    public static String romanFor(int decimal) {
        String roman = "";
        for (RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            while(decimal >= romanToDecimal.decimal) {
                roman += romanToDecimal.roman;
                decimal -= romanToDecimal.decimal;
            }
        }
        return roman;
    }

    public static int decimalFor(String roman) {
        int decimal = 0;

        while (!roman.isEmpty()) {
            for(DecimalToRoman decimalToRoman : DecimalToRoman.values()) {
                if(roman.contains(decimalToRoman.roman)) {
                    roman = roman.replaceFirst(decimalToRoman.roman, "");
                    decimal += decimalToRoman.decimal;
                }
            }
        }
        return decimal;
    }

    enum RomanToDecimal {
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        private final String roman;
        private final int decimal;

        RomanToDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }

    enum DecimalToRoman {
        NINE_HUNDRED("CM", 900),
        THOUSAND("M", 1000),
        FOUR_HUNDRED("CD", 400),
        FIVE_HUNDRED("D", 500),
        NINETY("XC", 90),
        HUNDRED("C", 100),
        FORTY("XL", 40),
        FIFTY("L", 50),
        NINE("IX", 9),
        TEN("X", 10),
        FOUR("IV", 4),
        FIVE("V", 5),
        ONE("I", 1);

        private final int decimal;
        private final String roman;

        DecimalToRoman(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}