package modulo10.conteudo;

import java.util.ArrayList;
import java.util.List;

public class ExceptionBasics {
    public static void main(String[] args) throws Exception {
        dividirNovo(1, 0);
        try {
            //dividir(1, 0);

            //getNomes();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("O indice informado é inválido");
        } catch (ArithmeticException ex) {
            System.out.println("naão é possivel dividir por zero");
        } catch (Exception ex) {
            System.out.println("Erro -" + ex.getMessage());
        }

    }

    private static void getNomes() {
        List<String> nomes = new ArrayList<>();
        nomes.add("gabriel");

        System.out.println(nomes.get(1));
    }

    // checável - Exception
    private static int dividir(int i, int j) throws Exception {
        if (j == 0) {
            throw new Exception("Não é possivel dividir por zero");
        }
        return i / j;
    }

    // não checável - RunTimeException
    private static int dividirNovo(int i, int j)  {
        if (j == 0) {
            throw new DivisaoPorZero("Não é possivel dividir por zero");
        }
        return i / j;
    }
}
