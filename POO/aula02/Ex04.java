package com.company.aula02;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex04 {
   /*Faça um programa que leia três números e mostre o maior e o menor deles.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor01 = input.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor02 = input.nextInt();
        System.out.println("Digite o terceiro valor:");
        int valor03 = input.nextInt();


        if (valor01 > valor02 && valor01 > valor03){
            System.out.println("Valor01 é o maior!!");
                if (valor02 < valor03){
                    System.out.println("Valor02 é o menor!!");
                }else{
                    System.out.println("Valor 03 é o menor!!");
                }
            }

        if (valor02 > valor01 && valor02 > valor03){
            System.out.println("Valor02 é o maior!!");
                if (valor01 < valor03){
                    System.out.println("Valor01 é o menor!!");
                }else{
                    System.out.println("Valor 03 é o menor!!");
                }
        }
        if (valor03 > valor01 && valor03 > valor02){
                System.out.println("Valor03 é o maior!!");
                if (valor01 < valor02){
                    System.out.println("Valor01 é o menor!!");
                }else{
                    System.out.println("Valor 02 é o menor!!");
                }
            }

        }
    }

