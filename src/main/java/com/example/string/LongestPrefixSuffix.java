package com.example.string;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String pattern = "ababaca";
        int[] lps = calcularLPS(pattern);
        
        System.out.println("LPS Array: " + java.util.Arrays.toString(lps));
    }

    public static int[] calcularLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];

        // Posição inicial e comprimento do maior prefixo
        int len = 0;
        int i = 1;

        // Itera sobre o padrão
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
