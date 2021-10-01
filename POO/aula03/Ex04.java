package com.company.aula03;
import java.util.Scanner;
public class Ex04 {
    /*
    Faça um programa que calcule o mostre a média aritmética de N
    notas.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas que seram digitadas:");
        int quantidade = input.nextInt();
        double somaNotas = 0;

        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite a " + i + "º nota:" );
            double nota = input.nextInt();
            somaNotas += nota;

        }
        double resultado = somaNotas/quantidade;
        System.out.println("A média é: " + resultado );





}
}

