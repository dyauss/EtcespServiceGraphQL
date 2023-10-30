package br.com.etcesp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etcesp.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
