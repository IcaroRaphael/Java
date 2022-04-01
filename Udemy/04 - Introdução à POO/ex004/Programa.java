package ex004;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares
		 a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável
		 pelos cálculos.*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Valor do dólar: ");
		ConverterMoeda.cotacaoDolar = scan.nextDouble();
		
		System.out.print("Quantidade de dólares: ");
		double quantidade = scan.nextDouble();
		
		System.out.printf("Valor a pagar: R$%.2f\n", ConverterMoeda.calculaDolar(quantidade));
		
		scan.close();
	}
}