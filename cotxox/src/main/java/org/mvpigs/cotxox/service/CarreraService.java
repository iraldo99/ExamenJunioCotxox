package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {
	
	@Autowired
	CarreraRepo carreraRepo;

	public Long crearCarrera(String tarjeta, String origen, String destino, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public Carrera recuperaCarrera(Long idCarrera) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
