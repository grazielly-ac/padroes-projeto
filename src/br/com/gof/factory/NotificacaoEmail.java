package br.com.gof.factory;

public class NotificacaoEmail implements Notificacao {

	@Override
	public void notificarUsuario() {
		System.out.println("Enviando notificação de E-mail");

	}

}
