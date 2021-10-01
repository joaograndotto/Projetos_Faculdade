package com.company.aula01;

import java.util.Scanner;

public class Ex04 {

    /*
     * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
     * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double altura = input.nextDouble();

        double resultado = (72.7 * altura) - 58;

        System.out.println("Seu peso ideial é:" + resultado);
        input.close();
        

    }

}
