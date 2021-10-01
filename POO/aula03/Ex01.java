package com.company.aula03;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        for (int i = 0; i <= 10 ;i++){

            int resultado = numero * i;
            System.out.println(numero + "X" + i + "=" + resultado);

        }
     }
}
