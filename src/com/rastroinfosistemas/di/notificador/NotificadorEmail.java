package com.rastroinfosistemas.di.notificador;

import com.rastroinfosistemas.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("notificado %s atraves do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
