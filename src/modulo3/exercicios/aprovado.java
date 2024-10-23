package modulo3.exercicios;

import java.io.Console;
import java.util.Scanner;

public class aprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("Digite nota 01");
        nota1 = scanner.nextDouble();

        System.out.println("Digite nota 02");
        nota2 = scanner.nextDouble();

        System.out.println("Digite nota 03");
        nota3 = scanner.nextDouble();

        media = (nota1+nota2+nota3)/3;

        var alunoAprovado = media >= 7;

        if(alunoAprovado){
            System.out.println("Parabéns! aprovado");
        }
        else{
            System.out.println("Precisa de mais nota!");
        }
    }
}
