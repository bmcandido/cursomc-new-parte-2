package com.brunocandido.cursomc.resoucers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunocandido.cursomc.domain.TipoProduto;

@RestController
@RequestMapping(value = "/tipoproduto")
public class TipoProdutoResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<TipoProduto> tipoproduto(){
		TipoProduto t1 = new TipoProduto(1,"Vestuario");
		TipoProduto t2 = new TipoProduto(2,"Calçados");
		TipoProduto t3 = new TipoProduto(2,"Jaquetas");
		
		List<TipoProduto> tipo = new ArrayList<>();
		tipo.add(t1);
		tipo.add(t2);
		tipo.add(t3);
		
		return tipo;
		
		
		
	}

}
