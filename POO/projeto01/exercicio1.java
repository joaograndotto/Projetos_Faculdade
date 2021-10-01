package com.company.projeto01;
import java.util.Scanner;

public class exercicio1 {
    /*
    Faça um programa em JAVA para ler um número indeterminado de dados,
    contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos
    cálculos, contém um valor de idade negativa. Calcular e imprimir a idade média deste
    grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
    mensagem "impossivel calcular".*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        int i = 0;
        double somaIdades = 0;

        while (idade > 0) {

            somaIdades += idade;
            i++;
            idade = input.nextInt();
        }
        if (i == 0) {
            System.out.println("impossível calcular");
        } else {
            double resultado = somaIdades / i;
            System.out.println(resultado);

        }
    }
}
