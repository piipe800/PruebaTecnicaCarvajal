package com.prueba.adn.service;

import java.util.List;

import com.prueba.adn.dto.AdnDto;


public interface AdnService {

	public List<AdnDto> mostrar();
	
	public void agregarAdn(AdnDto adn);

	public List<AdnDto> list();
	
	
}
