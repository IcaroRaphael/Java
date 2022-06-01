package Secao_10.Exercicios.ex005;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
        Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor de N: ");
        int n = scan.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }

        linha();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.printf(" [%d]", matriz[i][i]);
        }
        System.out.println();

        linha();
        int cont = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.println("QUANTIDADE DE NÚMEROS NEGATIVOS: " + cont);

        scan.close();
    }

    public static void linha(){
        System.out.println("-=--=--=--=--=--=--=--=--=--=-");
    }
}
