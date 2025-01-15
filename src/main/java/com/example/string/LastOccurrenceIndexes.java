package com.example.string;

import java.util.HashMap;

public class LastOccurrenceIndexes {
    public static int lastOccurrence(String s) {
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        int start = 0;
        int maxLenght = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Verifica se o caractere já foi visto e ajusta o início
            if (lastSeen.containsKey(currentChar)) {
                start = Math.max(start, lastSeen.get(currentChar) + 1);
                maxLenght = Math.max(maxLenght, end - start + 1);
            }

            // Atualiza a última posição do caractere
            lastSeen.put(currentChar, end);

            
        }

        return maxLenght;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lastOccurrence(input));
    }
}
