package questao1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpDoisTest {

	@Test
    public void testCalculoCerto() {
    	
    	//Vetores de saídas esperadas de cada método		
		
    	double soma[] = {3, 0, 0.5, 9};
    	
    	double subt[] = {-1, 4, 5.5, -1};    	
    	
    	double mult[] = {2, -4, -7.5, 20};  
    	
    	double divi[] = {0.5, -1, -1.2, 0.8};
    	
    	double diviInt[] = {0, -1, -1, 0};
    	
    	double rest[] = {0, 2, 2, 0};
    	
    	double pote[] = {1, 0.25, 0.06415002990995841, -1024};
    	
    	double raiz[] = {1.5, 3, 5, 4};
    	
    	double arra[] = {12, 60, 360, 2520};
    	
    	double arraRep[] = {16, 125, 1296, 16807};
    	
    	double permRep[] = {12, 20, 30, 42};

    	//Vetores auxiliares para geração de testes diversos
    	
    	double inteiros[] = {1, 2, 3, 4};
    	double dezenas[] = {10, 20, 30, 40};
    	double racionais[] = {2, -2, -2.5, 5 };
    	double restantes[] = {2, 3, 4, 5};
    	double alternados[] = {-1, 2, 3, -4};
    	double raizes[] = {2.25, 27, 625, 1024};
    	double permutaveis[] = {4, 5, 6, 7};
    	
        for(int i = 0;i < 4;i++) {
        	
        	//Mescla de vetores nas entradas para que haja diversidade de resultados
        	
        	OpDois op = new OpDois(inteiros[i], racionais[i]);                     
        	OpDois op2 = new OpDois(dezenas[i], restantes[i]);
        	OpDois op3 = new OpDois(alternados[i], racionais[i]);
        	OpDois op4 = new OpDois(raizes[i], restantes[i]);
        	OpDois op5 = new OpDois(permutaveis[i], restantes[i]);
         
        	assertEquals(soma[i], op.soma());  //Cada método é testado com um elemento diferente,
                                               //ao passo que o loop progride
        	assertEquals(subt[i], op.subt());
        									   //"assertEquals" compara o elemento do vetor respectivo ao           									
        	assertEquals(divi[i], op.divi());  //resultado do cálculo do método naquela iteração
        
        	assertEquals(mult[i], op.mult());
        	
        	assertEquals(diviInt[i], op.diviInt());
        	
        	assertEquals(rest[i], op2.rest());
        	
        	assertEquals(pote[i], op3.pote());
        	
        	assertEquals(raiz[i], op4.raiz());
        	
        	assertEquals(arra[i], op5.arra());
        	
        	assertEquals(arraRep[i], op5.arraRep());
        	
        	assertEquals(permRep[i], op5.permRep());
        
        }
        
        
	}
}
