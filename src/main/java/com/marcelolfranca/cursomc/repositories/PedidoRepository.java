package com.marcelolfranca.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelolfranca.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {

}