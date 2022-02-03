package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Qualifier("email")
//@Primary
//@Profile("prod")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties properties;
	
//	private boolean caixaAlta;
//	private String hostServidorSmpt;
//	
//	public NotificadorEmail(String hostServidorSmpt) {
//		this.hostServidorSmpt = hostServidorSmpt;
//	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
//		if(this.caixaAlta) mensagem = mensagem.toUpperCase();
		System.out.println("Host: " + properties.getHostServidor() + " Porta: " + properties.getPortaServidor());
		
		System.out.printf("Notificando %s através do e-mail %s: %s \n", 
				cliente.getNome(), cliente.getEmail(), /* this.hostServidorSmpt, */ mensagem);
	}

//	public void setCaixaAlta(boolean caixaAlta) {
//		this.caixaAlta = caixaAlta;
//	}
	
}
