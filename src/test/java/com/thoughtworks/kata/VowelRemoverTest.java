package com.thoughtworks.kata;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class VowelRemoverTest {

    private VowelRemover vowelRemover;

    @Before
    public void setUp() throws Exception {
        vowelRemover = new VowelRemover();
    }

    @Test
    public void givenASingleVowelShouldReturnEmptyString() throws Exception {
        String result = vowelRemover.removeVowels("a");
        assertThat(result, is(""));
    }

    @Test
    public void givenAWordWithLowerCaseVowelsShouldReturnStringWithoutVowels() throws Exception {
        final String result = vowelRemover.removeVowels("Hello");
        assertThat(result, is("Hll"));
    }

    @Test
    public void givenAWordWithUppercaseVowelsShouldReturnStringWithoutVowels() throws Exception {
        final String result = vowelRemover.removeVowels("Elephant");
        assertThat(result, is("lphnt"));
    }

    @Test
    public void givenASentenceReturnsWordsWithoutVowels() throws Exception {
        final String result = vowelRemover.removeVowels("Hello World.");
        assertThat(result, is("Hll Wrld."));

    }

    @Test
    public void givenAWordOfAllSpecialCharacterShouldReturnTheSameWord() throws Exception {
        final String word = "&*(%%$";
        final String result = vowelRemover.removeVowels(word);
        assertThat(result, is(word));
    }

}
