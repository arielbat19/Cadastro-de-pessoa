package com.teste.attornatus.Attornatus.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String dataNascimento;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Endereco> endereco;

}
