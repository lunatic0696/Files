package aula6;

public class CargoCaixa implements Cargo {

	private String nome = "Caixa";
	
	@Override
	public double getBonus(double salario) {
		return salario*0.1;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	

}
