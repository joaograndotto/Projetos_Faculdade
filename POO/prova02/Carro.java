package com.company.prova02;

public class Carro{
    private int litrosNoTanque;
    private boolean carroLigado;

    public Carro(int litrosTanque, boolean carroLigado){
        this.litrosNoTanque = litrosTanque;
        this.carroLigado = carroLigado;

    }
    public int getLitrosNoTanque() {
        return litrosNoTanque;
    }

    public void setLitrosNoTanque(int litrosNoTanque) {
        this.litrosNoTanque = litrosNoTanque;
    }

    public boolean isCarroLigado() {
        return carroLigado;
    }

    public void setCarroLigado(boolean carroLigado) {
        this.carroLigado = carroLigado;
    }

    public void encherTanque(int litros){
        litrosNoTanque = litros;
    }
}
