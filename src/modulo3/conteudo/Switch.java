package modulo3.conteudo;

import java.io.Console;

public class Switch {

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Informe a nova A, B, C, D, F: ");
        String nota = console.readLine();

        String mensagem = switch (nota){
            case "A" -> "Excelente ";
            case "B" -> "Bom trabalho ";
            case "C" -> "Está progredindo ";
            case "D" -> "Precisa melhorar ";
            case "F" -> "Você falhou! ";
            default -> "Opção inválida ";
        };

        System.out.println(mensagem);
    }
}
