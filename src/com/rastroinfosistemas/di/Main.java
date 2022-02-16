package com.rastroinfosistemas.di;

import com.rastroinfosistemas.di.modelo.Cliente;
import com.rastroinfosistemas.di.notificador.Notificador;
import com.rastroinfosistemas.di.notificador.NotificadorEmail;
import com.rastroinfosistemas.di.services.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {

		Cliente joao = new Cliente("João", "joao@gmail.com", "32356452", true);
		Cliente maria = new Cliente("Maria", "jo@gmail.com", "32356487", true);

		Notificador notificador = new NotificadorEmail();

		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		ativacaoClienteService.ativar(joao);
		ativacaoClienteService.ativar(maria);

	}
}
