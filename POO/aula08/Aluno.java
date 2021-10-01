package com.company.aula08;

/*- Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características de um Aluno,
como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas
3 disciplinas.
- Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7)
em uma determinada disciplina.
- Escreva um programa para testar essa classe, que pede as informações do
aluno ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.*/
public class Aluno {

    String nome;
    String matricula;
    String curso;
    String disciplina01;
    String disciplina02;
    String disciplina03;
    double nota01;
    double nota02;
    double nota03;
    double media;

    public String verificarAprovacao() {
        media = ((nota01 + nota02 + nota03) / 3);
        if (media >= 7) {
            return "Média: " + media + " Aprovado!";
        } else {
            return "Média: " + media + " Reprovado!";
        }


    }
}
