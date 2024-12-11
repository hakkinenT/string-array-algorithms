package com.example.arrays;


public class CircularArrayAccess {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        circularAccess1(array);
        System.out.println();
        circularAccess2(array);
    }


    private static void circularAccess1(int[] array) {
        // Número de acessos circulares que queremos fazer
        int accesses = 10;

        for (int i = 0; i < accesses; i++) {
            // O índice circular é calculado usando o operador de módulo
            int circularIndex = i % array.length;

            // Acessa o elemento do array no índice calculado
            System.out.println("Acesso " + i + ": " + array[circularIndex]);
        }
    }

    /**
     * Não usa divisão
     */
    private static void circularAccess2(int[] array) {
        // Número de acessos circulares que queremos fazer
        int accesses = 10;

        int currentIndex = 0; // Índice inicial
        for (int i = 0; i < accesses; i++) {
            // Acessa o elemento no índice atual
            System.out.println("Acesso " + i + ": " + array[currentIndex]);

            // Atualiza o índice circularmente sem usar divisão
            currentIndex++;
            if (currentIndex >= array.length) {
                currentIndex = 0; // Volta para o início
            }
        }
    }
}
