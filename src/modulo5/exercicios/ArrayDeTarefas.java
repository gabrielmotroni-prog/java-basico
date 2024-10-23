package modulo5.exercicios;

import java.util.Scanner;

public class ArrayDeTarefas {
    public static void main(String[] args) {
        /**
         * Escreva um programa para gerenciar tarefas da seguinte forma:
         *
         * O programa permite que até 10 tarefas sejam cadastradas.
         *
         * Serão exibidas 3 opções: 1. Cadastrar tarefa, 2. Listar tarefas e 3. Sair
         *
         * Caso seja selecionada a opção 1, deve ler o número da tarefa (entre 1 e 10) e depois a tarefa em si,
         * que será cadastrada na posição do array equivalente ao número da tarefa fornecido (ex: 0 no array é a primeira
         * posição, 1 é a segunda, ...).
         *
         * Caso seja selecionada a opção 2, deve imprimir todas as tarefas encontradas no formato:
         * Tarefa 1 - gfwgjf
         *
         * Caso seja selecionada qualquer outra opção, o programa deve imprimir "Encerrando programa..." e deverá encerrar.
         */

        String[] tarefas = new String[] {
                "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };

        int numeroDaTarefa;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
            System.out.println("\nOpções:");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                // Escreva a solução a partir daqui...
                case 1 ->  {
                    System.out.println("Digite o número da tarefa (entre 1 e 10)");
                    numeroDaTarefa = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroDaTarefa <= 0 || numeroDaTarefa > 10) {
                        System.out.println("Número da tarefa inválido.");
                        continue;
                    }

                    //System.out.println("Digite o nome da tarefa");
                    //armazena em posicao formato array
                    tarefas[numeroDaTarefa-1] = scanner.nextLine();
                }
                case 2 -> {
                    for (int i = 0; i < tarefas.length; i++) {
                        //System.out.println(tarefas.length);
                        System.out.println("Tarefa " + (i+1) + " - " + tarefas[i]);
                    }
                }

                case 3 -> {
                     System.out.println("Encerrando programa...");
                    return;

                }

                default -> {
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;
                }
            }
        }
    }
}
