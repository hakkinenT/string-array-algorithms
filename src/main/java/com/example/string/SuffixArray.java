package com.example.string;

import java.util.Arrays;

public class SuffixArray {
    public static void main(String[] args) {
        String texto = "banana";
        int[] sufixoArray = construirSuffixArray(texto);
        
        // Imprime o array de sufixo
        System.out.println("Texto: " + texto);
        System.out.println("Array de Sufixo: " + Arrays.toString(sufixoArray));
    }
    
    public static int[] construirSuffixArray(String texto) {
        int n = texto.length();
        Sufixo[] sufixos = new Sufixo[n];

        // Cria os sufixos com seus índices
        for (int i = 0; i < n; i++) {
            sufixos[i] = new Sufixo(i, texto.substring(i));
        }

        // Ordena os sufixos lexicograficamente com base no texto
        Arrays.sort(sufixos, (a, b) -> a.texto.compareTo(b.texto));

        // Cria o array de sufixo com os índices dos sufixos ordenados
        int[] sufixoArray = new int[n];
        for (int i = 0; i < n; i++) {
            sufixoArray[i] = sufixos[i].indice;
        }

        return sufixoArray;
    }
}

class Sufixo {
    int indice;
    String texto;

    Sufixo(int indice, String texto) {
        this.indice = indice;
        this.texto = texto;
    }
}
