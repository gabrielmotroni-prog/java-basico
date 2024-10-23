package modulo9.exercicios.todo;

public class Main {
    public static void main(String[] args) {


        TodoList todoList = new TodoList();

        todoList.adicionarTarefa("Brincar");
        todoList.concluirTarefa("Brincar");

        todoList.adicionarTarefa("Jogar Bola");
        todoList.concluirTarefa("Jogar Bola");


        todoList.adicionarTarefa("pular");
        //todoList.removerTarefa("pular");

        System.out.println(todoList);
    }

}
