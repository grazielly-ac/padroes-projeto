package br.com.gof.factory;

public class NotificacaoSMS implements Notificacao {

	@Override
	public void notificarUsuario() {
		System.out.println("Enviando notificação de SMS");

	}

}
