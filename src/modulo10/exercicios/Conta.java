package modulo10.exercicios;

public class Conta {
    Double saldo;

    Conta(Double saldo) {
        this.saldo = saldo;

    }

    public void sacar(Double valorParaSacar) {
        Double valorAposSaque = this.saldo - valorParaSacar;
        if (valorAposSaque < 0) {
            throw new SaldoInsuficienteException("Saldo indisponivel ");
        }
        this.saldo = valorParaSacar;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
