package modulo2.conteudo;

public class casting {
    public static void main(String[] args) {
        // implicito / widening
        byte variavelPequena = 1;
        byte variavelGrande = variavelPequena;

        // explicito - narrowing

        long variavelLong = 2030300330;
        int variavelInt = (int) variavelLong;
        System.out.println(variavelInt);

        // explicito
        int n1 = 9;
        int n2 = 2;
        float resultado = (float) n1 / n2;
        System.out.println(resultado);

    }
}
