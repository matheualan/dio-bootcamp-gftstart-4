package one.digitalinnovation.gof.service.implement;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.repository.ClienteRepository;
import one.digitalinnovation.gof.repository.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteServiceImplement implements ClienteService {

//    TODO Singleton: Injetar os components do Spring com @Autowired
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

//    TODO Strategy: Implementar os métodos definidos na interface.
//    TODO Facade: Abstrair integrações com subsistemas provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(UUID id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteVerificandoCep(cliente);
    }

    @Override
    public void atualizar(UUID id, Cliente cliente) {
        Optional<Cliente> clienteDatabase = clienteRepository.findById(id);
        if (clienteDatabase.isPresent()) {
            salvarClienteVerificandoCep(cliente);
        }
    }

    @Override
    public void deletar(UUID id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteVerificandoCep(Cliente cliente) {
//    Pegar o CEP e verificar se o endereço do cliente existe pelo CEP
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
//            Caso não existir, consumir/integrar a API ViaCEP e persistir no banco de dados
            Endereco newAddress = viaCepService.consultarCep(cep);
            enderecoRepository.save(newAddress);
            return newAddress;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
