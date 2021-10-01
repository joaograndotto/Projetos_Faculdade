package com.company.projeto01;
import java.util.Scanner;

public class exercicio2 {
   /*
   Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
   seguida, mostrar na tela todos os números negativos lidos.*/

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int quantidade =input.nextInt();
        double [] vetor = new double[quantidade];
        int valor;


        // for para adicionar valor
        for(int i = 0; i < quantidade; i++) {
            vetor[i] = valor = input.nextInt();
        }
        // for para verificar valor
        for(int i = 0; i < quantidade; i++) {

            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

    }
}
