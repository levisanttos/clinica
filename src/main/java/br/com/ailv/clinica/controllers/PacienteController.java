package br.com.ailv.clinica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ResponseEntity<Paciente> getPaciente(@PathVariable Long id) {
		Optional<Paciente> pacienteOptional = this.pacienteRepository.findById(id);
		
		if (pacienteOptional.isPresent()) {
			return new ResponseEntity<Paciente>(pacienteOptional.get(), HttpStatus.OK);
		}
		
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public ResponseEntity<Paciente> save(@RequestBody Paciente paciente) {
		this.pacienteRepository.save(paciente);
		
		return new ResponseEntity<Paciente>(paciente, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Paciente> update(@PathVariable Long id, @RequestBody Paciente paciente) {

		Optional<Paciente> pacienteOptional = this.pacienteRepository.findById(id);

		if (pacienteOptional.isPresent()) {
			
			Paciente atualizar = pacienteOptional.get();
			atualizar.setCpf(paciente.getCpf());
			atualizar.setDataNascimento(paciente.getDataNascimento());
			atualizar.setEmail(paciente.getEmail());
			atualizar.setNome(paciente.getNome());
			atualizar.setRg(paciente.getRg());
			atualizar.setSobrenome(paciente.getSobrenome());
			this.pacienteRepository.saveAndFlush(atualizar);

			return new ResponseEntity<Paciente>(atualizar, HttpStatus.OK);
		}
		
		return ResponseEntity.notFound().build();

	}
}
