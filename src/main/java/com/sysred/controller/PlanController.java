package com.sysred.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sysred.dao.PlanService;
import com.sysred.model.Plan;

@Controller
public class PlanController {

	@Autowired
	private PlanService planService;

	@RequestMapping(value = { "/", "/listarplanes" })
	public String listarPlanes(Model modelo) {
		List<Plan> plan = planService.findAll();
		modelo.addAttribute("listaplan", plan);
		modelo.addAttribute("titulo", "Listado Planes");
		return "listaPlan";
	}

	@GetMapping("/formplan")
	public String crearPlan(Model modelo) {
		Plan plan = new Plan();
		modelo.addAttribute("plan", plan);
		modelo.addAttribute("tituloformularioplan", "Nuevo Plan");
		return "formPlan";
	}

	@RequestMapping(value = "/editarplan")
	public String editarPlan(@RequestParam(name = "id") Long id, Model modelo) {
		Plan plan = planService.findOne(id);
		modelo.addAttribute("plan", plan);
		modelo.addAttribute("tituloformularioplan", "Modificar Plan");
		return "formPlan";
	}

	@PostMapping("/saveplan")
	public String SavePlan(Plan plan, Model modelo, RedirectAttributes flash) {
		planService.save(plan);
		flash.addFlashAttribute("success", "Plan creado correctamente").addFlashAttribute("clase", "success");
		return "redirect:/listarplanes";
	}

	@GetMapping("/eliminarplan/{id}")
	public String eliminarPlan(@PathVariable Long id, SessionStatus status, Model modelo) {
		planService.delete(id);
		status.setComplete();
		return "redirect:/listarplanes";
	}

}
