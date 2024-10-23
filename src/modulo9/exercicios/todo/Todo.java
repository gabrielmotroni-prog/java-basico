package modulo9.exercicios.todo;

import java.util.Objects;

public class Todo {
    private String  titulo;
    private Boolean  concluida;

    public Todo(){

    }
    public Todo(String titulo){
        this.titulo = titulo;
        this.concluida = false;
    }
    public void concluir (){
        this.concluida = true;
    }

    public String getTitulo() {
        return titulo;
    }
    public Boolean isConcluida(){
        return this.concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(titulo, todo.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
