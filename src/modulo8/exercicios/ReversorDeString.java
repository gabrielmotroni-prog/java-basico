package modulo8.exercicios;

public class ReversorDeString {

    public static String reverterString(String palavra){
        char[] listLetras = palavra.toCharArray();
        String palavraInvertida= "";

        for (int i = palavra.length()-1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        return palavraInvertida;
    }

    //main
    public static void main(String[] args) {
        String palavraInvertida = ReversorDeString.reverterString("a e i o u");
        System.out.println(palavraInvertida);
    }
}
