package Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpUmTest {

    @Test
    public void testCalculoCerto() {
    	
    	//ESPERADO
        
    	int fato[] = {1, 2, 6, 24};
    	int perm[] = {1, 2, 6, 24};
    	boolean prim[] = {true, true, true, false};
    	boolean quad[] = {true, false, false, true};   	
    	double pisoE[] = {1, 2, 3, 4};
    	double tetoE[] = {2, 3, 4, 5};
    	
    	double racionais[] = {1.5, 2.4, 3.3, 4.7}; //entrada de dados do piso e do teto
    	                                           //porque precisam de números racionais
        for(int i = 1;i < 5;i++) {
        	
        	OpUm op = new OpUm(i);
        
        	int j = i - 1;
        
        	assertEquals(fato[j], op.fato());
        
        	assertEquals(perm[j], op.fato());
        
        	assertEquals(prim[j], op.prim());
        
        	assertEquals(quad[j], op.quad());
        
        }
        
        for(int i = 0;i < 4;i++) {
        	
        	OpUm op = new OpUm(racionais[i]);
                            
        	assertEquals(pisoE[i], op.piso());
        
        	assertEquals(tetoE[i], op.teto());
        
        }

        
    }
}
