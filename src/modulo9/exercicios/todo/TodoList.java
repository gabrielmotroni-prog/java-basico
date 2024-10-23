package modulo9.exercicios.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TodoList {
    private List<Todo> todos;

    public TodoList(){
        this.todos = new ArrayList<Todo>();
    }

    public void adicionarTarefa(String titulo){

        Todo todo = new Todo(titulo);

        // nao permite adc mais de uma da mesma tarefa
        if (!todos.contains(todo)){
            todos.add(todo);
        }

//        boolean isSaved = false;
//
//        //Stream<Todo> tituloIsSaved = this.todos.stream().filter(todo-> todo.getTitulo().equals(titulo));
//
//         // refatorar
//        for(Todo todo: this.todos){
//            if( todo.getTitulo().equals(titulo)){
//                isSaved = true;
//                break;
//            }
//
//        }
//
//        if(isSaved){
//            System.out.println("Tarefa já cadastrada!");
//        }else {
//            this.todos.add(new Todo(titulo));
//        }
    }

    public void concluirTarefa (String titulo){
        Iterator<Todo> it = this.todos.iterator();
        while (it.hasNext()){
            var itemAtual = it.next();
            if(itemAtual.getTitulo().equals(titulo)){
                itemAtual.concluir();
            }
        }

    }
    public void removerTarefa (String titulo){
        Iterator<Todo> it = this.todos.iterator();
        while (it.hasNext()){
            var itemAtual = it.next();
            if(itemAtual.getTitulo().equals(titulo)){
                it.remove();
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Todo todo: this.todos){
            if(todo.isConcluida()){
                builder.append("[x] ");
            }else{
                builder.append("[ ] ");
            }
            builder.append(todo.getTitulo());
            builder.append("\n");
        }
        // lista mapeando campos
        //List<String> listaTodo = this.todos.stream().map(todoItem-> todoItem.isConcluida() ? "[x] " + todoItem.getTitulo() : "[] " + todoItem.getTitulo()).toList();



        // lista para string primitivo
       // String[] listaSomenteStringTarefas = listaTodo.toArray(new String[listaTodo.size()]);
        //System.out.println(Arrays.toString(listaSomenteStringTarefas));
        //return Arrays.toString(listaSomenteStringTarefas);
        return builder.toString();

//        Iterator<Todo> it = this.todos.iterator();
//        while (it.hasNext()) {
//            var itemAtual = it.next();
//            if (itemAtual.isConcluida()) {
//                return "[x] " + itemAtual.getTitulo();
//            } else {
//                return "[] " + itemAtual.getTitulo();
//            }
//
//        }

    }
}
