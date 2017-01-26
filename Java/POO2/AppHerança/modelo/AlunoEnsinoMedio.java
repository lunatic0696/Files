package modelo;

public class AlunoEnsinoMedio extends AlunoEnsinoFundamental{
	
	public boolean querDominarOMundo;
	
	public AlunoEnsinoMedio(String nome, int matricula) {
		super(nome, matricula);
		this.querDominarOMundo = true;
	}
	
	public double media(){
		double med = (notas[0] + notas[1] + notas[2])/3;
		return med;
	}
	
	public String getSituação(){
		if(media() >= 7){
			return "Aprovado";
		}else{
			return "Reprovado";
		}
	}
	
	public boolean isLiso(){
		return true;
	}
	
}
