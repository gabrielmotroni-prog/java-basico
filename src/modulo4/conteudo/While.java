package modulo4.conteudo;

import java.util.Scanner;

public class While {


    public static void main(String[] args) {
        int tentativas = 5;
        int numero = 7;

        Scanner scanner = new Scanner(System.in);

        while(tentativas>0){
            int numeroDoUsuario;

            System.out.println("digite um numero");
            numeroDoUsuario = scanner.nextInt();

            if(numeroDoUsuario == numero){
                System.out.println("Voce acerto!");
                return;
            }else{
                tentativas--;
            }

        }
        System.out.println("fim! ainda não acertou");
        scanner.close();
    }
}
