package com.dio.entidades;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==============================");
        System.out.println("### Extrato Conta Corrente ###");
        super.infoConta();
        System.out.println("==============================");
    }

}
