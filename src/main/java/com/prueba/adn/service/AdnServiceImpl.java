package com.prueba.adn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.adn.dto.AdnDto;
import com.prueba.adn.entity.ADN;
import com.prueba.adn.repository.AdnRepository;

@Service
public class AdnServiceImpl implements AdnService{

	@Autowired
	private AdnRepository repo;
	

	@Override
	public List<AdnDto> mostrar() {
		List<ADN> lstTemp = repo.findAll();
		List<AdnDto> lstAdns = new ArrayList<AdnDto>();
		AdnDto adn = new AdnDto();
		
		for(ADN u : lstTemp) {
			adn = new AdnDto();
			adn.setBaseAdn1(u.getBaseAdn1());
			adn.setBaseAdn2(u.getBaseAdn2());
			adn.setBaseAdn3(u.getBaseAdn3());
			adn.setBaseAdn4(u.getBaseAdn4());
			adn.setBaseAdn1(u.getBaseAdn5());
			adn.setBaseAdn1(u.getBaseAdn6());
			lstAdns.add(adn);
		}
		
		return lstAdns;
	}

	@Override
	public void agregarAdn(AdnDto adn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdnDto> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
