package com.teste.attornatus.Attornatus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.attornatus.Attornatus.entity.Endereco;
import com.teste.attornatus.Attornatus.entity.Pessoa;
import com.teste.attornatus.Attornatus.service.PessoaService;

@RestController
@RequestMapping("api/v1/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@PostMapping("/criar")
	public ResponseEntity<Pessoa> criarPessoa(@RequestBody Pessoa pessoa) {
		return ResponseEntity.ok().body(service.criarPessoa(pessoa));
	}
	
	@GetMapping("/buscarPorId/{id}")
	public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.buscarPessoa(id));
	}
	
	@PutMapping("/atualizar/{id}")
	public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
		return ResponseEntity.ok().body(service.atualizar(id, pessoa));
	}
	
	@GetMapping("/buscarTodasPessoas")
	public ResponseEntity<List<Pessoa>> buscarTodasPessoas() {
		return ResponseEntity.ok().body(service.buscarPessoas());
	}
	
	@GetMapping("/buscarEnderecoPessoa/{id}")
	public ResponseEntity<List<Endereco>> buscarEndereco(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.buscarEnderecoPessoa(id));
	}

}
