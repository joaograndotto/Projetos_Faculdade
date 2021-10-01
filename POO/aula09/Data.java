package com.company.aula09;
/*A classe deve ter métodos get e set para cada variável e um construtor
que inicializa as variáveis e assume que os valores fornecidos são
corretos. Forneça um método displayData que exibe o dia, o mês e o ano
separados por barras normais ( / ). Escreva um aplicativo de teste
chamado DataTeste que demonstra as capacidades da classe Data.*/
public class Data {

 private int mes;
 private int dia;
 private int ano;

    public Data (int d, int m , int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int displayData(){
        System.out.println(dia + "/" + mes + "/" + ano);

        return 0;
    }


}
