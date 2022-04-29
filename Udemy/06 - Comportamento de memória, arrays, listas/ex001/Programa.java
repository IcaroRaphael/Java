package Secao_10.Exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e a altura de N
        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar
        a altura média dessas pessoas.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // DEFININDO TAMANHO DO VETOR
        System.out.print("Quantas alturas serão lidas: ");
        int n = scan.nextInt();

        // INSERINDO AS ALTURAS
        double[] altura = new double[n];
        linha();
        System.out.printf("INSIRA AS ALTURAS:\n", n);
        for(int i = 0; i < altura.length; i++){
            linha();
            System.out.printf("%dº altura: ", (i+1));
            altura[i] = scan.nextDouble();
        }

        // CALCULANDO A MÉDIA
        double total = 0;
        for(int i = 0; i < altura.length; i++){
            total += altura[i];
        }
        linha();
        System.out.printf("Média das alturas: %.2f\n", (total / altura.length));

        scan.close();
    }

    public static void linha(){
        System.out.println("-=--=--=--=--=--=--=--=--=--=-");
    }
}
