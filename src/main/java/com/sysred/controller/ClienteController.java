package com.sysred.controller;

import com.sysred.dao.ClienteService;
import com.sysred.dao.PlanService;
import com.sysred.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClienteController {
 
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	PlanService planService;
	
	@GetMapping("/listarclientes")
	public String listarClientes(Model modelo) {
		List<Cliente> cliente = clienteService.findAll();
		modelo.addAttribute("listacliente",cliente);	
		modelo.addAttribute("titulo", "Listado Clientes");
		return "listaCliente";
	}	
	
	@GetMapping("/formcliente")
	public String crearPlan(Model modelo) {
		Cliente cliente = new Cliente();
		modelo.addAttribute("cliente", cliente);
		modelo.addAttribute("listaplan",planService.findAll());
		modelo.addAttribute("tituloformulariocliente", "Nuevo Cliente");
		return "formCliente";
	}
	
	@RequestMapping(value = "/editarcliente")
	public String editarPlan(@RequestParam(name = "id") Long id, Model modelo) {
		Cliente cliente = clienteService.findOne(id);
		modelo.addAttribute("cliente", cliente);
		modelo.addAttribute("listaplan",planService.findAll());
		modelo.addAttribute("tituloformulariocliente", "Modificar Cliente");
		return "formCliente";
	}
	
	@PostMapping("/savecliente")
	public String SaveCliente(Cliente cliente, Model modelo, RedirectAttributes flash) {
		clienteService.saveCliente(cliente);
		flash.addFlashAttribute("success", "Cliente creado correctamente").addFlashAttribute("clase", "success");
		return "redirect:/listarclientes";
	}

}
