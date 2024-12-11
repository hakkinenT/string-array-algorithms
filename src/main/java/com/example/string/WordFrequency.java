package com.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordFrequency {
    public static Map<String, Integer> wordFrequency(String sentence) {
        // Lista de artigos definidos e indefinidos
        Set<String> articles = new HashSet<>(Arrays.asList("a", "o", "os", "as", "um", "uma", "uns", "umas"));
        
        // Lista de verbos (simplificada)
        Set<String> verbs = new HashSet<>(Arrays.asList("é", "foi", "era", "são", "está", "estavam", "estavam"));

        // Inicializa o mapa de frequências
        Map<String, Integer> freqMap = new HashMap<>();

        // Divide a frase em palavras
        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            // Remove pontuações ao redor da palavra
            word = word.replaceAll("[^a-zA-Záéíóúãõç]", "");

            // Ignora palavras que estão nas listas de exclusão
            if (!articles.contains(word) && !verbs.contains(word)) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        String sentence = "O gato está em cima do telhado. O cachorro foi correndo.";
        Map<String, Integer> result = wordFrequency(sentence);
        System.out.println(result);
    }
}
