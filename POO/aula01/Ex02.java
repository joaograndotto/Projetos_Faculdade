package com.company.aula01;
import java.util.Scanner;

public class Ex02 {

    /*
     * Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
        mostre a temperatura em graus Celsius.
        • C = (5 * (F-32) / 9).
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double temperatura = input.nextDouble();
        
        double Celsius = (5 * (temperatura - 32) / 9);

        System.out.println("A temperatura em Celsius:" + Celsius);
        input.close(); 
    }
}