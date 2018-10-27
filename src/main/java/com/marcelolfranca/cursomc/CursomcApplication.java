package com.marcelolfranca.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcelolfranca.cursomc.domain.Categoria;
import com.marcelolfranca.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	//método implementado apenas para inserir algumas categorias ao banco de forma automática
	//O método run tem que ser implementado quando usa-se o implements CommandLineRunner
	//É executado sempre que o app é iniciado
	@Override
	public void run(String... args) throws Exception {

		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	
}
