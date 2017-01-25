package com.thoughtworks.kata;


import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

import static java.lang.Character.toLowerCase;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class VowelRemover {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String removeVowels(String word) {
        List<Character> newWord = Lists.charactersOf(word)
                .stream()
                .filter(x -> isNotAVowel(x))
                .collect(toList());

        return createString(newWord);
    }

    private boolean isNotAVowel(Character character) {
        return !VOWELS.contains(toLowerCase(character));
    }

    private String createString(List<Character> newWord) {
        return newWord.stream().map(Object::toString)
                .collect(joining());
    }
}