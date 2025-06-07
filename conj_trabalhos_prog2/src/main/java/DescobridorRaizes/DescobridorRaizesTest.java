package DescobridorRaizes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DescobridorRaizesTest {

    @Test
    public void testValidAndGetExpre_Completa() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("2x^2 + 3x + 4");
        assertTrue(solver.validAndGetExpre());
        assertEquals(2, solver.getA(), 0.001);
        assertEquals(3, solver.getB(), 0.001);
        assertEquals(4, solver.getC(), 0.001);
    }

    @Test
    public void testValidAndGetExpre_SemC() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^2 - 5x");
        assertTrue(solver.validAndGetExpre());
        assertEquals(1, solver.getA(), 0.001);
        assertEquals(-5, solver.getB(), 0.001);
        assertEquals(0, solver.getC(), 0.001);
    }

    @Test
    public void testValidAndGetExpre_SemB() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("-3x^2 + 7");
        assertTrue(solver.validAndGetExpre());
        assertEquals(-3, solver.getA(), 0.001);
        assertEquals(0, solver.getB(), 0.001);
        assertEquals(7, solver.getC(), 0.001);
    }

    @Test
    public void testValidAndGetExpre_SomenteA() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("0.5x^2");
        assertTrue(solver.validAndGetExpre());
        assertEquals(0.5, solver.getA(), 0.001);
        assertEquals(0, solver.getB(), 0.001);
        assertEquals(0, solver.getC(), 0.001);
    }

    @Test
    public void testValidAndGetExpre_Fracionario() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("1/2x^2 - 3/4x + 5/6");
        assertTrue(solver.validAndGetExpre());
        assertEquals(0.5, solver.getA(), 0.001);
        assertEquals(-0.75, solver.getB(), 0.001);
        assertEquals(0.833, solver.getC(), 0.001);
    }

    @Test
    public void testValidAndGetExpre_Invalida() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^3 + 2x + 1"); // Formato inválido
        assertFalse(solver.validAndGetExpre());
    }

    @Test
    public void testRaizesReais_DuasRaizesReais() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^2 - 5x + 6");
        solver.raizesReais(); // Deveria encontrar raízes 2 e 3
    }

    @Test
    public void testRaizesReais_UmaRaizReal() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^2 - 4x + 4");
        solver.raizesReais(); // Deveria encontrar raiz dupla 2
    }

    @Test
    public void testRaizesReais_SemRaizesReais() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^2 + x + 1");
        solver.raizesReais(); // Deveria indicar que não há raízes reais
    }

    @Test
    public void testRaizesReais_EquacaoIncompletaB() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^2 - 9");
        solver.raizesReais(); // Deveria encontrar raízes 3 e -3
    }

    @Test
    public void testRaizesReais_EquacaoIncompletaC() {
        DescobridorRaizes solver = new DescobridorRaizes();
        solver.setExp("x^2 + 2x");
        solver.raizesReais(); // Deveria encontrar raízes 0 e -2
    }
}