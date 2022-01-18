package com.william.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.william.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
