package br.com.gof.factory;

public class FabricaNotificacoes {

	public Notificacao criarNotificacao(String entrada) {
		String entradaRecebida = entrada.trim();
		Notificacao recebe = null;

		if (entradaRecebida.toUpperCase() == null || entradaRecebida.isEmpty()) {
			return null;
		}

		switch (entradaRecebida.toUpperCase()) {
		case "SMS" -> recebe = new NotificacaoSMS();
		case "EMAIL" -> recebe = new NotificacaoEmail();
		default -> throw new IllegalArgumentException("Valor desconhecido " + entrada);
		}

		return recebe;

	}

}
