package com.dio;

import com.dio.entidades.Cliente;
import com.dio.entidades.Conta;
import com.dio.entidades.ContaCorrente;
import com.dio.entidades.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        cliente1.setNome("Miguel");
        cliente1.setCpf("87623452819");
        cliente2.setNome("Guilherme");
        cliente2.setCpf("28193819281");

        corrente.depositar(500);
        poupanca.depositar(500);

//        poupanca.desativar();
        corrente.transferir(poupanca, 250);

        corrente.extrato();
        poupanca.extrato();

    }
}
