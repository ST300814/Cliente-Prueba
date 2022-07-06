package com.pureba.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pureba.cliente.model.Cliente;




@Controller 
public class VistasController {
	
	@Autowired
	private ClienteRepository clienteRepository; 

	@GetMapping({"/"})
	public String index(Model model) {
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clientes", clientes);
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String mostrarRegistro(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "nuevo";
	}
	
	@PostMapping("/nuevo")
	public String guardarCliente(Cliente cliente, RedirectAttributes redirect ) {
		clienteRepository.save(cliente);
		redirect.addFlashAttribute("msgExito", "El cliente ha sido agregado con exito");
		return "redirect:/";
	}
	
}