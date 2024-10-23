package modulo2.exercicios;

import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {

        /**
         * faca um programa que  converta um valor em dolar em reais
         * ex: dolares = 100, cotacao = 492, o valor em reais é 492
         */

        double resultadoFinal = 0;
        double cotacao = 4.92f;
        double valorEmDolar = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dolar");
        valorEmDolar = scanner.nextDouble();


        resultadoFinal = valorEmDolar * cotacao;
        System.out.printf("%.2f dolares convertidos ficam R$ %.2f reais", valorEmDolar, resultadoFinal);


    }
}
