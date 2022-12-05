package br.com.gof.singleton;

public class AcessoSistema2 {
	
	//inicializa no atributo, jvm pode criar sem ser necessária
	private static AcessoSistema2 instance = new AcessoSistema2();
	
	private AcessoSistema2() {
		
	}

	public static AcessoSistema2 getInstance() {
		
		return instance;
	}
	
	public void realizarLogin() {
		
	}
}
