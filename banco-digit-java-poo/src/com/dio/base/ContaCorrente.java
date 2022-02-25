package com.dio.base;

public class ContaCorrente {

    private int agencia;
    private int numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        }
    }

    public void depositar() {

    }

    public void transferir() {

    }

}
