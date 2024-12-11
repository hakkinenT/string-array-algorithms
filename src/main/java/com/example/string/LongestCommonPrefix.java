package com.example.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flor", "flores", "florida"};
        
        String lcp = encontrarLCP(strings);
        
        System.out.println("Maior Prefixo Comum: " + lcp);
    }

    public static String encontrarLCP(String[] strings) {
        // Verifica se a lista está vazia ou nula
        if (strings == null || strings.length == 0) {
            return "";
        }

        // Começa com a primeira string como o prefixo inicial
        String prefixo = strings[0];

        // Compara o prefixo com as outras strings
        for (int i = 1; i < strings.length; i++) {
            // Enquanto a string atual não começar com o prefixo, reduza-o
            while (!strings[i].startsWith(prefixo)) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);

                // Se o prefixo for reduzido a vazio, não há prefixo comum
                if (prefixo.isEmpty()) {
                    return "";
                }
            }
        }

        return prefixo;
    }
}
