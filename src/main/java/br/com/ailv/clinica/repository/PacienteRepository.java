package br.com.ailv.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailv.clinica.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
