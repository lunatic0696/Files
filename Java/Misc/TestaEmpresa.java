public class TestaEmpresa {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setCpf(123);
		f1.setNome("Fulano");
		f1.setSalario(3400);
		((Gerente)f1).setNivel(5);
		
		Gerente g1 = new Gerente();
		g1.setCpf(124);
		g1.setNome("Sicrano");
		g1.setSalario(10000);
		g1.setNivel(5);
		
		Funcionario gerente = new Gerente();
		gerente.setCpf(125);
		gerente.setNome("Rogerio");
		gerente.setSalario(10000);
		((Gerente)gerente).setNivel(5);
		
		System.out.println(g1);
		System.out.println(f1);
		
	}
}
