package br.com.gof.singleton;

public class AcessoSistema {
	
	private static AcessoSistema instance;
	
	private AcessoSistema() {
		
	}

	//criada no momento que preciso, somente quando é chamado
	public static AcessoSistema getInstance() {
		if(instance == null) {
			instance = new AcessoSistema();
		}
		return instance;
	}
	
	public void realizarLogin() {
		
	}
}
