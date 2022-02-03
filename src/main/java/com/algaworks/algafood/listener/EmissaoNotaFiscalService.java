package com.algaworks.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void emitindoNotaFiscal(ClienteAtivadoEvent event) {
		System.out.println("Emitindo NF-e para " + event.getCliente().getNome());
	}
	
}
