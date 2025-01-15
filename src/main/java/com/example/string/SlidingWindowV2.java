package com.example.string;

import java.util.HashSet;

public class SlidingWindowV2 {
    public static int slidingWindow(String s) {
        int i = 0; // Início da janela
        int j = 0;   // Fim da janela
        int maxLenght = 0; // Tamanho máximo da janela
        int n = s.length();
        HashSet<Character> window = new HashSet<>();

        while (i < n && j < n) {
            if(!window.contains(s.charAt(j))) {
                window.add(s.charAt(j++));
                maxLenght = Math.max(maxLenght, j - i);
            } else {
                window.remove(s.charAt(i++));
            }
        }

        return maxLenght;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(slidingWindow(input));
    }
}
