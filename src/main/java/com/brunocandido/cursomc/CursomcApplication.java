package com.brunocandido.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunocandido.cursomc.domain.Categoria;
import com.brunocandido.cursomc.domain.ClassificacaoProduto;
import com.brunocandido.cursomc.domain.Produto;
import com.brunocandido.cursomc.domain.Sexo;
import com.brunocandido.cursomc.domain.TipoProduto;
import com.brunocandido.cursomc.repositories.CategoriaRepository;
import com.brunocandido.cursomc.repositories.ClassificacaoProdutoRepository;
import com.brunocandido.cursomc.repositories.ProdutoRepository;
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

	@Autowired
	ProdutoRepository produtoRepository;

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

		// Camisetas
		Produto p1 = new Produto(null, "Camiseta Lacoste", 40.00, "Branca");
		Produto p2 = new Produto(null, "Camiseta Lacoste", 40.00, "Preta");
		// Camisas
		Produto p3 = new Produto(null, "Camisa Tommy Higgifilguer", 80.00, "Branca");
		Produto p4 = new Produto(null, "Camisa Tommy Higgifilguer", 80.00, "Preta");
		// Camisa Polo
		Produto p5 = new Produto(null, "Camisa Polo Pollo", 80.00, "Amarela");
		Produto p6 = new Produto(null, "Camisa Polo Pollo", 80.00, "Vermelha");
		// Calça Djeans
		Produto p7 = new Produto(null, "Calça Djeans", 80.00, "Djeans");
		Produto p8 = new Produto(null, "Calça Djeans", 80.00, "Preta");
		// Bermudas
		Produto p9 = new Produto(null, "Bermuda Djeans", 80.00, "Djeans");
		Produto p10 = new Produto(null, "Bermuda Djeans", 80.00, "Preta");

		// Acrescentando o Categoria ao Produto

		c1.getProdutos().addAll(Arrays.asList(p1, p2));
		c2.getProdutos().addAll(Arrays.asList(p3, p4));
		c3.getProdutos().addAll(Arrays.asList(p5, p6));
		c4.getProdutos().addAll(Arrays.asList(p7, p8));
		c5.getProdutos().addAll(Arrays.asList(p9, p10));

		// Acrescentando o Produto a Categoria

		p1.getCategorias().addAll(Arrays.asList(c1));
		p2.getCategorias().addAll(Arrays.asList(c1));
		p3.getCategorias().addAll(Arrays.asList(c2));
		p4.getCategorias().addAll(Arrays.asList(c2));
		p5.getCategorias().addAll(Arrays.asList(c3));
		p6.getCategorias().addAll(Arrays.asList(c3));
		p7.getCategorias().addAll(Arrays.asList(c4));
		p8.getCategorias().addAll(Arrays.asList(c4));
		p9.getCategorias().addAll(Arrays.asList(c5));
		p10.getCategorias().addAll(Arrays.asList(c5));

		// Repository Categoria

		categoriaRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));

		// Repository Produto

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

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
