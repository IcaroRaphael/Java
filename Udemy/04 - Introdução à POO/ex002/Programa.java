package ex002;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcionário (nome, salário
		 bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e 
		 salário líquido). Em seguida, aumentar o salário do funcionário com base
		 em uma porcentagem dada (somente o salário bruto é afetado pela
		 porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		 projetada abaixo.*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.print("Nome: ");
		empregado.nome = scan.nextLine();
		System.out.print("");
		System.out.print("Salário bruto: ");
		empregado.salarioBruto = scan.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = scan.nextDouble();
		
		System.out.printf("\nEmpregado: %s, $%.2f\n", empregado.nome, empregado.salarioLiquido());
		
		System.out.print("\nQual percentual de aumento? R:");
		double aumento = scan.nextDouble();
		empregado.salarioAumento(aumento);
		
		System.out.printf("\nDados atualizados: %s, $%.2f\n", empregado.nome, empregado.salarioLiquido());
		
		scan.close();
	}
}