package programa2e3;

public class Porta {
	
	double dimensX;
	double dimensY;
	double dimensZ;
	String cor;
	boolean aberta = false;
	
	public void pintar(String cornova){
		this.cor = cornova;
	}
	
	public void abre(){
		this.aberta = true;
	}
	
	public void fecha(){
		this.aberta = false;
	}
	
	public void checar(){
		if(this.aberta == true){
			System.out.println("Aberta");
		}
		else if(this.aberta == false){
			System.out.println("Fechada");
		}
	}
	
	

}
