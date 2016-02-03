package aula5;
public class TestaEmpresa {

	public static void main(String[] args) {
		
		funcionario f1 = new funcionario();
		f1.setCpf(123);
		f1.setNome("Fulano");
		f1.setSalario(3400);
		
		gerente g1 = new gerente();
		g1.setCpf(124);
		g1.setNome("Sicrano");
		g1.setSalario(10000);
		g1.setNivel(5);
		
		CalcularBonificacao calcularbonificacao = new CalcularBonificacao();
		
		System.out.println(g1);
		System.out.println(f1);
		
	}
}

//Cast: ((gerente)funcionario) <----- Promover