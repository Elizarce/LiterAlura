package com.aluracursos.LiterAlura;

import com.aluracursos.LiterAlura.principal.Principal;
import com.aluracursos.LiterAlura.repository.AutorRepository;
import com.aluracursos.LiterAlura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner{
	@Autowired
	private LibroRepository libroRepository;
	@Autowired
	private AutorRepository autorRepository;
	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository , autorRepository);
		principal.muestraElMenu();

	}

}
