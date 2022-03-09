package br.com.dio.subsistemafacade2.cep;

public class CepAPI {

    private static CepAPI instanciaCep = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstanciaCep() {
        return instanciaCep;
    }

    public String recuperarCidade(String cep) {
        return "Recife";
    }

    public String recuperarEstado(String cep) {
        return "PE";
    }
}
