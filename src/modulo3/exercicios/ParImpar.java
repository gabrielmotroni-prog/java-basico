package modulo3.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numeroInformato;

        System.out.println("Digite um numero");
        numeroInformato = scanner.nextDouble();

        boolean numeroEhPar = (numeroInformato % 2)  == 0;

        if(numeroEhPar){
            System.out.printf("Numero %f é Par", numeroInformato);
        }else{
            System.out.printf("Numero %f é Impar",numeroInformato);

        }
    }
}
