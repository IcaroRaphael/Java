package Secao_10.Exercicios.ex002;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e os dados (nome e
        preço) de N Produtos. Armazene os N produtos em um vetor. Em seguida,
        mostrar o preço médio dos produtos.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // DEFININDO TAMANHO DO VETOR
        System.out.print("Quantos produtos serão lidos: ");
        int n = scan.nextInt();

        // INSERINDO OS VALORES DOS ATRIBUTOS DO VETOR
        Produto[] produto = new Produto[n];
        linha();
        System.out.println("INSIRA OS PRODUTOS:");
        for(int i = 0; i < produto.length; i++){
            linha();
            System.out.printf("%dº PRODUTO:\n", (i+1));

            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Preço: ");
            double preco = scan.nextDouble();

            produto[i] = new Produto(nome, preco);
        }

        // CALCULANDO A MÉDIA DOS PREÇOS
        double total = 0;
        for(int i = 0; i < produto.length; i++){
            total += produto[i].getPreco();
        }
        linha();
        System.out.printf("Média de preços: %.2f\n", (total / produto.length));

        scan.close();
    }

    public static void linha(){
        System.out.println("-=--=--=--=--=--=--=--=--=--=-");
    }
}
