package com.company.prova01;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        double primeroValor = input.nextInt();

        System.out.println("Primeiro valor: ");
        double segundoValor = input.nextInt();

        System.out.println("Qual operação aritmética [(1 -> +), (2 -> -), (3 -> *), (4 -> /)] ?");
        int operacao = input.nextInt();

        double resultado = 0;

        if (operacao == 1) resultado = primeroValor + segundoValor;

        else if (operacao == 2) resultado = primeroValor - segundoValor;

        else if (operacao == 3) resultado = primeroValor * segundoValor;

        else if (operacao == 4) resultado = primeroValor / segundoValor;


        System.out.println(resultado);



    }
}

