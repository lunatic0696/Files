package aula6;

public class CalculaBonus{
	
	private double total;
	
	public void Calcular(Funcionario f){
		this.total += f.getBonus();
	}
	
	public void showTotal(){
		System.out.println("Bonus total: " + this.total + "\n");
	}
	
}
