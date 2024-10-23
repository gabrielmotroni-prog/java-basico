package modulo6.exercicios.exercicios01;

public class Main {

    public static void main(String[] args) {

        /*
        *
        *Escreva uma classe chamada Curriculo para montar o seu currículo profissional. Ela deve ter atributos
        * nome, idade, competencias e experiencias. Além disso, deve ter um método sobreMim que imprime um resumo
        * do currículo da seguinte forma: "Olá, eu sou Giuliana, trabalho com [Java], e minhas experiências
        * foram [Instrutora Online, Desenvolvedora]".
         *  */

        String[] competencias = {"java angular"};
        String[] expericiencias = {"java", "react"};

        Curriculo curriculo01 = new Curriculo("Gabriel", 26,competencias, expericiencias);

        System.out.println("O RESULTADO É: ");
        //System.out.println(curriculo01);
        System.out.println(curriculo01.sobreMim());


    }
}
