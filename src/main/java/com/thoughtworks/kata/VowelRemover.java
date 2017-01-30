package com.thoughtworks.kata;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.google.common.collect.Lists.charactersOf;
import static java.lang.Character.toLowerCase;
import static java.util.stream.Collectors.joining;

public class VowelRemover {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String removeVowels(String word) {
        return charactersOf(word)
                .stream()
                .filter(this::isNotAVowel)
                .map(Objects::toString)
                .collect(joining());
    }

    private boolean isNotAVowel(Character character) {
        return !VOWELS.contains(toLowerCase(character));
    }

}