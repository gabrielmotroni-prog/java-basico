package modulo2.exercicios;

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        /**
         * imprimir preço de um produto com base no desconto à vista e o valor economizado
         *
         * 1 ler o precto
         * 2 ler % de desconto
         * 3 imprimir o novo preco e valor economizado
         *
         * ex: r$ 100 com 10% de desconto = o preco com desconto é R$ 90 e o valor economizado foi R$10
         */

        double precoUnitario;
        double porcentagem;
        double precoFinal;
        double valorEconomizado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preco do produto");
        precoUnitario = scanner.nextDouble();

        System.out.println("Digite o porcentagem de desconto");
        porcentagem = scanner.nextDouble();

        valorEconomizado = precoUnitario * (porcentagem/100);

        precoFinal = precoUnitario - valorEconomizado ;

        System.out.println("Valor do Produto: R$" + precoUnitario);
        System.out.println("Porcentagem desconto: " + porcentagem + "%");
        System.out.printf("Novo valor: R$ %.2f, economizou R$ %.2f", precoFinal, valorEconomizado);

        //mascaras
        //%d que espera uma variável do tipo int.
        //%f para float

        //%.0f indica que você quer imprimir o número como um valor de ponto flutuante, mas sem casas decimais.
    }
}
