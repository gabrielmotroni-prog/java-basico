package modulo5.exercicios;

import java.util.Scanner;

public class ImprimirArrayNumeros {
    /**
     * Crie um programa que lê um número inteiro n que representa a quantidade de números a
     * serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.
     *
     * Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.
     *
     */
    public static void main(String[] args) {
        int numeroInseridoUsuario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        numeroInseridoUsuario = scanner.nextInt();

        //declarando
        int [] meuarray;

        //iniciar
        int [] meuarray2 = {1,2,3};




        //inicia array com quantidade de posicoes inserida pelo usuario
        int [] numerosParaPercorrer  = {1,2};
        int [] numerosParaPercorrer2  = new int[2];

        System.out.println("voce deve digitar " + numeroInseridoUsuario + " numeros");

        for (int i = 0; i <  numeroInseridoUsuario; i++) {
            System.out.println("digite o " + (i+1) + " numero");
            numerosParaPercorrer[i] = scanner.nextInt();
        }

        System.out.println("numeros digitados:");

        for(int numero: numerosParaPercorrer){
            System.out.println(numero);
        }
    }
}
