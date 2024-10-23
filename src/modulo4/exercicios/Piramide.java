package modulo4.exercicios;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        // Resolva o exercício aqui...

        int numeroDigitado;
        Scanner scanner = new Scanner(System.in);
        numeroDigitado = scanner.nextInt();

        for(int i=1; i<=numeroDigitado;i++){

            // o range do 2 loop inter eh dinamico
            for(int t=1; t<=i; t++){
                System.out.print(t);
                // 1
                // 1 2
            }
            System.out.println();
        }

        scanner.close();

    }
}
