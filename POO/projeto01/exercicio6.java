package com.company.projeto01;


import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    /*
     O curso de Tecnologia e Desenvolvimento de Sistemas do IFG é trimestral, sendo
    que as notas do ano são divididas em três partes: 30, 35 e 35, totalizando 100 pontos
    no ano. A professora de programação orientada a objetos está querendo automatizar o
    processo de fechamento de notas, fazendo um programa para somar as notas dos três
    trimestres de todos alunos da turma.*/
    public static void main(String[] args) {
        /* Importei essa classe  pois ela reconhecem a separação de decimal
        com o '.' sem esse import a separação de decimal e por ',' tanto na entrada, quanto na saida
        coloquei para ficar igual está no exercicio.*/
        Scanner input =  new Scanner(System.in); input.useLocale(Locale.US);
        Locale.setDefault(Locale.US);


        int quantidadeAlunos = input.nextInt();
        double nota01;
        double nota02;
        double nota03;
        double[] notaFinal = new double[quantidadeAlunos];
        for(int i = 1; i<= quantidadeAlunos; i++){
            nota01 = input.nextDouble();
            nota02 = input.nextDouble();
            nota03 = input.nextDouble();

            notaFinal [i - 1] = (nota01 + nota02 + nota03);


        }
        for (int i= 0; i< notaFinal.length; i++){
            System.out.println(String.format("%.2f",notaFinal[i]));
        }



    }

}
