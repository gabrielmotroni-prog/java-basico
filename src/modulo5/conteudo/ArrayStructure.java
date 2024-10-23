package modulo5.conteudo;

public class ArrayStructure {
    public static void main(String[] args) {
        String [] tarefas = { "estudar java", "fazer exercicios", "tomar cafe"};

        tarefas[2]= "limpar a casa";

        System.out.println(tarefas[0]);
        System.out.println(tarefas[2]);
        System.out.println("voce possui " + tarefas.length + "tarefas");


        //percorrer arrays
        for (int i = 0; i < tarefas.length ; i++) {
            System.out.println(tarefas[i]);
        }

        System.out.println("--");
        for (String tarefa: tarefas){
            System.out.println(tarefa);
        }

        System.out.println("--");
        System.out.println("argumetos ao app java");
        //passando parametro ao programa java

       for (String argumento: args){
           System.out.println(argumento);
       }

       // Array multidimencional
        //3x3
        int [][] sudoku = { {3 , 6 , 7}, {4, 9 , 8}, {3, 2, 1} };


       //linha 0 colunha 0
        System.out.println(sudoku[0][0]);

        //linha 1 colunha 3
        System.out.println(sudoku[0][2]);

        //mudar
        System.out.println("antes");
        System.out.println(sudoku[0][1]);
        //sudoku[0][1]=1;
        System.out.println("dps");
        System.out.println(sudoku[0][1]);

        /**
         * perccorer array multidimencional
         */
        System.out.println("multidimencional");

        //linhas
        for (int i = 0; i < sudoku.length; i++) {
            System.out.println("");
            //colunas - percorre colunas disponiveis na linha
            for (int j = 0; j < sudoku[i].length ; j++) {
                // LINHA x Coluna
                System.out.print(sudoku[i][j]);

            }
        }

        //ou for each

        System.out.println("");
        System.out.println("for each");

        for (int[] sudokuLinha: sudoku){
            for (int numero: sudokuLinha){
                System.out.print(numero);
            }
        }

    }
}
