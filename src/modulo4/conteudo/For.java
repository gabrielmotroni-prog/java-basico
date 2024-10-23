package modulo4.conteudo;

public class For {
    public static void main(String[] args) {
        // numero = 3, entao 1 * 2 * 3 = 6
        //sabendo valor de numero, vai multiplicando de 1 até chegar em numero

        int numero = 3;
        int factorial=1;

        for (int i = 1; i <= numero; i++){
            System.out.println("i " + i + " factorial: " + factorial );
            factorial *= i;
        }
        System.out.println(factorial);
    }
    // 2 = 3x2x1
    //3x2 6
    //6x3
}
