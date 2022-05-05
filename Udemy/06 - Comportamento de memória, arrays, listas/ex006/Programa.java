package Secao_10.Exercicios.ex006;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M
        linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida,
        ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os
        valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de linhas: ");
        int M = sc.nextInt();

        System.out.print("Insira a quantidade de colunas: ");
        int N = sc.nextInt();
        linha();

        int[][] matriz = new int[M][N];

        for(int l = 0; l < M; l++){
            for(int c = 0; c < N; c++){
                System.out.printf("Insira o valor de Matriz[%d][%d]: ", l, c);
                matriz[l][c] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("Insira o valor de X: ");
        int X = sc.nextInt();

        for(int l = 0; l < M; l++){
            for(int c = 0; c < N; c++){
                if(matriz[l][c] == X){
                    linha();
                    //POSIÇÃO
                    System.out.printf("Posição: [%d][%d]\n", l, c);
                    //ESQUERDA
                    if(c > 0){
                        System.out.println("Esquerda: " + matriz[l][c-1]);
                    }
                    //ACIMA
                    if(l > 0){
                        System.out.println("Acima: " + matriz[l-1][c]);
                    }
                    //DIREITA
                    if(c < (N-1)){
                        System.out.println("Direita: " + matriz[l][c+1]);
                    }
                    //ABAIXO
                    if(l < (M-1)){
                        System.out.println("Abaixo: " + matriz[l + 1][c]);
                    }
                }
            }
        }

        sc.close();
    }

    public static void linha(){
        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
    }
}