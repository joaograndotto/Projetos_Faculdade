package com.company.prova01;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[1000];
        int i = 0;
        for (int contador = 1000; contador < 2000; contador++) {
            vetor[i] = contador;

            i++;

        }
        for (int c = 0; c <= vetor.length - 1; c++) {
            if (vetor[c] % 2 == 0) {
                System.out.println(vetor[c]);
            }
        }
    }
}
