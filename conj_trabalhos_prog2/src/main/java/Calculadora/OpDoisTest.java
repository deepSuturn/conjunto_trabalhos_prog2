package Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpDoisTest {

	@Test
    public void testCalculoCerto() {
    	
    	//ESPERADO		
		
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

    	//VETORES AUXILIARES
    	
    	double racionais[] = {2, -2, -2.5, 5 };
    	double restantes[] = {2, 3, 4, 5};
    	double alternados[] = {-1, 2, 3, -4};
    	double raizes[] = {2.25, 27, 625, 1024};
    	double permutaveis[] = {4, 5, 6, 7};
    	
        for(int i = 1;i < 5;i++) {
        	
        	OpDois op = new OpDois(i, racionais[i - 1]);
        	OpDois op2 = new OpDois(10*i, restantes[i - 1]);
        	OpDois op3 = new OpDois(alternados[i - 1], racionais[i - 1]);
        	OpDois op4 = new OpDois(raizes[i - 1], restantes[i - 1]);
        	OpDois op5 = new OpDois(permutaveis[i - 1], restantes[i - 1]);
         
        	assertEquals(soma[i - 1], op.soma());
        
        	assertEquals(subt[i - 1], op.subt());
        
        	assertEquals(divi[i - 1], op.divi());
        
        	assertEquals(mult[i - 1], op.mult());
        	
        	assertEquals(diviInt[i - 1], op.diviInt());
        	
        	assertEquals(rest[i - 1], op2.rest());
        	
        	assertEquals(pote[i - 1], op3.pote());
        	
        	assertEquals(raiz[i - 1], op4.raiz());
        	
        	assertEquals(arra[i - 1], op5.arra());
        	
        	assertEquals(arraRep[i - 1], op5.arraRep());
        	
        	assertEquals(permRep[i - 1], op5.permRep());
        
        }
        
        
	}
}
