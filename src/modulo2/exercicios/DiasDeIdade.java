package modulo2.exercicios;

import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {

        /***
         * escreva um programa que leia uma idade em anos
         * e imprima essa idade em dias
         * ex: 1 ano = 365 dias
         */

        int idadeEmAnos;
        int idadeAnosEmDias;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva sua idade em anos");
        idadeEmAnos = scanner.nextInt();

        idadeAnosEmDias = idadeEmAnos * 365;

        System.out.printf("Voce tem %d dias de idade", idadeAnosEmDias);

        scanner.close();
    }
}
