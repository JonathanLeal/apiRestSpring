package com.apiRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.models.Persona;
import com.apiRest.service.PersonaService;

@RestController
@RequestMapping(path = "api")
public class PersonaController {
	
	@Autowired
	private PersonaService perSer;
	
	@GetMapping("/lista")
	public ResponseEntity<?> obtener(){
		return ResponseEntity.status(HttpStatus.OK).body(perSer.listar());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> obtenerUno(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(perSer.encontrarPorId(id));
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@RequestBody Persona persona){
		return ResponseEntity.status(HttpStatus.OK).body(perSer.guardar(persona));
	}
}
