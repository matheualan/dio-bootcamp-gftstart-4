package com.dio;

import com.dio.base.Cliente;
import com.dio.base.Conta;
import com.dio.base.ContaCorrente;
import com.dio.base.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Miguel");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Guilherme");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);
        cp.depositar(500);
        cp.transferir(cc, 200);
        cp.sacar(100);

        cc.extrato();
        System.out.println();
        cp.extrato();

    }
}
