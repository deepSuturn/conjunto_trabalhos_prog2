package CPFValidator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CpfValidatorTest {

    @Test
    @DisplayName("Testar Cálculo Primeiro Dígito Verificador")
    void testFirstDigitCalculus() {
        assertEquals(3, CpfValidator.calculateVerifierDigit("11144477735", true));
        assertEquals(2, CpfValidator.calculateVerifierDigit("52998224725", true));
        assertEquals(0, CpfValidator.calculateVerifierDigit("12345678909", true));
        assertEquals(2, CpfValidator.calculateVerifierDigit("45358964060", true));
        assertEquals(2, CpfValidator.calculateVerifierDigit("45358964029", true));
    }

    @Test
    @DisplayName("Testar Soma dos Dígitos para Primeiro Verificador")
    void testFirtSumOfDigits() {
        assertEquals(162, CpfValidator.calculateSumOfDigits("11144477735", true));
        assertEquals(295, CpfValidator.calculateSumOfDigits("52998224725", true));
        assertEquals(210, CpfValidator.calculateSumOfDigits("12345678909", true));
        assertEquals(273, CpfValidator.calculateSumOfDigits("45358964060", true));
        assertEquals(330, CpfValidator.calculateSumOfDigits("98765432109", true));
    }

    @Test
    @DisplayName("Testar Cálculo Segundo Dígito Verificador")
    void testSecondDigitCalculus() {
        assertEquals(5, CpfValidator.calculateVerifierDigit("11144477735", false));
        assertEquals(5, CpfValidator.calculateVerifierDigit("52998224725", false));
        assertEquals(9, CpfValidator.calculateVerifierDigit("12345678909", false));
        assertEquals(1, CpfValidator.calculateVerifierDigit("45358964060", false));
        assertEquals(0, CpfValidator.calculateVerifierDigit("98765432109", false));
    }

    @Test
    @DisplayName("Testar Soma dos Dígitos para Segundo Verificador")
    void testSecondVerificationSumOfDigits() {
        // CPF: 111.444.777-35
        assertEquals(204, CpfValidator.calculateSumOfDigits("11144477735", false));

        // CPF: 529.982.247-25
        assertEquals(347, CpfValidator.calculateSumOfDigits("52998224725", false));

        // CPF: 453.589.640-60
        assertEquals(329, CpfValidator.calculateSumOfDigits("45358964060", false));

        // CPF: 987.654.321-09
        assertEquals(375, CpfValidator.calculateSumOfDigits("98765432109", false));
    }

    @Test
    @DisplayName("Verificar CPFs Válidos")
    void testValidCPFs() {
        assertTrue(CpfValidator.verifyCpf("11144477735"));
        assertTrue(CpfValidator.verifyCpf("52998224725"));
        assertTrue(CpfValidator.verifyCpf("45358964029"));
        assertTrue(CpfValidator.verifyCpf("12345678909")); // Nota: Este é um CPF conhecido como "fácil" que é válido
    }

    @Test
    @DisplayName("Verificar CPFs Inválidos")
    void testInvalidCPFs() {
        assertFalse(CpfValidator.verifyCpf("11144477736")); // Último dígito alterado
        assertFalse(CpfValidator.verifyCpf("52998224726")); // Último dígito alterado
        assertFalse(CpfValidator.verifyCpf("00000000000")); // Todos zeros
        assertFalse(CpfValidator.verifyCpf("11111111111")); // Todos 1s
        assertFalse(CpfValidator.verifyCpf("12345678900")); // Dígitos verificadores errados
    }

    @Test
    @DisplayName("Testar CPFs com Dígitos Repetidos")
    void testRepeatedDigitsCPFs() {
        assertFalse(CpfValidator.verifyCpf("00000000000"));
        assertFalse(CpfValidator.verifyCpf("11111111111"));
        assertFalse(CpfValidator.verifyCpf("22222222222"));
        assertFalse(CpfValidator.verifyCpf("33333333333"));
        assertFalse(CpfValidator.verifyCpf("44444444444"));
    }
}