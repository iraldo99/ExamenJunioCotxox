package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {
	
	@Autowired
	CarreraRepo carreraRepo;
	
}
