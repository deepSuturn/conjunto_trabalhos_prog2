package Calculadora;

import java.util.Scanner; //biblioteca direcionada à manipulação de entrada de dados

public class Escolha {  
	
	private Scanner scan; //variável de instância da classe
	
	public Escolha(Scanner x) { //construtor da classe
		this.scan = x;
	}

	public void Decisao() {
		
		Scanner op = this.scan; //recebe o objeto de leitura como parâmetro
		
		double dec = 0;         //variáveis de controle de loop, relativa à resposta do usuário 
		double continuar = 0;
	
		do {                    //mostra ao usuário 
	
			System.out.println("Qual operação deseja realizar ?\n\n"
					+ "[1] adição\n"  
					+ "[2] subtração\n"
					+ "[3] multiplicação\n"
					+ "[4] divisão\n"
					+ "[5] divisão inteira\n"
					+ "[6] resto\n"
					+ "[7] potenciação\n"
					+ "[8] radiciação de grau n\n"
					+ "[9] arranjo simples\n"
					+ "[10] arranjo com repetição\n"
					+ "[11] permutação com repetição\n"
					+ "[12] permutação simples\n"
					+ "[13] fatorial\n"
					+ "[14] verificação de número primo\n"
					+ "[15] verificação de quadrado perfeito\n"
					+ "[16] piso\n"
					+ "[17] teto\n\n"
					+ "Resposta: ");
			                        //recebe o número da operação, 
			dec = op.nextDouble();  //lendo como "double" para criar resistência a erros,
								    //permitindo e lidando com entradas inadequadas
			while((dec - (int)dec != 0) | dec < 1 | dec > 17) { //loop para adequação de entrada racionais ou fora do intervalo
		
				System.out.println("\nValor inválido. Digite uma opção válida.\n\n"
						+ "[1] adição\n"  
						+ "[2] subtração\n"
						+ "[3] multiplicação\n"
						+ "[4] divisão\n"
						+ "[5] divisão inteira\n"
						+ "[6] resto\n"
						+ "[7] potenciação\n"
						+ "[8] radiciação de grau n\n"
						+ "[9] arranjo simples\n"
						+ "[10] arranjo com repetição\n"
						+ "[11] permutação com repetição\n"
						+ "[12] permutação simples\n"
						+ "[13] fatorial\n"
						+ "[14] verificação de número primo\n"
						+ "[15] verificação de quadrado perfeito\n"
						+ "[16] piso\n"
						+ "[17] teto\n\n"
						+ "Resposta: ");
		
				dec = op.nextDouble();
			}
	
			Saida s = new Saida(dec); //cria um objeto para cálculos, passando o número da operação selecionada como parâmetro 
			
			s.Operacoes(op);		  //instancia o método para realização de cálculos 	
				
			System.out.println("\nDeseja continuar ?\n[1] Sim\n[2] Não\n\n" //dá ao usuário a possibilidade de realizar mais
					    + "Resposta:");                                     //operações ou fechar o programa
			continuar = op.nextDouble();
			
			while(continuar != 1 & continuar != 2) { //loop para adequação de entrada
				
				System.out.println("\nValor inválido. Digite uma opção válida.\n[1] Sim\n[2] Não\n\n"
						+ "Resposta:");
				continuar = op.nextDouble();
			}
	
	} while(continuar == 1 & dec <= 17 & dec >= 1); //loop responsável pela continuidade do programa
		
	}
}
