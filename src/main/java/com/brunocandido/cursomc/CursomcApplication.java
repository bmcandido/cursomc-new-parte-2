package com.brunocandido.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunocandido.cursomc.domain.Categoria;
import com.brunocandido.cursomc.domain.ClassificacaoProduto;
import com.brunocandido.cursomc.domain.Sexo;
import com.brunocandido.cursomc.domain.TipoProduto;
import com.brunocandido.cursomc.repositories.CategoriaRepository;
import com.brunocandido.cursomc.repositories.ClassificacaoProdutoRepository;
import com.brunocandido.cursomc.repositories.SexoRepository;
import com.brunocandido.cursomc.repositories.TipoProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner { // Acrescentei o implemento CommandLineRunner serve para
																// Dar o Start no Banco nas opçoes de tabelas
																// cadastradas conforme exemplo abaixo
	@Autowired
	CategoriaRepository categoriaRepository; // Acrescenta na tabela Categoria
	@Autowired
	ClassificacaoProdutoRepository classificacaoProdutoRepository;
	@Autowired
	SexoRepository sexorepository;
	@Autowired
	TipoProdutoRepository tipoProdutoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Dominio Categoria

		Categoria c1 = new Categoria(null, "Camisetas");
		Categoria c2 = new Categoria(null, "Camisas");
		Categoria c3 = new Categoria(null, "Camisas Polo");
		Categoria c4 = new Categoria(null, "Calças Djeans");
		Categoria c5 = new Categoria(null, "Bermudas");

		// Repository Categoria

		categoriaRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));

		// Dominio ClassificacaoProduto
		ClassificacaoProduto cp1 = new ClassificacaoProduto(null, "Masculino");
		ClassificacaoProduto cp2 = new ClassificacaoProduto(null, "Feminino");

		// Repository ClassificacaoProdutoRepository
		classificacaoProdutoRepository.saveAll(Arrays.asList(cp1, cp2));

		// Dominio Sexo

		Sexo s1 = new Sexo(null, "Masculino");
		Sexo s2 = new Sexo(null, "Feminino");

		// Repository Sexo
		sexorepository.saveAll(Arrays.asList(s1, s2));

		// Dominio Tipo de Produto

		TipoProduto tp1 = new TipoProduto(null, "Revenda");

		// Repository

		tipoProdutoRepository.saveAll(Arrays.asList(tp1));

	}

}
