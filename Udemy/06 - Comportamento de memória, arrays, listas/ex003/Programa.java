package Secao_10.Exercicios.ex003;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        /*A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses
        quartos identificados pelos números 0 a 9. Fazer um programa que inicie com todos os
        dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes
        que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N
        estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem
        como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago.
        Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por
        ordem de quarto, conforme exemplo.*/

        Scanner scan = new Scanner(System.in);

        // CRIANDO UM VETOR DE 10 POSIÇÕES
        Aluguel[] aluguel = new Aluguel[10];

        // INFORMANDO QUANTOS ESTUDANTES VÃO ALUGAR QUARTOS
        System.out.print("Quantos quartos serão alugados: ");
        int n = scan.nextInt();

        // INSERINDO OS DADOS DOS ESTUDANTES
        linha();
        System.out.println("INSIRA OS DADOS DOS OCUPANTES:");
        for(int i = 0; i < n; i++){
            while(true){
                linha();
                System.out.printf("%dº OCUPANTE:\n", (i+1));

                System.out.print("QUARTOS DISPONÍVEIS:");
                for(int j = 0; j < aluguel.length; j++){
                    if(aluguel[j] == null){
                        System.out.printf(" [%d]", j);
                    }
                }
                System.out.println();

                System.out.print("Selecione um quarto: ");
                int quarto = scan.nextInt();

                if(aluguel[quarto] == null){
                    scan.nextLine();
                    System.out.print("Nome: ");
                    String nome = scan.nextLine().toUpperCase();

                    System.out.print("E-mail: ");
                    String email = scan.nextLine();

                    aluguel[quarto] = new Aluguel(nome, email);
                    break;
                }
                else {
                    System.out.println("ERRO! QUARTO OCUPADO.");
                }
            }
        }

        // IMPRIMINDO RELATÓRIO DE ALUGUÉIS
        linha();
        System.out.println("RELATÓRIO DOS ALUGUÉIS:");
        for(int i = 0; i < aluguel.length; i++){
            if(aluguel[i] != null){
                linha();
                System.out.printf("QUARTO: %d\n", i);
                System.out.println("Nome: " + aluguel[i].getNome());
                System.out.println("E-mail: " + aluguel[i].getEmail());
            }
        }

        scan.close();
    }

    public static void linha(){
        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
    }
}
