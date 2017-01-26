package q5;

public class Fracao {
	
	private int num;
	private int den;
	
	
	@Override
	public String toString() {
		return this.num + "/" + this.den;
	}


	public Fracao(int num, int den) {
		this.num = num;
		if(den!=0){
			this.den = den;
		}else{
			this.den = 1;
		}
	}
	
	public Fracao() {
		this.num = 0;
		this.den = 1;
	}


	public Fracao(int num) {
		this.num = num;
		this.den = 1;
	}


	public static int mdc(int m, int n){
		int r = n%m;
		while(r!=0){
			n=m;
			m=r;
			r=n%m;
		}
		return m;
	}
	
	public Fracao simplificar(){
		int r = mdc(this.num,this.den);
		this.den = this.den/r;
		this.num = this.num/r;
		return this;
	}
	
	public static Fracao somar(Fracao a, Fracao b){
		int x = a.den*b.den;
		int da = x/a.den;
		int db = x/b.den;
		a.den = a.den*da;
		a.num = a.num*da;
		b.den = b.den*db;
		b.num = b.num*db;
		Fracao a2 = a.simplificar();
		Fracao b2 = b.simplificar();
		int cn = a2.num + b2.num;
		int cd = a2.den + b2.den;
		Fracao c = new Fracao(cn,cd);
		c.simplificar();
		return c;
		
	}	
	
	public static Fracao subtrair(Fracao a, Fracao b){
		int x = a.den*b.den;
		int da = x/a.den;
		int db = x/b.den;
		a.den = a.den*da;
		a.num = a.num*da;
		b.den = b.den*db;
		b.num = b.num*db;
		Fracao a2 = a.simplificar();
		Fracao b2 = b.simplificar();
		int cn = a2.num - b2.num;
		int cd = a2.den - b2.den;
		Fracao c = new Fracao(cn,cd);
		c.simplificar();
		return c;
	}
	
	public static double decimal(Fracao f){
		double x =(int) f.num/f.den;
		return x;
	}
	
	public static Fracao minimo(Fracao a,Fracao b){
		double a2 = decimal(a);
		double b2 = decimal(b);
		if (a2 > b2) {
			return a;
		}
		else if(b2 > a2){
			return b;
		}
		else if(b2 == a2){
			return a;
		}
		return a;
	}
	
	public static boolean equivalente(Fracao a,Fracao b){
		Fracao tempa = a.simplificar();
		Fracao tempb = b.simplificar();
		if(tempa.num == tempb.num && tempa.den == tempb.den){
			return true;
		}
		else{
			return false;
		}
	}

}
