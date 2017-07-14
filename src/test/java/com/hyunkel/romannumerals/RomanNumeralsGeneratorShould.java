package com.hyunkel.romannumerals;

import org.junit.Test;

import static com.hyunkel.romannumerals.RomanNumeralsGenerator.*;
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
    public void generate_a_decimal_for_a_given_roman_number() {
        assertThat(decimalFor("I")).isEqualTo(1);
        assertThat(decimalFor("II")).isEqualTo(2);
        assertThat(decimalFor("III")).isEqualTo(3);
        assertThat(decimalFor("IV")).isEqualTo(4);
        assertThat(decimalFor("V")).isEqualTo(5);
        assertThat(decimalFor("VII")).isEqualTo(7);
        assertThat(decimalFor("IX")).isEqualTo(9);
        assertThat(decimalFor("X")).isEqualTo(10);
        assertThat(decimalFor("XVIII")).isEqualTo(18);
        assertThat(decimalFor("XXX")).isEqualTo(30);
        assertThat(decimalFor("MMDCLXXXVII")).isEqualTo(2687);
        assertThat(decimalFor("MMMCDXCIX")).isEqualTo(3499);
    }
}
