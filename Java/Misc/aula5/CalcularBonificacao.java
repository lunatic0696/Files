package aula5;

public class CalcularBonificacao {
	
	private double total;
	
	public void calcular(funcionario f){
		this.total += f.getBonus();
	}
	
	public void showTotal(){
		System.out.println("Total bonus: " + this.total);
	}

}
