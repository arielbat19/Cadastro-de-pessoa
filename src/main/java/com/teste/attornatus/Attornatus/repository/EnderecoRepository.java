package com.teste.attornatus.Attornatus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.attornatus.Attornatus.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
