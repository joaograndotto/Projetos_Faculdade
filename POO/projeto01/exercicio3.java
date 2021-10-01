package com.company.projeto01;
import java.util.Scanner;

public class exercicio3 {
    /*
    Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores
    nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[10];
        int valor;


        // for para adicionar valor
        for (int i = 0; i < 10; i++) {
            vetor[i] = valor = input.nextInt();

        }

        // for para verificar valor
        for (int i = 0; i < 10; i++) {

            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }

        }
        // for para mostrar vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("X["+i+"] = "+ vetor[i]);
        }
    }
}





