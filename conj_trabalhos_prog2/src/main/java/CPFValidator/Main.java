package CPFValidator;

public class Main {

    public static void main(String[] args) {
        System.out.println(CpfValidator.verifyCpf(args[0]) ? "CPF VÁLIDO" : "CPF INVÁLIDO");
    }
}
