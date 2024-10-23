package modulo2.exercicios;

import java.io.Console;
import java.util.Scanner;

public class SaudacaoConsole {
    public static void main(String[] args) {
        String nome;
        Console console =  System.console();


        System.out.println("Digite seu nome");
        nome = console.readLine();

        System.out.printf("Bem vindo(a) %s !", nome);


    }
}
