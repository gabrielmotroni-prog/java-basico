package modulo8.conteudo;

import java.util.Arrays;

public class Strings {


    public static void main(String[] args) {

        String texto = "Texto customizado";
        String outroTexto = "Texto customizado";


        // compara endereco de memoria
        System.out.println(texto == outroTexto) ;

        // para array de char
        char [] textoArray = texto.toCharArray();

        for(char letra: textoArray){
            if (letra == 'a') {
                System.out.println("Encontrei a");
            }
        }

        // Acessando string atraves de indice
        System.out.println(texto.charAt(0));
        System.out.println(texto.charAt(texto.length() - 1));

        // minusculo
        System.out.println(texto.toLowerCase());

        // Maiusculo
        System.out.println(texto.toUpperCase());

        // dividir string com criterios
        System.out.println(Arrays.toString(texto.split(" " )));

        // conversao de tipos com o metodo valueOf de cada tipo
        String idade = "20";

        // para string
        Integer idadeInt = Integer.valueOf(idade);

        // para int
        String idadeStr = String.valueOf(idadeInt);


        System.out.println(idadeInt);
        System.out.println(idadeStr);

        // concetenar com String builder
        StringBuilder builder = new StringBuilder();

        builder.append("Ela ");
        builder.append("é ");
        builder.append("muito ");
        builder.append("comum ");

        System.out.println(builder.toString());

        // formatacao de strings complexas
        String nome ="gabriel";
        String username ="gabriel";
        String email ="gabrie@emaill";
        String textoFormato = "Olá, eu sou o %s, e meu email é o %s".formatted(nome, username, email);
        System.out.println(textoFormato);


    }
}
