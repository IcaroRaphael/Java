package ex001;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura de um retângulo.
		 Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar
		 uma classe como mostrado no projeto ao lado.*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira as medidas do retângulo... ");
		System.out.print("Altura: ");
		retangulo.altura = scan.nextDouble();
		System.out.print("Largura: ");
		retangulo.largura = scan.nextDouble();
		
		System.out.printf("ÁREA: %.2f\n", retangulo.area());
		System.out.printf("PERÍMETRO: %.2f\n", retangulo.perimetro());
		System.out.printf("DIAGONAL: %.2f\n", retangulo.diagonal());
		
		scan.close();
	}
}