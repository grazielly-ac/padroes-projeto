package br.com.gof.factory;

public class FabricaNotificacoes {

	public Notificacao criarNotificacao(String entrada) {
		Notificacao recebe = null;

		if (entrada.toUpperCase() == null || entrada.isEmpty()) {
			throw new IllegalArgumentException("Valor inválido");
		}

		switch (entrada.toUpperCase()) {
		case "SMS" -> recebe = new NotificacaoEmail();
		case "EMAIL" -> recebe = new NotificacaoEmail();
		default -> throw new IllegalArgumentException("Valor desconhecido " + entrada);
		}

		return recebe;

	}

}
