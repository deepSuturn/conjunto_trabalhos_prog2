package Calculadora;

import java.util.Scanner; //biblioteca direcionada à manipulação de entrada de dados


public class Main {  //classe principal
	public static void main(String args[]) {
		
		System.out.println("");
		
		Scanner entrada = new Scanner(System.in);   //criação de objeto para entrada de dados
		
		Escolha calculadora = new Escolha(entrada); //criação de objeto para execução da seleção de operação, 
		                                            //passando o objeto de leitura como parâmetro
		calculadora.Decisao(); //instancia o método que coordena a seleção de operações
		
		System.out.printf("\nPrograma encerrado."); //saída relativa ao final do programa
		
		entrada.close(); //fechamento do buffer de leitura
	}
}
