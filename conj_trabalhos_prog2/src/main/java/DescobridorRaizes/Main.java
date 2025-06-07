package DescobridorRaizes;

import java.util.Scanner;

/**
 * Classe DescobridorRaizes.Main - Ponto de entrada do programa para resolver equações do 2º grau.
 * 
 * Oferece um menu interativo para resolver equações quadráticas no formato ax² + bx + c = 0.
 */
public class Main {
    
    /**
     * Método principal que inicia o programa.
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        iniciarAplicacao();
    }

    /**
     * Controla o fluxo principal da aplicação.
     */
    private static void iniciarAplicacao() {
        Scanner scanner = new Scanner(System.in);
        DescobridorRaizes solver = new DescobridorRaizes();
        
        exibirCabecalho();
        
        boolean executando = true;
        while (executando) {
            exibirOpcoesMenu();
            String opcao = scanner.nextLine().trim();
            
            switch (opcao) {
                case "1":
                    resolverEquacao(scanner, solver);
                    break;
                case "2":
                    executando = encerrarAplicacao(scanner);
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, digite 1 ou 2.");
            }
        }
    }
    
    /**
     * Exibe o cabeçalho inicial do programa.
     */
    private static void exibirCabecalho() {
        System.out.println("\n=== SOLUCIONADOR DE EQUAÇÕES DO 2º GRAU ===");
        System.out.println("Resolve equações no formato ax² + bx + c = 0");
    }
    
    /**
     * Exibe as opções do menu principal.
     */
    private static void exibirOpcoesMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1 - Resolver equação");
        System.out.println("2 - Sair");
        System.out.print("Digite sua opção: ");
    }
    
    /**
     * Processa a resolução de uma equação.
     * @param scanner Objeto para entrada de dados
     * @param solver Objeto para cálculo das raízes
     */
    private static void resolverEquacao(Scanner scanner, DescobridorRaizes solver) {
        System.out.println("\nINSTRUÇÕES:");
        System.out.println("Digite a equação no formato ax² + bx + c");
        System.out.print("\nDigite sua equação: ");
        
        String equacao = scanner.nextLine();
        solver.setExp(equacao);
        solver.raizesReais();
    }
    
    /**
     * Encerra a aplicação de forma controlada.
     * @param scanner Objeto Scanner a ser fechado
     * @return false para indicar que o programa deve encerrar
     */
    private static boolean encerrarAplicacao(Scanner scanner) {
        System.out.println("\nPrograma Finalizado!");
        scanner.close();
        return false;
    }
}