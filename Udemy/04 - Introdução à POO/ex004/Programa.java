package ex004;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares
		 a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF
		 sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser respons�vel
		 pelos c�lculos.*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor do d�lar: ");
		ConverterMoeda.cotacaoDolar = scan.nextDouble();
		
		System.out.print("Quantidade de d�lares: ");
		double quantidade = scan.nextDouble();
		
		System.out.printf("Valor a pagar: R$%.2f\n", ConverterMoeda.calculaDolar(quantidade));
		
		scan.close();
	}
}