package programa2e3;

public class TestCasa {
	
	public static void main(String[] args) {
		
		Casa casa = new Casa();
		Porta portaa = new Porta();
		Porta portab = new Porta();
		Porta portac = new Porta();
		casa.porta1 = portaa;
		casa.porta2 = portab;
		casa.porta3 = portac;
		
		casa.porta1.abre();
		portab.abre();
		System.out.println(casa.nportas());
		
	}

}
