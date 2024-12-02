package br.com.ailv.clinica.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_clinica")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	private String nomeComponente;
	
	private String valorComponente;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dataHoraAtendimento;
}
