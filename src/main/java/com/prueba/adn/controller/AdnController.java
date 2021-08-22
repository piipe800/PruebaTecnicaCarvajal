package com.prueba.adn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.adn.service.AdnService;

@RestController
@RequestMapping("/baseadn")
@CrossOrigin(origins = "*")
public class AdnController {

	@Autowired
	private AdnService adnService;
	
	@RequestMapping(value="/pruebaadn", method=RequestMethod.GET)
	public String consultar(Model model) {
		model.addAttribute("lstAdns", adnService.mostrar());
		return "/pruebaadn";
	} 
	 

	@GetMapping("/nombre")
	public String nombreSitio() {
		return "probando pagina titulo";
	}
	
	@GetMapping("/descripcion")
	public String descripcionSitio() {
		return "aqui la descripcion";
	}
}
