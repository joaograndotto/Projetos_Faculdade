package com.company.projeto01;
import java.util.Scanner;

public class exercicio5 {
    /*
    Leia números inteiros até que um 0 (zero) seja lido. Para cada valor lido, o
    programa deve mostrar o quadrado do valor. Lembrete: você não precisa ler todos dados
    para só depois começar a mostrar a saída. Você pode ir lendo um número e
    mostrando a saída referente a ele, um de cada vez.*/
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int valor = input.nextInt();
        while (valor != 0){
            valor = valor*valor;
            System.out.println(valor);
            valor = input.nextInt();
        }
    }
}
