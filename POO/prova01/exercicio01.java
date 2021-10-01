package com.company.prova01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[] vetor = new int[50];
        int i = 0;
        for(int contador = 41; contador <= 90; contador++) {
            vetor[i] = contador;
            //System.out.println(vetor[i]);
            i++;

        }
        for(int c = 0; c <= vetor.length - 1; c++){
            if(vetor[c] %2 != 0){
                System.out.println(vetor[c]);
            }

        }
    }
}
