package com.company.aula09;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente(1111);
        Cliente cliente02 = new Cliente(2222);
        System.out.println(cliente01.getNomeCompleto());
        System.out.println(cliente02.getNomeCompleto());
        cliente01.setNomeCompleto("João Gabriel Grandotto Viana");
        cliente02.setNomeCompleto("Iasmini Lima");
        System.out.println(cliente01.getNomeCompleto());
        System.out.println(cliente02.getNomeCompleto());
    }
}
