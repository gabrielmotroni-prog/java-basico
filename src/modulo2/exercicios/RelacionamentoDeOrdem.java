package modulo2.exercicios;

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        /**
         * Escreva um programa que informa os relacionamentos de ordem
         * existente entre dois numeros:
         * igual, nao igual, maior, menor, maior ou igual, menor ou igual
         */
        int numero01ParaAnalisar;
        int numero02ParaAnalisar;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Informe primeiro número para analisar");
        numero01ParaAnalisar = scanner.nextInt();

        System.out.println("Informe o segundo número para analisar");
        numero02ParaAnalisar = scanner.nextInt();

        System.out.printf("%d = %d ? %b \n", numero01ParaAnalisar, numero02ParaAnalisar, numero01ParaAnalisar==numero02ParaAnalisar);
        System.out.printf("%d != %d ? %b \n", numero01ParaAnalisar, numero02ParaAnalisar, numero01ParaAnalisar!=numero02ParaAnalisar);
        System.out.printf("%d > %d ? %b \n", numero01ParaAnalisar, numero02ParaAnalisar, numero01ParaAnalisar>numero02ParaAnalisar);
        System.out.printf("%d < %d ? %b \n", numero01ParaAnalisar, numero02ParaAnalisar, numero01ParaAnalisar<numero02ParaAnalisar);
        System.out.printf("%d >= %d ? %b \n", numero01ParaAnalisar, numero02ParaAnalisar, numero01ParaAnalisar>=numero02ParaAnalisar);
        System.out.printf("%d <= %d ? %b \n", numero01ParaAnalisar, numero02ParaAnalisar, numero01ParaAnalisar<=numero02ParaAnalisar);

    }
}
