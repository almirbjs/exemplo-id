package com.rastroinfosistemas.di.services;

import com.rastroinfosistemas.di.modelo.Cliente;
import com.rastroinfosistemas.di.modelo.Produto;
import com.rastroinfosistemas.di.notificador.NotificadorEmail;

public class EmissaoNotaFiscalServices {

	public void emitir(Cliente cliente, Produto produto) {
		// TODO Emite Nota fiscal Aqui...
		NotificadorEmail notificadorEmail=new NotificadorEmail();
		notificadorEmail.notificar(cliente, "Seu cadastro esta ativo!");

	}
}
