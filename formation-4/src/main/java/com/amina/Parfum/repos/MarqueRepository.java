package com.amina.Parfum.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amina.Parfum.entities.Marque;
@RepositoryRestResource(path = "mrq")
@CrossOrigin("*") //pour autoriser angular

public interface MarqueRepository extends JpaRepository<Marque, Long> {

}
