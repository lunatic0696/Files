import aula5.Funcionario;

public class Caellum681{
	public static void main(String[] args){
		Funcionario fulano = new Funcionario();
		fulano.setNome("Fulano");
		fulano.setSalario(700);
		System.out.format("Nome: %s\nSalario: R$ %.2f\nID: %d\n", fulano.getNome(), fulano.getSalario(), fulano.getId());
		Funcionario cicrano = new Funcionario();
		cicrano.setNome("Cicrano");
		cicrano.setSalario(900);
		System.out.format("Nome: %s\nSalario: R$ %.2f\nID: %d\n", cicrano.getNome(), cicrano.getSalario(), cicrano.getId());
		Funcionario beltrano = new Funcionario();
		beltrano.setNome("Beltrano");
		beltrano.setSalario(1300);
		System.out.format("Nome: %s\nSalario: R$ %.2f\nID: %d\n", beltrano.getNome(), beltrano.getSalario(), beltrano.getId());

	}
}