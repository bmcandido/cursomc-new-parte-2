package com.brunocandido.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.brunocandido.cursomc.domain.Sexo;
import com.brunocandido.cursomc.repositories.SexoRepository;

@Service
public class SexoService {
	
	@Autowired
	SexoRepository sexo;
	
	public Sexo buscar(Integer id) {
		Optional<Sexo> obj = sexo.findById(id);
		return obj.orElse(null);
	}
	

}
