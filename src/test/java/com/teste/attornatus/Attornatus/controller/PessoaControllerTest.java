package com.teste.attornatus.Attornatus.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.teste.attornatus.Attornatus.entity.Endereco;
import com.teste.attornatus.Attornatus.entity.Pessoa;
import com.teste.attornatus.Attornatus.repository.PessoaRepository;
import com.teste.attornatus.Attornatus.service.PessoaService;

public class PessoaControllerTest {

	@InjectMocks
	private PessoaService service;

	@Mock
	private PessoaRepository repository;
	
	List<Endereco> listEndereco = new ArrayList<Endereco>();
	Pessoa pessoa;
	
	Endereco endereco =  Endereco.builder().cep("81770817").cidade("Curitiba").enderecoPrincipal(false)
			.logradouro("Zires Ferreira Ribas").numero("765").build();
	
	@BeforeEach
	void setUp() {
		listEndereco.add(endereco);
		pessoa = Pessoa.builder().nome("Joao da Silva").dataNascimento("09/02/1990").endereco(listEndereco).build();
		
	}

	@Test
	void deveCriarPessoa() {
		when(repository.save(pessoa)).thenReturn(pessoa);
		
		Pessoa response = service.criarPessoa(pessoa);
		
		assertEquals(response, pessoa);
	}

}
