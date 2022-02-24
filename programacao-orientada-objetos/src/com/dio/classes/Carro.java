package com.dio.classes;

public class Carro {

    private String cor;
    private String modelo;
    private int tanqueL;

    public Carro() {
    }

    public Carro(String cor, String modelo, int tanqueL) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanqueL = tanqueL;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTanqueL() {
        return tanqueL;
    }

    public void setTanqueL(int tanqueL) {
        this.tanqueL = tanqueL;
    }

    public void acelarar() {
        System.out.println("Acelerando carro.");
    }

    public void frear() {
        System.out.println("Freando carro.");
    }

    public void valorEnxerTanque(double valorGasolina) {
        double valorTotal = tanqueL * valorGasolina;
        System.out.print("Valor total para encher tanque de " + tanqueL + "L: " + valorTotal + "\n");
    }

}
