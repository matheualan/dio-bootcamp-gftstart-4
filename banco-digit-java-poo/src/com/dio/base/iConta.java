package com.dio.base;

public interface iConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);

}
