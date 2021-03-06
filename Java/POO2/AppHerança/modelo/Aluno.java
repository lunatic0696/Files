package modelo;

public class Aluno {
private final int QTD_NOTAS = 3;
	
	private String nome;
	private int matricula;
	protected double[] notas;
	private boolean podeSairSo;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new double[QTD_NOTAS];
	}
	
	public double media(){
		double med = (notas[0] + notas[1] + notas[2])/3;
		return med;
	}
	
	public String getSituação(){
		if(media() >= 6){
			return "Aprovado";
		}else{
			return "Reprovado";
		}
	}
	
	@Override
	public String toString(){
		return this.nome + String.format(" Media: %.2f", media());
	}

	public double[] getNotas() {
		return notas;
	}

}
