package com.example.string;

import java.util.HashSet;

public class SlidingWindowV1 {
    public static int slidingWindow(String s) {
        int start = 0; // Início da janela
        int end = 0;   // Fim da janela
        int maxLenght = 0; // Tamanho máximo da janela
        HashSet<Character> window = new HashSet<>();

        while (end < s.length()) {
            char currentChar = s.charAt(end);

            // Se o caractere atual já está na janela, ajusta o início
            while (window.contains(currentChar)) {
                window.remove(s.charAt(start));
                start++;
            }

            // Adiciona o caractere atual à janela
            window.add(currentChar);

            // Avança o fim da janela
            end++;
            maxLenght = Math.max(maxLenght, end - start);
        }

        return maxLenght;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(slidingWindow(input));
    }
}
