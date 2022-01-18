package com.william.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.william.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
