package com.company.aula08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Coleta de Dados
        Scanner input =  new Scanner(System.in);
        Aluno aluno01 = new Aluno();

        System.out.println("Digite seu nome:");
        aluno01.nome = input.next();

        System.out.println("Digite seu matricula:");
        aluno01.matricula = input.next();

        System.out.println("Digite seu curso:");
        aluno01.curso = input.next();

        System.out.println("Digite as suas disciplinas:");
        aluno01.disciplina01 = input.next();
        aluno01.disciplina02 = input.next();
        aluno01.disciplina03 = input.next();

        System.out.println("Digite suas notas:");
        aluno01.nota01 = input.nextInt();
        aluno01.nota02 = input.nextInt();
        aluno01.nota03 = input.nextInt();

        //Output
        System.out.println(aluno01.nome);
        System.out.println(aluno01.matricula);
        System.out.println(aluno01.curso);
        System.out.println(aluno01.disciplina01 + " nota: " + aluno01.nota01);
        System.out.println(aluno01.disciplina02 + " nota: " + aluno01.nota02);
        System.out.println(aluno01.disciplina03 + " nota: " + aluno01.nota03);
        System.out.println(aluno01.verificarAprovacao());

    }
}
