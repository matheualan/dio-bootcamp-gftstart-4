package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

import java.util.UUID;

/**
 * Interface que implementa o Desing Patter <b>'Strategy'</b>
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(UUID id);
    void inserir(Cliente cliente);
    void atualizar(UUID id, Cliente cliente);
    void deletar(UUID id);

}
