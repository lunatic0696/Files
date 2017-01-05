package funcionario;

public class Main {
	public static void main(String[] args) {
		Funcionario fulano = new Funcionario();
		fulano.nome = "Fulano";
		fulano.salario = 1000.0;
		System.out.println(fulano.nome);
		System.out.println(fulano.salario);
		fulano.aumentaSalario(400);
		System.out.println(fulano.salario);
		fulano.mostra();
		
		Funcionario outrofulano = new Funcionario();
		fulano.nome = "Fulano";
		fulano.salario = 1000.0;
		
		if (fulano == outrofulano) {
			System.out.println("Igual");
		}
		else if(fulano != outrofulano){
			System.out.println("Diferente");
		}
		
		fulano.dtEntrada.setDia(11);
		fulano.dtEntrada.setMes(05);
		fulano.dtEntrada.setAno(2012);
	}

}
