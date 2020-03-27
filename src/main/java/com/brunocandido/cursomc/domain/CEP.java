package com.brunocandido.cursomc.domain;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {

	private Integer id;
	private String bairro;
	private String Endereco;
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	private String cep;

	public CEP() {
	}

	public CEP(String cepe) throws Exception {
		super();
		ViaCEPClient cliente = new ViaCEPClient();
		ViaCEPEndereco codigoCep = cliente.getEndereco(cepe);
		bairro = codigoCep.getBairro();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
