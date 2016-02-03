package aula6;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Cargo caixa = new CargoCaixa();
		
		Funcionario f1 = new Funcionario();
		f1.setCpf(123);
		f1.setNome("Fulano");
		f1.setSalario(3400);
		f1.setCargo(caixa);
	
		CalculaBonus calculaBonus = new CalculaBonus();
		calculaBonus.Calcular(f1);
		calculaBonus.showTotal();
		
		f1.cracha();
		
		
	}
}
