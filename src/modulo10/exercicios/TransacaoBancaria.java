package modulo10.exercicios;

/**
 * Transação Bancária
 * Você irá criar uma aplicação que permite realizar transações bancárias. Siga os seguintes passos:
 * <p>
 * Crie uma classe Conta com o atributo saldo (Double). A classe deve ter um construtor que permita inicializar esse saldo.
 * <p>
 * Crie o método sacar que recebe um valor (Double) e subtrai do saldo. Não permita que o saldo fique negativo, caso o valor seja maior que o saldo lance uma exceção do tipo SaldoInsuficienteException (será criada por você).
 * <p>
 * Crie um método getSaldo que retorna o saldo da conta.
 * <p>
 * Crie uma classe SaldoInsuficienteException que vai ser a exceção customizada do tipo RuntimeException.
 * <p>
 * Crie uma classe TransacaoBancaria com um método main. Nele, crie uma conta com saldo 100.0, saque 50.0, e depois tente sacar 100.0. Imprima uma mensagem "Saldo Insuficiente" caso o saque não dê certo e lance a exceção novamente.
 */
public class TransacaoBancaria {
    public static void main(String[] args) {

        try {
            Conta conta01 = new Conta(100.0);

            conta01.sacar(50.0);
            conta01.sacar(100.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo Insuficiente!");
            throw new SaldoInsuficienteException("Saldo indisponivel ");

        }
    }
}
