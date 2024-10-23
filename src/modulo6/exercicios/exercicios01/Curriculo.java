package modulo6.exercicios.exercicios01;

import java.util.Arrays;
import java.util.Objects;

public class Curriculo {
    String nome;
    Integer idade;

    String[] competecias;

    String[] experiencias;

    public Curriculo(){

    }
    public Curriculo(String nome, Integer idade, String[] competecias, String[] experiencias) {
        this.nome = nome;
        this.idade = idade;
        this.competecias = competecias;
        this.experiencias = experiencias;
    }

    public String sobreMim(){
       return ("Olá, eu sou " + this.nome + "trabalho com "
                + Arrays.toString(this.competecias) + ", e minhas experiências foram " + Arrays.toString(this.experiencias) + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curriculo curriculo = (Curriculo) o;
        return Objects.equals(nome, curriculo.nome) && Objects.equals(idade, curriculo.idade) && Arrays.equals(competecias, curriculo.competecias) && Arrays.equals(experiencias, curriculo.experiencias);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nome, idade);
        result = 31 * result + Arrays.hashCode(competecias);
        result = 31 * result + Arrays.hashCode(experiencias);
        return result;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade
                + Arrays.toString(competecias)
                + Arrays.toString(experiencias) +
                '}';
    }
}
