package aula6;

public class CargoGerente implements Cargo {

	private String nome = "Gerente";
	
	@Override
	public double getBonus(double salario) {
		return salario*0.3;
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
