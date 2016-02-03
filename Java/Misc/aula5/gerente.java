package aula5;
public class gerente extends funcionario {

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
	
	@Override
	public void cracha(){
		System.out.println("BTG: "+this.getNome()+"Eu sou gerente");
	}

}
