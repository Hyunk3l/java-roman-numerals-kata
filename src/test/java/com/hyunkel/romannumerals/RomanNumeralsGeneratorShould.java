package com.hyunkel.romannumerals;

import org.junit.Test;

import static com.hyunkel.romannumerals.RomanNumeralsGenerator.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsGeneratorShould {

    @Test
    public void generate_a_roman_number_for_a_given_decimal_number() {
        assertThat(romanFor(1)).isSameAs("I");
    }
}
