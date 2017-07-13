package com.hyunkel.romannumerals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hyunkel.romannumerals.RomanNumeralsGenerator.decimalFor;
import static com.hyunkel.romannumerals.RomanNumeralsGenerator.romanFor;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsGeneratorShould {

    @Test
    public void generate_a_roman_number_for_a_given_decimal_number() {
        for(Map.Entry<String, Integer> romalNumeral : romanNumeralsProvider().entrySet()) {
            assertThat(romanFor(romalNumeral.getValue())).isEqualTo(romalNumeral.getKey());
        }
    }

    @Test
    public void generate_a_decimal_number_for_a_given_roman_number() {
        for(Map.Entry<String, Integer> romalNumeral : romanNumeralsProvider().entrySet()) {
            assertThat(decimalFor(romalNumeral.getKey())).isEqualTo(romalNumeral.getValue());
        }
    }

    private Map<String, Integer> romanNumeralsProvider() {
        HashMap<String, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("II", 2);
        romanNumerals.put("III", 3);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("VII", 7);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);
        romanNumerals.put("XVIII", 18);
        romanNumerals.put("XXX", 30);
        romanNumerals.put("MMDCLXXXVII", 2687);
        romanNumerals.put("MMMCDXCIX", 3499);
        return romanNumerals;
    }
}
