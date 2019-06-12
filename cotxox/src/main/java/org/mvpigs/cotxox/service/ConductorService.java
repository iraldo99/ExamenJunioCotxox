package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductorService {

	@Autowired
	ConductorRepo conductorRepo;
	
	public void init() {
		
	}
	
	public Conductor recuperarConductor(String tarjeta) {
		return conductorRepo.findOne(tarjeta);
	}
	
}
