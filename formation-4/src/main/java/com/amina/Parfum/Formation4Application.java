package com.amina.Parfum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.amina.Parfum.entities.Marque;
import com.amina.Parfum.entities.Parfum;

@SpringBootApplication
public class Formation4Application implements CommandLineRunner  {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(Formation4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			repositoryRestConfiguration.exposeIdsFor(Parfum.class,Marque.class);
		
	}

}
