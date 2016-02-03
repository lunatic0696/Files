public class Funcionario {
	
	private int cpf;
	private String nome;
	private double salario;
	
	@Override
	public String toString() {
		return this.nome + " // CPF: " + this.cpf + "\nSalario: " + this.salario + " // Bonus: " + this.getBonus() + "\n";
	}
	
	public Funcionario (){}
	
	public double getBonus(){
		return this.salario * 0.1;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
