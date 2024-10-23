package modulo4.exercicios;

import java.util.Scanner;

public class Soma1AteN {
    public static void main(String[] args) {
        int numeroDoUsuario;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);
        numeroDoUsuario = scanner.nextInt();

        for(int i =1; i<= numeroDoUsuario; i++){
            resultado+= i;
        }
        System.out.println(resultado);

        scanner.close();

    }
}
