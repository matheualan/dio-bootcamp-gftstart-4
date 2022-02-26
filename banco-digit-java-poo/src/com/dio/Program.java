package com.dio;

import com.dio.entidades.Cliente;
import com.dio.entidades.Conta;
import com.dio.entidades.ContaCorrente;
import com.dio.entidades.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Miguel", "87623452819");
        Cliente cliente2 = new Cliente("Guilherme", "28193819281");
        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        corrente.depositar(500);
        poupanca.depositar(500);

//        poupanca.desativar();
        corrente.transferir(poupanca, 250);

        corrente.extrato();
        poupanca.extrato();

    }
}
