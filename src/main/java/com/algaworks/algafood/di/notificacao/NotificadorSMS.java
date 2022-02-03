package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Qualifier("sms")
//@Primary
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
//	private boolean caixaAlta;
//	private String hostServidorSmpt;
//	
//	public NotificadorEmail(String hostServidorSmpt) {
//		this.hostServidorSmpt = hostServidorSmpt;
//	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
//		if(this.caixaAlta) mensagem = mensagem.toUpperCase();
		
		System.out.printf("Notificando %s por SMS através do telefone %s: %s \n", 
				cliente.getNome(), cliente.getTelefone(), /* this.hostServidorSmpt, */ mensagem);
	}

//	public void setCaixaAlta(boolean caixaAlta) {
//		this.caixaAlta = caixaAlta;
//	}
	
}
