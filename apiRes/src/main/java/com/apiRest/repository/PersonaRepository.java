package com.apiRest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apiRest.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
	
}
