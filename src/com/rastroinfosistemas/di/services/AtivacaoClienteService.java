package com.rastroinfosistemas.di.services;

import com.rastroinfosistemas.di.modelo.Cliente;
import com.rastroinfosistemas.di.notificador.Notificador;

public class AtivacaoClienteService {

	Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;

	}

	public void ativar(Cliente cliente) {
		cliente.isAtivo();
		notificador.notificar(cliente, "Seu Cadastro esta ativo!'");
	}

}
