package br.com.etcesp.resolvers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.etcesp.model.Cliente;
import br.com.etcesp.repository.ClienteRepository;
import br.com.etcesp.util.ClienteInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class ClienteResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final ClienteRepository clienteRepository;

    public ClienteResolver(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente(ClienteInput clienteInput) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteInput.getNome());
        cliente.setCpfCnpj(clienteInput.getCpfCnpj());
        cliente.setDataNascimento(clienteInput.getDataNascimento());
        cliente.setTipoLogradouro(clienteInput.getTipoLogradouro());
        cliente.setLogradouro(clienteInput.getLogradouro());
        cliente.setNumero(clienteInput.getNumero());
        cliente.setComplemento(clienteInput.getComplemento());
        cliente.setCidade(clienteInput.getCidade());
        cliente.setEstado(clienteInput.getEstado());
        cliente.setCep(clienteInput.getCep());
        cliente.setEmail(clienteInput.getEmail());
        cliente.setTelefone(clienteInput.getTelefone());

        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Long id, ClienteInput clienteInput) {
        Cliente clienteExistente = clienteRepository.findById(id).orElse(null);
        if (clienteExistente == null) {
            return null;
        }

        clienteExistente.setNome(clienteInput.getNome());
        clienteExistente.setCpfCnpj(clienteInput.getCpfCnpj());
        clienteExistente.setDataNascimento(clienteInput.getDataNascimento());
        clienteExistente.setTipoLogradouro(clienteInput.getTipoLogradouro());
        clienteExistente.setLogradouro(clienteInput.getLogradouro());
        clienteExistente.setNumero(clienteInput.getNumero());
        clienteExistente.setComplemento(clienteInput.getComplemento());
        clienteExistente.setCidade(clienteInput.getCidade());
        clienteExistente.setEstado(clienteInput.getEstado());
        clienteExistente.setCep(clienteInput.getCep());
        clienteExistente.setEmail(clienteInput.getEmail());
        clienteExistente.setTelefone(clienteInput.getTelefone());

        return clienteRepository.save(clienteExistente);
    }
    
    public Boolean deletarCliente(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente == null) {
            return false;
        }

        clienteRepository.delete(cliente);

        return true;
    }

    public Cliente cliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    
    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }
}
