package modulo9.exercicios.todo;

public class Main {
    /**
     * odoList com List
     *
     * Crie uma aplicação de lista de tarefas simples usando uma List para armazenar as tarefas. Cada tarefa deve ter um título e o status (concluída ou não). Siga as seguintes etapas:
     *
     *     Crie a classe Todo com os atributos titulo (String) e concluida (boolean). Crie um construtor que inicializa o titulo da Todo.
     *
     *     Crie o método concluir que marca o atributo concluida como true.
     *
     *     Crie os métodos getTitulo e isConcluida que retornam os atributos titulo e concluida respectivamente.
     *
     *     Sobrescreva o método equals que compara se os atributos titulo das tarefas são iguais.
     *
     *     Crie a classe TodoList com um atributo todos que armazena a lista de Todo.
     *
     *     Crie um construtor padrão que apenas construir a todos como um ArrayList vazio.
     *
     *     Crie um método adicionarTarefa que recebe uma String titulo como parâmetro. Não deve ser permitido adicionar tarefas repetidas (com o mesmo título).
     *
     *     Crie um método concluirTarefa que recebe uma String titulo como parâmetro e conclui a tarefa encontrada com esse título.
     *
     *     Crie um método removerTarefa que recebe uma String titulo como parâmetro e remove a tarefa encontrada com esse título. Utilize o Iterator para remover a tarefa de forma segura.
     *
     *     Crie o método toString que imprime a lista de tarefas seguindo o formato:
     *     [ ] Tarefa 1
     *
     *     [x] Tarefa 2
     *
     *     [ ] Tarefa 3
     *
     */
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
