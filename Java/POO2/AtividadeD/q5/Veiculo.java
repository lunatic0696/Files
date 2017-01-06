package q5;

public class Veiculo {
	
	String modelo;
	String placa;
	String cor;
	@Override
	public String toString() {
		return this.placa;
	}
	public Veiculo(String placa) {
		this.placa = placa;
	}

}
