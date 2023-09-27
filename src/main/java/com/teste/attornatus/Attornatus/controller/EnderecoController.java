package com.teste.attornatus.Attornatus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.attornatus.Attornatus.entity.Endereco;
import com.teste.attornatus.Attornatus.service.EnderecoService;

@RestController
@RequestMapping("api/v1/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService service;
	
	@PostMapping("/criarEndereco")
	public ResponseEntity<Endereco> criarEndereco(@RequestBody Endereco endereco) {
		return ResponseEntity.ok().body(service.criarEndereco(endereco));
	}

}
