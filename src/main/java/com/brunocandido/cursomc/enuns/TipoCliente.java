package com.brunocandido.cursomc.enuns;

public enum TipoCliente {

	SEMTIPO(0, "Sem tipo"), PESSOAJURIDICA(1, "Pessoa Jurídica"), PESSOAFISICA(2, "Pessoa Física");

	private Integer id;
	private String descricao;

	private TipoCliente(Integer cod, String descricao) { //Construtor ENUM = Privite
		this.id = cod;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod)  { //Metodo quando estatico eu posso rodar ele mesmo sem estar estanciado

		if (cod == null) {
			return null;
		}

		for (TipoCliente x : TipoCliente.values()) { //Percorre todos .getvalues possiveis dentro de tipoCliente
			if (cod.equals(x.getId())) {
				return x;
			}

			throw new IllegalArgumentException("Erouuuuuu o Cod." + cod);

		}
		return null;

	}

}
