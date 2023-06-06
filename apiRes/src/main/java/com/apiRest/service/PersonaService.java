package com.apiRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiRest.models.Persona;
import com.apiRest.repository.PersonaRepository;

@Service
public class PersonaService implements BaseService<Persona>{

	@Autowired
	private PersonaRepository perRepo;
	
	@Override
	@Transactional
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>) perRepo.findAll();
	}

	@Override
	@Transactional
	public Persona encontrarPorId(Long id) {
		Optional<Persona> entityOptional = perRepo.findById(id);
		return entityOptional.get();
	}

	@Override
	@Transactional
	public Persona guardar(Persona entity) {
		entity = perRepo.save(entity);
		return entity;
	}

	@Override
	@Transactional
	public Persona editar(Long id, Persona entity) {
		Optional<Persona> entityOptional = perRepo.findById(id);
		Persona persona = entityOptional.get();
		persona = perRepo.save(persona);
		return persona;
	}

	@Override
	@Transactional
	public boolean eliminar(Long id) {
		if (perRepo.existsById(id)) {
			perRepo.deleteById(id);
			return true;
		}
		return false;
	}

}
