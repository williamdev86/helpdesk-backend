package com.william.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.william.helpdesk.domain.Chamado;
import com.william.helpdesk.domain.Cliente;
import com.william.helpdesk.domain.Tecnico;
import com.william.helpdesk.domain.enums.Perfil;
import com.william.helpdesk.domain.enums.Prioridade;
import com.william.helpdesk.domain.enums.Status;
import com.william.helpdesk.repositories.ChamadoRepository;
import com.william.helpdesk.repositories.ClienteRepository;
import com.william.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@Autowired 
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "William Soares", "331.546.458-88", "willliam@gmail.com","123" );
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Vangerlandio Reinaldo","376.386.100-91", "vangerlandio@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01","Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

		
	}

}
