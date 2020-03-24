package com.brunocandido.cursomc.resoucers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunocandido.cursomc.domain.ClassificacaoProduto;

@RestController
@RequestMapping(value = "/classificacaoproduto")
public class ClassificacaoProdutoResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ClassificacaoProduto> classificacao() {

		ClassificacaoProduto c1 = new ClassificacaoProduto(1, "Mercado Interno");
		ClassificacaoProduto c2 = new ClassificacaoProduto(2, "Mercado Externo");

		List<ClassificacaoProduto> classificacao = new ArrayList<>();
		classificacao.add(c1);
		classificacao.add(c2);
		
		return classificacao;
		

	}

}
