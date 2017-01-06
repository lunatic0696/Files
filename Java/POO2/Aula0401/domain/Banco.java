package domain;

public class Banco {
	
	private static Banco instancia;
	
	private Conta[] contas;
	private String nome = "R1Bank";
	
	private Banco(){
		
	}
	
	public static Banco getInstance(){
		if (Banco.instancia == null)
			Banco.instancia = new Banco();
		return instancia;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

	public Conta novaConta(String nomeTitular){
		return new Conta(nomeTitular);
	}

}
