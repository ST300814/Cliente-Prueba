package com.pureba.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pureba.cliente.model.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void guardar (Cliente cliente) {
		clienteRepository.save(cliente);
		
	}
	
	public List<Cliente> obtenerTodos(){
		return clienteRepository.findAll();
		
	}
	
	public Cliente obtenerCliente(Integer id) {
		return clienteRepository.getOne(id);		
		
	}
	
	public void actualizar (Cliente cliente) {
		clienteRepository.save(cliente);
		
	}
	
	public void eliminar(Integer id) {
		clienteRepository.deleteById(id);
	}
}
