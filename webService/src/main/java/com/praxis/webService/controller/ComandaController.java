package com.praxis.webService.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praxis.webService.controller.dto.ComandaDto;
import com.praxis.webService.service.ComandaService;

@Controller
public class ComandaController {
	
	ComandaService comandaService;
	
	ComandaController(ComandaService comandaService){
		this.comandaService = comandaService;
	}

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		List<ComandaDto> comandas = comandaService.findAll();
		mav.addObject("comandas", comandas);
		mav.setViewName("/index");
		return mav;
	}
	
	@PostMapping("/filtro")
	public String filtro(Model model, @RequestParam String txtIdComanda, @RequestParam String txtRutGarzon) {
		List<ComandaDto> comandas = comandaService.filtro(txtIdComanda, txtRutGarzon);
		model.addAttribute("comandas", comandas);
		return "index";
	}
	
}
