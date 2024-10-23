package modulo9.conteudo;

import java.util.*;

public class CollectionsBasics {
    public static void main(String[] args) {

        /**
         * declaracao e diferencas
         */

        // Array tradicional
        String[] nomes = {"Gabriel", "Bruna"}; // ou  new String[1]

        // Colletions

        // declarando e inicializando com valores
        ArrayList<String> nomesArrayList = new ArrayList<>() {{
            this.add("gabriel");

        }};

        ArrayList<Integer> numerosArrayList = new ArrayList<>() {{
            this.add(3);
            this.add(2);
            this.add(1);
        }};

        /**
         * operacoes
         */

        // get
        System.out.println(nomesArrayList.get(0));

        // insert
        // inicializacao do array e redicionamenteo do tamanho quem faz é o add;
        // ja o set substitui elementos que ja existem /  trabalhar com os indices ja criados

        // set
        nomesArrayList.set(0, "gabriel m");
        // add
        nomesArrayList.add(1, "bruna");

        // update
        nomesArrayList.set(1, "bruna m");

        //delete
        // por indice
        nomesArrayList.remove(1);
        // por valor - ser tipo referencia o equals deve estar implementado na classe
        nomesArrayList.remove("gabriel m");

        System.out.println(nomesArrayList);

        /**
         * ordenacao
         */

        nomesArrayList.add("gabriel");
        nomesArrayList.add("bruna");

        // sort

        System.out.println("sort");
        Collections.sort(nomesArrayList);
        Collections.sort(numerosArrayList);

        System.out.println(nomesArrayList + " " +  numerosArrayList);

        /**
         * interacao
         */

        System.out.println("interando");

        //for
        for(String nome: nomesArrayList){
            System.out.println(nome);
        }

        //iterator
        Iterator<String> it = nomesArrayList.iterator();
        while (it.hasNext()){
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }

        // relebrando stream
        nomesArrayList.stream().forEach(System.out::println);


        /**
         * String primitivo para List
         */
        List<String> listaDeNomes = List.of("gabriel", "bruna", "puma");
        System.out.println(listaDeNomes);


        /**
         * Array primitivo para List
         */
        String[] arrayNomes = {"Gabriel1", "Bruna1", "Puma1"};
        List<String> listaConvertida = Arrays.asList(arrayNomes);

        /**
         *  List para String primitivo
         */
        String[] arrayConvertido = listaConvertida.toArray(new String[2]);
        System.out.println(Arrays.toString(arrayConvertido));


        /**
         * Tipo Map/Hash da Collection
         */

        // declara e inicia
        Map<String, String> mapaDeUsuarios = new HashMap<>(){{
            put("biel", "gabriel");
        }};

        // put
        mapaDeUsuarios.put("bru", "bruna");
        mapaDeUsuarios.put("pu", "puma");

        //delete
        mapaDeUsuarios.remove("pu");

        //get
        System.out.println( mapaDeUsuarios.get("biel"));

        // como interar Map
        System.out.println("interar maps");

        // interar valores
        for (String valor: mapaDeUsuarios.values()){
            System.out.println(valor);
        }

        // interar chaves
        for (String valor: mapaDeUsuarios.keySet()){
            System.out.println(valor);
        }



        System.out.println(mapaDeUsuarios);







    }
}
