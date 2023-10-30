package br.com.etcesp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.etcesp.model.Cliente;
import br.com.etcesp.repository.ClienteRepository;

@CrossOrigin(origins = {"http://localhost:3000"})
@Controller
public class ClienteControllerGraphQL {
	
	@Autowired
	ClienteRepository repository;

	ClienteControllerGraphQL(ClienteRepository clienteRepository) {
		this.repository = clienteRepository;
	}
	 
	@QueryMapping
    public Cliente clienteById(@Argument long id) {
		Optional<Cliente> cliente = repository.findById(id);
		
        return cliente.get();
    }
}
