package CPFValidator;

/**
 * Classe responsável por validar CPFs de acordo com as regras da Receita Federal.
 * Realiza cálculos de dígitos verificadores e verifica se um CPF é válido.
 */
public class CpfValidator {

    /**
     * Calcula o dígito verificador (primeiro ou segundo) de um CPF.
     *
     * @param cpf String contendo os dígitos do CPF (com ou sem formatação)
     * @param isFirst Boolean que indica se deve calcular o primeiro (true) ou segundo (false) dígito
     * @return O dígito verificador calculado (0-9)
     */
    public static int calculateVerifierDigit(String cpf, Boolean isFirst) {
        // Calcula o resto da divisão por 11 da soma ponderada dos dígitos
        int remainder = calculateSumOfDigits(cpf, isFirst) % 11;

        // Se o resto for menor que 2, o dígito verificador é 0
        // Caso contrário, o dígito é 11 - resto
        if(remainder < 2) {
            return 0;
        } else {
            return 11 - remainder;
        }
    }

    /**
     * Calcula a soma ponderada dos dígitos do CPF para verificação.
     *
     * @param digits String com os dígitos do CPF
     * @param isFirst Boolean que define se usa pesos para o primeiro (true) ou segundo (false) dígito
     * @return Soma ponderada dos dígitos
     */
    public static int calculateSumOfDigits(String digits, Boolean isFirst) {
        int sum = 0;

        if(isFirst) {
            // Cálculo para o primeiro dígito verificador (pesos 10 a 2)
            for(int i = 0; i < 9; i++) {
                char currentDigit = digits.charAt(i);
                sum += Character.getNumericValue(currentDigit) * (10 - i);
            }
        } else {
            // Cálculo para o segundo dígito verificador (pesos 11 a 2)
            for(int i = 0; i < 10; i++) {
                char currentDigit = digits.charAt(i);
                sum += Character.getNumericValue(currentDigit) * (11 - i);
            }
        }
        return sum;
    }

    /**
     * Verifica se todos os dígitos do CPF são iguais (casos inválidos como 111.111.111-11).
     *
     * @param cpf String com os dígitos do CPF
     * @return true se todos os dígitos forem iguais, false caso contrário
     */
    public static boolean verifySameDigitCpf(String cpf) {
        char target = cpf.charAt(0);  // Pega o primeiro dígito como referência
        int count = 0;

        // Conta quantos dígitos são iguais ao primeiro
        for (int i = 0; i < 11; i++) {
            if (cpf.charAt(i) == target) {
                count++;
            }
        }

        // Retorna true se todos os 11 dígitos forem iguais
        return count == 11;
    }

    /**
     * Valida um CPF completo verificando seus dígitos verificadores.
     *
     * @param cpf String com os 11 dígitos do CPF
     * @return true se o CPF for válido, false caso contrário
     */
    public static boolean verifyCpf(String cpf) {
        // Primeiro verifica se todos os dígitos são iguais (CPF inválido)
        if(verifySameDigitCpf(cpf)) {
            return false;
        }

        // Calcula o primeiro e segundo dígitos verificadores
        int firstDigit = calculateVerifierDigit(cpf, true);
        int secondDigit = calculateVerifierDigit(cpf, false);

        // Compara os dígitos calculados com os dígitos informados no CPF
        return (firstDigit == Character.getNumericValue(cpf.charAt(9))) &&
                (secondDigit == Character.getNumericValue(cpf.charAt(10)));
    }
}