package DescobridorRaizes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe criada para descobrir raízes de equações do segundo grau no formato ax² + bx + c = 0.
 * Utilizou-se as expressões regulares para extrair os coeficientes da equação fornecida como string.
 */
public class DescobridorRaizes {
	private float a, b, c;
    private String exp;

    public DescobridorRaizes() {
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public float getC() {
        return this.c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public Boolean validAndGetExpre() {
        // Regex que aceita a equação ax^2 + bx + c, podendo ser ax^2 + bx ou ax^2 + c
        // ou somente ax^2
        // Também aceita números decimais e fracionarios
        Pattern eq = Pattern.compile(
                "(-?(\\d+((/\\d+)|(\\.\\d+))?)?)x\\^2( )?(([-+])( )?(\\d+((/\\d+)|(\\.\\d+))?)?x)?( )?(([-+])?( )?(\\d+((/\\d+)|(\\.\\d+))?))?");

        Matcher resultado = eq.matcher(this.exp);

        if (resultado.matches()) {
            // Separação dos sinais e dos números equivalentes a A, B e C
            String tipoA = resultado.group(1);
            String sinalB = resultado.group(8);
            String tipoB = resultado.group(10);
            String sinalC = resultado.group(16);
            String tipoC = resultado.group(18);

            // Verificando se A = 1 ou -1
            if (tipoA == "") {
                tipoA = "1";
            } else if (tipoA.equals("-")) {
                tipoA = "-1";
            }
            this.setA(getFloats(tipoA));

            // Verificando se B existe na equação ou se ele é igual a 1 ou -1
            if (sinalB == null) {
                this.setB(0);
            } else {
                if (tipoB == null) {
                    tipoB = "1";
                    this.setB(getFloats(sinalB + tipoB));
                } else {
                    this.setB(getFloats(sinalB + tipoB));
                }

            }

            // Verificando se C existe na equação
            if (sinalC == null) {
                this.setC(0);
            } else {
                this.setC(getFloats(sinalC + tipoC));

            }

            return true;
        }

        return false;

    }

    private float getFloats(String s) {
        // Verifica se o número é fracionario
        if (s.contains("/")) {
            String[] parts = s.split("/");
            return Float.parseFloat(parts[0]) / Float.parseFloat(parts[1]);
        } else {
            return Float.parseFloat(s);
        }
    }

    public void raizesReais() {
        if (validAndGetExpre()) {

            System.out.println("Sua expressão: " + this.exp + " = 0\n");

            // Tratamentos para resolução de equações de segundo grau incompletas

            if (this.b == 0 && this.c == 0) {
                System.out.println("Raízes: \nX1: 0 \nX2: 0");
            } else if (this.b == 0) {
                if ((this.c > 0 && this.a > 0) || (this.c < 0 && this.a < 0)) {
                    System.out.println("As raízes não existem!");
                } else {
                    double x1 = Math.sqrt(-this.c / this.a);
                    double x2 = -Math.sqrt(-this.c / this.a);
                    System.out.println("Raízes: \n" + "X1: " + x1 + "\nX2: " + x2);
                }

            } else if (this.c == 0) {
                double x = -this.b / this.a;
                System.out.println("Raízes: \nX1: 0\n" + "X2: " + x);
            }

            // Tratamentos para resolução de equações de segundo grau completas
            else {
                double delta = Math.sqrt((this.b * this.b) - (4 * this.a * this.c));
                // Verificando se o delta é negativo, no caso como ja foi feita a raiz, se ele é
                // um Not a Number
                if (Double.isNaN(delta)) {
                    System.out.println("Não existem raízes reais!");
                } else {
                    double x1 = (-this.b + delta) / (2 * this.a);
                    double x2 = (-this.b - delta) / (2 * this.a);
                    System.out.println("Raízes: \n" + "X1: " + x1 + "\nX2: " + x2);
                }
            }

        } else {
            System.out.println("Expressão inválida!");
        }

    }
}