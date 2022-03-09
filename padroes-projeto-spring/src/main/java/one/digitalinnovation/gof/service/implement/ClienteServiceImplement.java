package one.digitalinnovation.gof.service.implement;

import com.sun.xml.bind.v2.TODO;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

import javax.swing.*;
import java.util.UUID;

public class ClienteServiceImplement implements ClienteService {

//    TODO Singleton: Injetar os components do Spring com @Autowired
//    TODO Strategy: Implementar os métodos definidos na interface.
//    TODO Facade: Abstrair integrações com subsistemas provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(UUID id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(UUID id, Cliente cliente) {

    }

    @Override
    public void deletar(UUID id) {

    }
}
