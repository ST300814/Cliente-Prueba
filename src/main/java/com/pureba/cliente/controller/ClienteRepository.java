package com.pureba.cliente.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pureba.cliente.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

	
	
}
