package com.william.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.william.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
