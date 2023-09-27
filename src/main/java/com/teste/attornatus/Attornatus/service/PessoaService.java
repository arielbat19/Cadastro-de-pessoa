package com.teste.attornatus.Attornatus.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.attornatus.Attornatus.entity.Endereco;
import com.teste.attornatus.Attornatus.entity.Pessoa;
import com.teste.attornatus.Attornatus.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	private Pessoa findById(Long id) {
		Optional<Pessoa> response = pessoaRepository.findById(id);
		return response.orElseThrow(() -> new ObjectNotFoundException(
				"Pessoa não encontrada! Id: " + id , null));
	}

	public Pessoa criarPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public Pessoa atualizar(Long id, Pessoa pessoa) {
		Pessoa newPessoa = findById(id);
		
		newPessoa.setEndereco(pessoa.getEndereco());
		newPessoa.setNome(pessoa.getNome());
		return pessoaRepository.save(newPessoa);
	}

	public Pessoa buscarPessoa(Long id) {
		Pessoa pessoa = findById(id);
		return pessoa;
	}

	public List<Pessoa> buscarPessoas() {
		List<Pessoa> pessoa = pessoaRepository.findAll();
		return pessoa;
	}
	
	public List<Endereco> buscarEnderecoPessoa(Long id) {
		Pessoa pessoa = findById(id);
		List<Endereco> response = new ArrayList<Endereco>();
		response = pessoa.getEndereco();
		return response;
	}

}
