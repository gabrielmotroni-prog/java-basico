package modulo2.exercicios;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        /**
        * Dados 3 notas imprima a média
        */

        float nota01;
        float nota02;
        float nota03;
        float resultadoFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da nota 01");
        nota01 = scanner.nextFloat();

        System.out.println("Digite o valor da nota 02");
        nota02 = scanner.nextFloat();

        System.out.println("Digite o valor da nota 03");
        nota03 = scanner.nextFloat();

        resultadoFinal = (nota01 + nota02 + nota03) / 3;

        System.out.printf("A média de nota é %f", resultadoFinal);
        scanner.close();
    }
}
