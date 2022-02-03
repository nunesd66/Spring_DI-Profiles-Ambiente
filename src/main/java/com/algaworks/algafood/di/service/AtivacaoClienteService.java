package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService /* implements InitializingBean, DisposableBean */ {

//	@Autowired(required = false)
//	@Qualifier("email")
//	@Autowired
//	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//	private Notificador notificador;
//	private List<Notificador> notificadores;

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
//	@PostConstruct
//	public void init() {
//		System.out.println("INIT");
//	}
//	@PreDestroy
//	public void destroy() {
//		System.out.println("DESTROY");
//	}
	
//	@Override
//	public void destroy() throws Exception {}
//	@Override
//	public void afterPropertiesSet() throws Exception {}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
//		for(Notificador notificador : notificadores) {
//			notificador.notificar(cliente, "Cadastro ativo no sistema.");
//		}
//		this.notificador.notificar(cliente, "Cadastro ativo no sistema.");
	}
	
}
