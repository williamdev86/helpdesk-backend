package com.william.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.william.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
