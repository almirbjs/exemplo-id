package com.rastroinfosistemas.di.notificador;

import com.rastroinfosistemas.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
