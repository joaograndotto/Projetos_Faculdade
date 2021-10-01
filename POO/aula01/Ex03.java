package com.company.aula01;
import java.util.Scanner;

    
public class Ex03 {
    /**
     * Faça um programa que peça 2 números inteiros e um número real. Calcule e
     * mostre: 
     * a) o produto do dobro do primeiro com metade do segundo .
     * b) a soma do triplo do primeiro com o terceiro. 
     * c) o terceiro elevado ao cubo.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                                                                                
        System.out.println("Digite o 1º numero inteiro:");
        int numeroInteiro01 = input.nextInt(); 

        System.out.println("Digite o 2º numero inteiro:");
        int numeroInteiro02 = input.nextInt();

        System.out.println("Digite 1 numero real:");
        double numeroReal = input.nextDouble();
        
        double resultado01 = (numeroInteiro01*2) * (numeroInteiro02 / 2) ;

        double resultado02 = (numeroInteiro01 * 3 ) + (numeroReal);

        double resultado03 = (numeroReal * numeroReal* numeroReal);

        System.out.println("O produto do dobro do primeiro com metade do segundo:" + resultado01);

        System.out.println("O soma do triplo do primeiro com o terceiro:" + resultado02);

        System.out.println("O terceiro elevado ao cubo:" + resultado03);

        input.close();
    }


}
