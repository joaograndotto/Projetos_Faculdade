package com.company.aula09;

public class Cliente {
  private int codigodoCliente;
  private String nomeCompleto;

    public Cliente (int codigo) {
        this.codigodoCliente = codigo;
    }
    public long getCodigodoCliente() {
        return codigodoCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
