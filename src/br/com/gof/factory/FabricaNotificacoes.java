package br.com.gof.factory;

public class FabricaNotificacoes {

	public Notificacao criarNotificacao(String entrada) {
		Notificacao recebe = null;

		if (entrada == null || entrada.toString().isEmpty()) {
			throw new IllegalArgumentException("Valor inválido");
		}

		switch (entrada.toUpperCase()) {
			case "SMS" -> recebe = new NotificacaoSMS();
			case "EMAIL" -> recebe = new NotificacaoEmail();
			default -> throw new IllegalArgumentException("Código desconhecido");
		}

		return recebe;

	}

	enum CodigoNotificao {

		SMS(1), EMAIL(2);

		private int codigo;

		private CodigoNotificao(int codigo) {
			this.codigo = codigo;
		}

		public int getCodigo() {
			return codigo;
		}
	}

}
