package com.dio.entidades;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 202;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private boolean ativada;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.ativada = true;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valorSaque) {
        if (this.saldo > valorSaque && this.ativada) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente ou conta inoperante.");
        }
    }

    @Override
    public void depositar(double valorDeposito) {
        if (this.ativada) {
            this.saldo += valorDeposito;
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valorTransf) {
        if (this.ativada && this.saldo > valorTransf && contaDestino.ativada) {
            this.sacar(valorTransf);
            contaDestino.depositar(valorTransf);
        } else {
            System.out.println("Saldo insuficiente ou conta inoperante.");
        }
    }

    public boolean desativar() {
        return this.ativada = false;
    }

    protected void infoConta() {
        if (ativada) {
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agência: %d", this.agencia));
            System.out.println(String.format("Nº Conta: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
        } else {
            System.out.println("Falha ao solicitar extrato da conta, procure uma agência mais próxima.");
        }
    }

}
