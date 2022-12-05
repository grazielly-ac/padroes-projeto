package br.com.gof.singleton;

public class AcessoSistema3 {
	
	//não posso tratar exceptions
	private static AcessoSistema3 instance;
	
	//posso tratar exceptions
	static {
		try {
		instance = new AcessoSistema3(); 
		}catch(Exception e) {
			
		}
	}
	
	private AcessoSistema3() {
		 
	}

	public static AcessoSistema3 getInstance() {
		
		return instance;
	}
	
	public void realizarLogin() {
		
	}
}
