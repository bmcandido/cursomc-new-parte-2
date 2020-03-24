package com.brunocandido.cursomc.resoucers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.brunocandido.cursomc.domain.Sexo;
import com.brunocandido.cursomc.services.SexoService;

@RestController
@RequestMapping("/sexo")
public class SexoResource {
    
	@Autowired 
	SexoService service;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	
	public  ResponseEntity<?> find(@PathVariable Integer id) {

		Sexo obj = service.buscar(id); // Acessa o Objeto de Repositorio CategoriaRepository

		return ResponseEntity.ok().body(obj); // Retornando o Objeto Encontrado na CAtegoria Repository

	}

}
