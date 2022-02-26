package com.dio.entidades;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==============================");
        System.out.println("### Extrato Conta Poupança ###");
        infoConta();
        System.out.println("==============================\n");
    }

}
