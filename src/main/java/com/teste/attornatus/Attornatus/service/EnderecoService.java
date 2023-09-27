package com.teste.attornatus.Attornatus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.attornatus.Attornatus.entity.Endereco;
import com.teste.attornatus.Attornatus.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco criarEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
}
