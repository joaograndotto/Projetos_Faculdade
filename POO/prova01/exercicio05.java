package com.company.prova01;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Velocidade de um carro:");
        double velocidadeCarro = input.nextInt();

        System.out.println("Qual é a velocidade máxima para a rua: ");
        double velocidadePermitida = input.nextInt();
        double multa = 0;

        if (velocidadeCarro <= velocidadePermitida + 15){
            multa = 70;

        }
        else if (velocidadeCarro > velocidadePermitida + 15 && velocidadeCarro <= velocidadePermitida + 40){
            multa = 110;

        }
        else if (velocidadeCarro > velocidadePermitida + 40){
            multa = 350;

        }

        System.out.println("A velocidade máxima permitida é:" + velocidadePermitida);
        System.out.println("A velocidade do carro é:" + velocidadeCarro);
        System.out.println("Valor da multa é:" + multa);
    }
}
