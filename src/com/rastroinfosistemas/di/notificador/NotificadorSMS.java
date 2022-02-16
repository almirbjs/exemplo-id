package com.rastroinfosistemas.di.notificador;

import com.rastroinfosistemas.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("notificado %s atraves do SMS %s: %s\n", cliente.getNome(), cliente.getEmail(),
				cliente.getTelefone(), mensagem);
	}
}
