package br.com.dio.facade;

import br.com.dio.subsistemafacade1.crm.CrmService;
import br.com.dio.subsistemafacade2.cep.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstanciaCep().recuperarCidade(cep);
        String estado = CepAPI.getInstanciaCep().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }

}
