package modulo10.conteudo;

// excessao personalizada
public class DivisaoPorZero extends RuntimeException{

    public DivisaoPorZero(String message){
        super(message);
    }
}
