package com.brunocandido.cursomc.resoucers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunocandido.cursomc.domain.Sexo;

@RestController
@RequestMapping("/sexo")
public class SexoResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Sexo> sexo() {

		Sexo s1 = new Sexo("M", "Masculino");
		Sexo s2 = new Sexo("F", "Feminino");

		List<Sexo> sexo = new ArrayList<>();

		sexo.add(s1);
		sexo.add(s2);
		return sexo;

	}

}
