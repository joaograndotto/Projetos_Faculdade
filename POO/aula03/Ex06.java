package com.company.aula03;
import java.util.Scanner;
public class Ex06 {
    /*
    Faça um programa que peça para o usuário informar uma
    quantidade de números e quais são esses numeros. Imprima a soma
    dos números informados pelo usuário.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade números:");
        int quantidade = input.nextInt();
        int soma = 0;

        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite o " + i + "º número:");
            int numero = input.nextInt();
            soma += numero;

        }
        System.out.println("A soma é: " + soma);








    }
}
