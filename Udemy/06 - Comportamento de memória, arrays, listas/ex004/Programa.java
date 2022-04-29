package Secao_10.Exercicios.ex004;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário) de
        N funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de X por
        cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o
        valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
        mostrar a listagem atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar a
        técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um
        salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // DEFININDO QUANTOS FUNCIONÁRIOS SERÃO REGISTRADOS
        System.out.print("Quantos funcionários serão registrados: ");
        int n = scan.nextInt();

        // CRIANDO VETOR DE TAMANHO N
        Funcionario[] funcionario = new Funcionario[n];

        // LENDO ATRIBUTOS DOS FUNCIONÁRIOS
        linha();
        System.out.println("REGISTRANDO FUNCIONÁRIOS");

        List<Integer> tempID = new ArrayList<Integer>();
        for(int i = 0; i < funcionario.length; i++){

            // LENDO ID
            int id;
            if(i == 0){
                linha();
                System.out.printf("%dº FUNCIONÁRIO:\n", (i+1));
                System.out.print("ID: ");
                id = scan.nextInt();
                tempID.add(id);
            }
            else{
                while(true){
                    linha();
                    System.out.printf("%dº FUNCIONÁRIO:\n", (i+1));
                    System.out.print("ID: ");
                    id = scan.nextInt();

                    if(verificadorID(id, tempID) == 0){
                        tempID.add(id);
                        break;
                    }
                    else {
                        System.out.println("ERRO! ID EXISTENTE.");;
                    }
                }
            }

            // LENDO NOME
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine().toUpperCase();

            // LENDO SALÁRIO
            System.out.print("Salário: ");
            double salario = scan.nextDouble();

            funcionario[i] = new Funcionario(id, nome, salario);
        }

        // REALIZANDO AUMENTO DO SALÁRIO DE DETERMINADO FUNCIONÁRIO
        System.out.println();
        linha();
        System.out.println("REALIZANDO AUMENTO DO SALÁRIO");
        linha();

        System.out.print("ID do funcionário: ");
        int id = scan.nextInt();

        for(int i = 0; i < funcionario.length; i++){
            if(funcionario[i].getId() == id){
                System.out.print("Percentual de aumento: ");
                double percentual = scan.nextDouble();

                double novoSalario = ((percentual / 100) + 1) * funcionario[i].getSalario();
                funcionario[i].setSalario(novoSalario);
            }
        }

        // IMPRIMINDO DADOS DE TODOS OS FUNCIONÁRIOS
        System.out.println();
        linha();
        System.out.println("LISTA DE FUNCIONÁRIOS");
        for(int i = 0; i < funcionario.length; i++){
            linha();
            System.out.printf("FUNCIONÁRIO %d:\n", (i+1));
            System.out.println("ID: " + funcionario[i].getId());
            System.out.println("Nome: " + funcionario[i].getNome());
            System.out.printf("Salário: %.2f\n", funcionario[i].getSalario());
        }

        scan.close();
    }

    public static int verificadorID(int id, List<Integer> lista){
        int cont = 0;
        for(int x : lista){
            if(id == x){
                cont++;
            }
        }
        return cont;
    }

    public static void linha(){
        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
    }
}
