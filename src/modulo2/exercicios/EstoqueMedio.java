package modulo2.exercicios;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        /**
         * faca um programa para clcular o estoque medio de uma peca, seguindo a formula:
         * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
         *
         * ex: quantidadeMinima = 3, quantidadeMaxima = 7, o estoque minimo é 5 unidades
         */

        int quantidadeMinima;
        int quantidadeMaxima;
        int estoqueMedio;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantidade minima do produto");
        quantidadeMinima = scanner.nextInt();

        System.out.println("Digite quantidade maxima do produto");
        quantidadeMaxima = scanner.nextInt();

        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.printf("O estoque médio desse produto é %d unidades ", estoqueMedio);




    }
}
