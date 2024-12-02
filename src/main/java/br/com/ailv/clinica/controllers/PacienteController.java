package br.com.ailv.clinica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ailv.clinica.entity.Paciente;
import br.com.ailv.clinica.repository.PacienteRepository;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

	private final PacienteRepository pacienteRepository;

	public PacienteController(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}
	
	@GetMapping
	public ResponseEntity<List<Paciente>> getPacientes() {
		
		return new ResponseEntity<>(this.pacienteRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> getPaciente(@RequestParam Long id) {
		Optional<Paciente> pacienteOptional = this.pacienteRepository.findById(id);
		
		if (pacienteOptional.isPresent()) {
			return new ResponseEntity<Paciente>(pacienteOptional.get(), HttpStatus.OK);
		}
		
		return ResponseEntity.noContent().build();
	}
}
