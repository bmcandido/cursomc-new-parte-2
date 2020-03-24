package com.brunocandido.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunocandido.cursomc.domain.Categoria;
import com.brunocandido.cursomc.repositories.CategoriaRepository;

//2º Camada - Chama Repository

@Service
public class CategoriaServices {

	@Autowired // Anotação do Spring

	CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
