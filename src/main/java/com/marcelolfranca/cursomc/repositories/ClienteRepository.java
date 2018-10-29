package com.marcelolfranca.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelolfranca.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}