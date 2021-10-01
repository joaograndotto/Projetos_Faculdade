package com.company.aula03;
import java.util.Scanner;
public class Ex05 {
    /*
    Faça um programa que peça para n pessoas a sua idade, ao final o
    programa devera verificar se a média de idade da turma varia entre
    0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem,
    adulta ou idosa, conforme a média calculada.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas na turma:");
        int quantidade = input.nextInt();
        int somaIdades = 0;

        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite a idade da " + i + "º pessoa:" );
            int idade = input.nextInt();
            somaIdades += idade;

        }
        int resultado = somaIdades/quantidade;
        System.out.println("A média é: " + resultado);
        if (resultado <= 25){
            System.out.println("Turma Jovem!!");
        }
        else if(resultado > 26 && resultado < 60 ){
            System.out.println("Turma Adulta!!");
        }
        else{
            System.out.println("Turma Idosa!!");
        }




    }
}
