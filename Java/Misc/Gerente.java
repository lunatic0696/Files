public class Gerente extends Funcionario {

	private int nivel;

	@Override
	public String toString() {
		return "Ger. " + super.toString();
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
		
}
