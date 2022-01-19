package com.william.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.william.helpdesk.domain.Chamado;
import com.william.helpdesk.domain.Cliente;
import com.william.helpdesk.domain.Tecnico;
import com.william.helpdesk.domain.enums.Perfil;
import com.william.helpdesk.domain.enums.Prioridade;
import com.william.helpdesk.domain.enums.Status;
import com.william.helpdesk.repositories.ChamadoRepository;
import com.william.helpdesk.repositories.ClienteRepository;
import com.william.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@Autowired 
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
				
		Tecnico tec1 = new Tecnico(null, "William Soares", "331.546.458-88", "willliam@gmail.com","123" );
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Carlos Magno", "182.642.550-00", "carlos@gmail.com","123" );
		tec2.addPerfil(Perfil.ADMIN);
		
		Tecnico tec3 = new Tecnico(null, "Jackson Martins", "421.458.190-37", "jackson@gmail.com","123" );
		tec3.addPerfil(Perfil.ADMIN);
		
		Tecnico tec4 = new Tecnico(null, "Alberto Sales", "098.323.810-37", "alberto@gmail.com","123" );
		tec4.addPerfil(Perfil.ADMIN);
		
		Tecnico tec5 = new Tecnico(null, "Sergio Junior", "328.945.970-53", "sergio@gmail.com","123" );
		tec5.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Sales Albino","376.386.100-91", "sales@gmail.com", "123");
		
		Cliente cli2 = new Cliente(null, "Orion Moreira","647.860.080-79", "orion@gmail.com", "123");
		
		Cliente cli3 = new Cliente(null, "Thalis Vieira","188.808.470-74", "thalis@gmail.com", "123");
		
		Cliente cli4 = new Cliente(null, "Marcelo Santos","083.910.960-17", "marcelo@gmail.com", "123");

		Cliente cli5 = new Cliente(null, " Maicon Cruz","708.908.590-27", "maicon@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01","Primeiro chamado", tec2, cli3);
		
		Chamado c2 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 02","Segundo chamado", tec4, cli2);
		
		Chamado c3 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 03","Terceiro chamado", tec3, cli4);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}
