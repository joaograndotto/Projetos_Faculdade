package com.company.aula01;
import java.util.Scanner;

public class Ex01 {
// Faça um programa que peça as 4 notas bimestrais e mostre a média.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota01:");
        double nota01 = input.nextDouble();
        System.out.print("Digite a nota02:");
        double nota02 = input.nextDouble();
        System.out.print("Digite a nota03:");
        double nota03 = input.nextDouble();
        System.out.print("Digite a nota04:");
        double nota04 = input.nextDouble();

        double resultado = ((nota01 + nota02 + nota03 + nota04) / 4);

        System.out.println("A média é:" + resultado);
        input.close();

        

        
    }
    
}
