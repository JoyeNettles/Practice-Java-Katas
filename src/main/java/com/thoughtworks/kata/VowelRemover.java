package com.thoughtworks.kata;


import java.util.Arrays;
import java.util.List;

import static java.lang.Character.*;

public class VowelRemover {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String removeVowels(String word) {
        String newWord = "";
        for(Character character: word.toCharArray()){
            if(!VOWELS.contains(toLowerCase(character))){
                newWord += character;
            }
        }
        return newWord;
    }
}