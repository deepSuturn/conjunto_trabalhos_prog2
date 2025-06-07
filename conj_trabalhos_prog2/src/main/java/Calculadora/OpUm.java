package Calculadora;

public class OpUm { //classe para operações com um número
	
	//VARIÁVEIS DE INSTÂNCIA
	
	private double a; //variável de instância privada, receberá um valor para cálculos
	
	//CONSTRUTOR
	
	public OpUm(double x) { //construtor recebe o valor repassado
		this.a = x;
	}	
	
	//MÉTODOS
	
	public int fato() {    //fatorial
		
		int r = 1;
		
		for(int i = 1; i <= this.a;i++) {
			
			r = r * i;
		}
		
		return r;
	}
	
	public int piso() {      //piso de número racional
		
		return (int) this.a;
		
	}
	
	public int teto() {      //teto de número racional
		
		return (int)(this.a + 1.0);
		
	}
	
	public boolean prim() {  //verificador de números primos
		
		boolean r = true;
		int cont = 0;
		
		for(int i = 1; i < this.a;i++) {
			if(this.a % i == 0) {
				cont++;
			}
		}
		if(cont > 1) {
			r = false;
		}
		return r;
	}
	
	public boolean quad() {  //verificador de quadrados perfeitos
		  
		boolean r = false;
		double x = this.a;
		
		if(x == 1) {
			r = true;
		}
		
		for(double i = 0; i < x;i++) {
			if(i*i == x) {
				r = true;
			}
		}
		
		return r; 
	}	
		
}