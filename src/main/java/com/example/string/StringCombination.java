package com.example.string;

public class StringCombination {
    public static void main(String[] args) {
        generateCombinations("gato", "rato", 0);
    }

    public static void generateCombinations(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        generateCombinations(str, current, index + 1); // Excluir o caractere atual
        generateCombinations(str, current + str.charAt(index), index + 1); // Incluir o caractere atual
    }
    
}
