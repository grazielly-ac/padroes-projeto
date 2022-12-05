package br.com.gof.singleton;

public class AcessoSistema4Thread {
	
	
	private static AcessoSistema4Thread instance;
		
	
	private AcessoSistema4Thread() {
		 
	}

	//public synchronized static AcessoSistema4Thread getInstance() {
		
	public static AcessoSistema4Thread getInstance() {
			if(instance == null) {
				synchronized (AcessoSistema4Thread.class) {
					//para o caso de mais de um acesso
					if(instance == null) {
						instance = new AcessoSistema4Thread();
					}
				}
			}
			return instance;
		
	}
	
	public void realizarLogin() {
		
	}
}
