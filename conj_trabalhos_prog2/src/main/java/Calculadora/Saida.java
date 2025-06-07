package Calculadora;

import java.util.Scanner; //biblioteca direcionada à manipulação de entrada de dados

public class Saida { //classe para determinação da operação a partir da escolha
	
	//VARIÁVEIS DE INSTÂNCIA 
	
	private double e; //variável de instância privada, receberá o valor da operação selecionada
	
	//CONSTRUTOR
	
	public Saida(double x) { //construtor da classe
		this.e = x;	}
	
	//MÉTODOS
	
	public void Operacoes(Scanner scanner) {
		
		if(e > 11 & e < 18) { //distingue a operação de acordo com o valor de "e"	
		
			System.out.println("Digite o valor:"); //solicita ao usuário um valor
			double n1 = scanner.nextDouble();      //recebe o valor e armazena em "n1"
		
			OpUm v = new OpUm(n1); //cria um objeto "OpUm" para utilizar métodos de cálculo para um valor
		                           
			if(e == 12) {                            //impressão dos resultados
				
				System.out.println("A permutação é: " + v.fato()); 
				                          //uma vez que o cálculo de permutação é somente um fatorial, 
			} else if(e == 13) {          //foi necessário apenas utilizar o método já existente
				
				System.out.println("O fatorial é: " + v.fato());
				
			} else if(e == 14) {
				
				System.out.println("O resultado da verificação é: " + v.prim());
				
			} else if(e == 15) {
				
				System.out.println("O resultado da verificação é: " + v.quad());
				
			} else if(e == 16) {
				
				System.out.println("O piso é " + v.piso());
				
			} else if(e == 17) {
				
				System.out.println("O teto é " + v.teto());
				
			}
		} 
	
		else if(e <= 11 & e > 0) { //cria objetos "OpDois" para utilizar métodos de cálculo para dois valores,
				                  //dado que cada desvio possui interações diferentes com o usuário
			if(e == 1) {
			
				System.out.println("Digite a primeira parcela:"); 		
				
				double n2 = scanner.nextDouble(); //leitura da entrada de dados como double, 
			                                      //para facilitar manipulação e conversão
				System.out.println("Digite a segunda parcela:");								
				
				double n3 = scanner.nextDouble(); 
			
				OpDois b = new OpDois(n2, n3); //recebe como parâmetros os valores fornecidos
			
				System.out.println("A soma é " + b.soma()); //imprime o resultado a partir do método utilizado
			
			} 
			else if(e == 2) {
			
				System.out.println("Digite o minuendo:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o subtraendo:");
											
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.println("A diferença é " + b.subt());
			
			} 
			else if(e == 3) {
			
				System.out.println("Digite o primeiro fator:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o segundo fator:");
											
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.println("O produto é " + b.mult());
			
			}
			else if(e == 4) {
			
				System.out.println("Digite o dividendo:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o divisor:");
											
				double n3 = scanner.nextDouble();
			
				if (n3 == 0) {
					System.out.printf("Não é possível dividir por 0\n");
				} else {
					OpDois b = new OpDois(n2, n3);
					
					System.out.printf("O quociente é %.2f \n", b.divi());
				}
			} 
			else if(e == 5) {
			
				System.out.println("Digite o dividendo:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o divisor:");
											
				double n3 = scanner.nextDouble();
									
				if (n3 == 0) {
					System.out.printf("Não é possível dividir por 0\n");
				} else {
					OpDois b = new OpDois(n2, n3);
					
					System.out.println("O quociente inteiro é " + b.diviInt());
				}
			
			} 
			else if(e == 6) {
			
				System.out.println("Digite o dividendo:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o divisor:");
											
				double n3 = scanner.nextDouble();
										
				if (n3 == 0) {
					System.out.printf("Não é possível dividir por 0\n");
				} else {
					OpDois b = new OpDois(n2, n3);
					
					System.out.println("O resto é " + b.rest());
				}
			
			} 
			else if(e == 7) {
			
				System.out.println("Digite a base:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o expoente:");
											
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.println("A potência é " + b.pote());
			
			} 
			else if(e == 8) {
			
				System.out.println("Digite o radical:");		
			
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o grau(índice):");
											
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.printf("A raiz de grau é %.2f", b.raiz(), "\n"); 
				                                 //uso de formatação para limitar o resultado a 2 casas decimais
			} 
			else if(e == 9) {
			
				System.out.println("Digite o total de elementos:");						
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o tamanho do agrupamento:");												
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.println("O arranjo é " + b.arra());
			
			} 
			else if(e == 10) {
				
				System.out.println("Digite o total de elementos:");						
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite o tamanho do agrupamento:");												
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.println("O arranjo com repetição é " + b.arraRep());
			
			} 
			else if(e == 11) {
				
				System.out.println("Digite o total de elementos:");						
				double n2 = scanner.nextDouble();
			
				System.out.println("Digite a quantidade de repetições:");												
				double n3 = scanner.nextDouble();
			
				OpDois b = new OpDois(n2, n3);
			
				System.out.println("A permutação com repetição é " + b.permRep());
			
			} 
		} 	
	}
}
