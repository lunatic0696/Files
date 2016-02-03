package aula6;

public class CargoZelador implements Cargo {

	private String nome = "Zelador";
	
	@Override
	public double getBonus(double salario) {
		return 0;
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
