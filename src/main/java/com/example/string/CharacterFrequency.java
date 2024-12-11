package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        Map<Character, Integer> result = characterFrequency("arara");
        for (Character c : result.keySet()) {
            System.out.println(c + " - " + result.get(c));
        }
    }

    public static Map<Character, Integer> characterFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
    return freqMap;
}

}
