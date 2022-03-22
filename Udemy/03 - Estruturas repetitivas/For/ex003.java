import java.util.Scanner;
import java.util.Locale;

public class ex003 {
	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que
		 vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um
		 deles com uma casa decimal. Apresente a média ponderada para cada um
		 destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
		 o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/
		
		Locale.setDefault(Locale.US);
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Insira quantos casos serão lidos: ");
		int casos = scan.nextInt();
		
		for(int i = 0; i < casos; i++) {
			System.out.println("----------------------------------------");
			
			System.out.print("Insira o 1º valor: ");
			double n1 = scan.nextDouble();
			
			System.out.print("Insira o 2º valor: ");
			double n2 = scan.nextDouble();
			
			System.out.print("Insira o 3º valor: ");
			double n3 = scan.nextDouble();
			
			double media = (((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10);
			System.out.printf("Méia: %.1f\n", media);
		}
		
		scan.close();
	}
}
