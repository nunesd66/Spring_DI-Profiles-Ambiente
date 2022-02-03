package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;

//@Profile("dev")
//@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//@Component
public class NotificadorEmailMock implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("MOCK: Notificando %s através do e-mail %s: %s \n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
