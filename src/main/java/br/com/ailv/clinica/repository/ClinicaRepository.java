package br.com.ailv.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailv.clinica.entity.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {

}
