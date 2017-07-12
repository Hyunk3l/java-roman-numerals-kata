package com.hyunkel.romannumerals;

import org.junit.Test;

import static com.hyunkel.romannumerals.RomanNumeralsGenerator.decimalFor;
import static com.hyunkel.romannumerals.RomanNumeralsGenerator.romanFor;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsGeneratorShould {

    @Test
    public void generate_a_roman_number_for_a_given_decimal_number() {
        assertThat(romanFor(1)).isEqualTo("I");
        assertThat(romanFor(2)).isEqualTo("II");
        assertThat(romanFor(3)).isEqualTo("III");
        assertThat(romanFor(4)).isEqualTo("IV");
        assertThat(romanFor(5)).isEqualTo("V");
        assertThat(romanFor(7)).isEqualTo("VII");
        assertThat(romanFor(9)).isEqualTo("IX");
        assertThat(romanFor(10)).isEqualTo("X");
        assertThat(romanFor(18)).isEqualTo("XVIII");
        assertThat(romanFor(30)).isEqualTo("XXX");
        assertThat(romanFor(2687)).isEqualTo("MMDCLXXXVII");
        assertThat(romanFor(3499)).isEqualTo("MMMCDXCIX");
    }

    @Test
    public void generate_a_decimal_numer_for_a_given_roman_number() {
        assertThat(decimalFor("I")).isEqualTo(1);
    }
}
