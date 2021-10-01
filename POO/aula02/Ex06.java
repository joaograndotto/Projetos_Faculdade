package com.company.aula02;
import java.util.Scanner;

public class Ex06 {
    /*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
    perguntas são: .
    • "Telefonou para a vítima?"
    • "Esteve no local do crime?"
    • "Mora perto da vítima?"
    • "Devia para a vítima?"
    • "Já trabalhou com a vítima?"
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
    entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
    "Inocente"*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? [1/Sim]-[0/Não] ");
        int resposta01 = input.nextInt();
        System.out.println("Esteve no local do crime? [1/Sim]-[0/Não] ");
        int resposta02 = input.nextInt();
        System.out.println("Mora perto da vítima? [1/Sim]-[0/Não] ");
        int resposta03 = input.nextInt();
        System.out.println("Devia para a vítima? [1/Sim]-[0/Não] ");
        int resposta04 = input.nextInt();
        System.out.println("Já trabalhou com a vítima? [1/Sim]-[0/Não] ");
        int resposta05 = input.nextInt();

        int veredito = resposta01 + resposta02 + resposta03 + resposta04 + resposta05;

        if (veredito == 2) {
            System.out.println("Suspeito");
        }else if(  veredito == 3 || veredito == 4){
            System.out.println("Cúmplice");
        }else if(veredito == 5){
            System.out.println("Assassino");

        }else{
            System.out.println("Inocente");

        }
    }
}
    


 

    
    
    
    
 
