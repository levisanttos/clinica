package br.com.ailv.clinica.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private LocalDate dataNascimento;
	
	private String email;
	
	private String cpf;
	
	private String rg;
	
	@OneToMany(mappedBy = "paciente")
	private List<Clinica> clinicas;
}
