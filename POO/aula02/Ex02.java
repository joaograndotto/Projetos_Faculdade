package com.company.aula02;
import java.util.Scanner;
public class Ex02 {
    /**
     * Faça um programa que pega um valor e mostre na tela se o valor se e positivo ou
     * negativo.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int valor = input.nextInt();
        if (valor > 0) {
            System.out.println("Valor positivo!");

        }else{
            System.out.println("Valor negativo!");
        }
    }
}
