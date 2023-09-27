package com.teste.attornatus.Attornatus.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Endereco {
	
	@Id
	@GeneratedValue
	private Long id;
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	private Boolean enderecoPrincipal = Boolean.FALSE;

}
