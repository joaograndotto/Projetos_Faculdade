package com.company.projeto01;
import java.util.Scanner;

public class exercicio4 {
    /*
    Leia um valor e faça um programa que coloque o valor lido na primeira posição de
    um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição
    anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e
    assim sucessivamente. Mostre o vetor em seguida.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[10];
        vetor[0] = input.nextInt();
        if (!(vetor[0] >= 50)) {

            //adicionar no vetor
            for (int i = 1; i <= vetor.length-1; i++) {
                vetor[i] = vetor[i - 1] * 2;

                //imprimir vetor
            }for (int c = 0; c <= vetor.length-1; c++){
                System.out.println("N["+c+"] = "+ vetor[c]);
            }





    }
}
}