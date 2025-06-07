package Calculadora;

public class OpDois { //classe para operações com dois números
	
	//VARIÁVEIS DE INSTÂNCIA
	
	private double a, b;  //variáveis de instância privadas, receberão valores para cálculos
	
	//CONSTRUTOR
	
	public OpDois(double x, double y) { //construtor recebe os valores repassados
		this.a = x;
		this.b = y;
	}
	
	//MÉTODOS
	
	public double soma() {  //adição
		return a + b;
	}
	
	public double subt() {	//subtração
		return a - b;
	}
	
	public double divi() {  //divisão
		return a / b;
	}
	
	public double mult() {  //multiplicação
		return a * b;
	}
	
	public int diviInt() {	//divisão inteira	
		
		int r = (int) divi();
		
		return r ;
	}
	
	public int rest() {     //resto da divisão
		
		int x = (int) a;
		int y = (int) b;
		
		int r = x % y;
		
		return r; 
	}
	
	public double pote() {  //potenciação, utilizando a biblioteca nativa "Math"
		
		double x = this.a;
		double y = this.b;
		
		double r = Math.pow(x, y);
		
		return r;
	}
	
	public double raiz() {  //radiciação, utilizando a biblioteca nativa "Math"
		
		double x = this.a;
		double y = this.b;
		
		double r = Math.pow(x, 1.0/y);
		
		return r;
	}
	
	public int arra() {               //arranjo, proporcionado pela criação de um objeto "OpUm",
		                              // para utilização do método de cálculo fatorial		
		OpUm x = new OpUm(this.a);
		
		OpUm y = new OpUm(this.a - this.b);
		
		int r = x.fato()/y.fato();
		
		return r;
	}
	
	public double arraRep() {  //arranjo com repetição
		
		return pote();
	}
	
	public int permRep() {     //permutação com repetição          
		
		OpUm x = new OpUm(this.a);

		OpUm y = new OpUm(this.b);

		int r = x.fato()/y.fato();

		return r;
	}
	
}
