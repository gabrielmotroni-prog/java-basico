package modulo2.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /**
         *  imprimir a tabuada de um numero de 1 a 10.
         */

        int numeroParaGerarTabuada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero que deseja gerar a tabuada");
        numeroParaGerarTabuada = scanner.nextInt();

        int multiplicadoPorUm = numeroParaGerarTabuada;
        int multiplicadoPorDois = numeroParaGerarTabuada * 2;
        int multiplicadoPorTres = numeroParaGerarTabuada * 3;
        int multiplicadoPorQuatro = numeroParaGerarTabuada * 4;
        int multiplicadoPorCinco= numeroParaGerarTabuada * 5;
        int multiplicadoPorSeis= numeroParaGerarTabuada * 6;
        int multiplicadoPorSete= numeroParaGerarTabuada * 7;
        int multiplicadoPorOito= numeroParaGerarTabuada * 8;
        int multiplicadoPorNove= numeroParaGerarTabuada * 9;
        int multiplicadoPorDez= numeroParaGerarTabuada * 10;

        System.out.printf("%d X 1 = %d \n",numeroParaGerarTabuada, multiplicadoPorUm);
        System.out.printf("%d X 2 = %d \n",numeroParaGerarTabuada, multiplicadoPorDois);
        System.out.printf("%d X 3 = %d \n",numeroParaGerarTabuada, multiplicadoPorTres);
        System.out.printf("%d X 4 = %d \n",numeroParaGerarTabuada, multiplicadoPorQuatro);
        System.out.printf("%d X 5 = %d \n",numeroParaGerarTabuada, multiplicadoPorCinco);
        System.out.printf("%d X 6 = %d \n",numeroParaGerarTabuada, multiplicadoPorSeis);
        System.out.printf("%d X 7 = %d \n",numeroParaGerarTabuada, multiplicadoPorSete);
        System.out.printf("%d X 8 = %d \n",numeroParaGerarTabuada, multiplicadoPorOito);
        System.out.printf("%d X 9 = %d \n",numeroParaGerarTabuada, multiplicadoPorNove);
        System.out.printf("%d X 10 = %d \n",numeroParaGerarTabuada, multiplicadoPorDez);

        scanner.close();
    }

}
