package modulo4.conteudo;

import java.util.Scanner;

public class JumpStatements {
    public static void main(String[] args) {
        //imprime so pares - nao mostra impares
        for(int i = 1; i<=10; i++){
            if(i % 2 !=0){
                //nao mostra impares
                continue;
            }
            System.out.println(i);
        }

        //break
        Scanner scanner = new Scanner(System.in);
        while (true){
            int numeroDigitado;
            System.out.println("digite um numero");
            numeroDigitado = scanner.nextInt();

            if(numeroDigitado ==1 ){
                System.out.println("Fim! finalizado");
                break;
            }


        }


        //return
        Scanner scanner2 = new Scanner(System.in);
        while (true){
            int numeroDigitado;
            System.out.println("digite um numero");
            numeroDigitado = scanner2.nextInt();

            if(numeroDigitado ==1 ){
                System.out.println("Fim! finalizado");
                scanner2.close();
                return;
            }


        }
    }
}
