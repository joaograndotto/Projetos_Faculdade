package com.company.prova02;

public class Pessoa {
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private double altura;

    public Pessoa(String nome, int dia, int mes, int ano, double altura){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano  = ano;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Dia: "+getDia());
        System.out.println("Mês: "  +getMes());
        System.out.println("Ano: " +getAno());
        System.out.println("Altura: " +getAltura());
    }
    public void calcularIdade(){
        int ano =  2021 - this.ano;
        System.out.println("A idade é " + ano );


    }
}

