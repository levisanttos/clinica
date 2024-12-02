package br.com.ailv.clinica;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ailv.clinica.entity.Paciente;
import br.com.ailv.clinica.repository.PacienteRepository;

@SpringBootTest
class ClinicaApplicationTests {

	@Autowired
	private PacienteRepository pacienteRepository;

	@Test
	void contextLoads() {
	}

	
	public void testSave() {
		Paciente paciente1 = Paciente.builder().cpf("12312312332").dataNascimento(LocalDate.of(1982, 9, 22))
				.email("levi@gmail.com").nome("Levi").sobrenome("Aparecido dos Santos").rg("121231233").build();
		
		Paciente paciente2 = Paciente.builder().cpf("98798798799").dataNascimento(LocalDate.of(2006, 10, 24))
				.email("vitor@gmail.com").nome("Vitor").sobrenome("Dias dos Santos").rg("90900990").build();
		
		Paciente paciente3 = Paciente.builder().cpf("12345678999").dataNascimento(LocalDate.of(2011, 1, 29))
				.email("artur@gmail.com").nome("Artur").sobrenome("Dias dos Santos").rg("112221112").build();
		
		Paciente paciente4 = Paciente.builder().cpf("99999878909").dataNascimento(LocalDate.of(2013, 2, 25))
				.email("italo@gmail.com").nome("Italo").sobrenome("Dias dos Santos").rg("121231244").build();
		this.pacienteRepository.save(paciente1);
		this.pacienteRepository.save(paciente2);
		this.pacienteRepository.save(paciente3);
		this.pacienteRepository.save(paciente4);
	}

}
