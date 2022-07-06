package com.pureba.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pureba.cliente.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("api/cliente")
	public List<Cliente> obtenerClientes() {
		List<Cliente> listaClientes = new ArrayList<>();

		Cliente c = new Cliente();
		c.setId(1);
		c.setNombre("Ely");
		c.setApellido("Terrazas");
		c.setFechaN("22:02:1992");
		c.setCelular("7223456872");
		c.setEmail("terrarias@gmail.com");

		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNombre("Eliot");
		c1.setApellido("Salter");
		c.setFechaN("21:03:2016");
		c1.setCelular("7223450972");
		c1.setEmail("elisal@gmail.com");

		Cliente c2 = new Cliente();
		c2.setId(1);
		c2.setNombre("Ely");
		c2.setApellido("Terrazas");
		c.setFechaN("26:03:2019");
		c2.setCelular("7223434872");
		c2.setEmail("eisal@gmail.com");

		listaClientes.add(c);
		listaClientes.add(c1);
		listaClientes.add(c2);

		return listaClientes;
	}

	@PostMapping("api/clientes")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		System.out.println(cliente);
		clienteService.guardar(cliente);
		return cliente;
	}

	@GetMapping("api/clientes")
	public List<Cliente> obtener() {
		return clienteService.obtenerTodos();

	}
	
	@GetMapping("api/clientes/{id}")
	public Cliente obtenerCliente(@PathVariable ("id") Integer id) {
		return clienteService.obtenerCliente(id);
	}
	
	@PutMapping("api/clientes")
	public void actualizarCliente(@RequestBody Cliente cliente ) {
		clienteService.actualizar(cliente);
	}
	
	@DeleteMapping("api/clientes/{id}")
	public void eliminar(@PathVariable("id") Integer id  ) {
		clienteService.eliminar(id);
	}
}
