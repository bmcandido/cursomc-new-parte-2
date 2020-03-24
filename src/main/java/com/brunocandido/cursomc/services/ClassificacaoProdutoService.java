package com.brunocandido.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.brunocandido.cursomc.domain.ClassificacaoProduto;
import com.brunocandido.cursomc.repositories.ClassificacaoProdutoRepository;

@Service
public class ClassificacaoProdutoService {
	
	@Autowired // Anotação do Spring
	ClassificacaoProdutoRepository classificacao;
	
	public ClassificacaoProduto buscar(Integer id) {
		Optional<ClassificacaoProduto> obj = classificacao.findById(id);
		return obj.orElse(null);
	}
	

}
