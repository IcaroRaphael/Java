import java.util.Locale;
import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros
		 e mostre a divis�o do primeiro pelo segundo. Se o denominador for igual
		 a zero, mostrar a mensagem "divisao imposs�vel".*/
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas divis�es ser�o realizadas: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("-------------------------------------------");
			
			System.out.print("Insira o numerador: ");
			double numerador = scan.nextDouble();
			
			System.out.print("Insira o denominador: ");
			double denominador = scan.nextDouble();
			
			if(denominador == 0) {
				System.out.println("Divis�o imposs�vel!");
			}else {
				double resultado = numerador / denominador;
				System.out.printf("%.1f / %.1f = %.1f\n", numerador, denominador, resultado);
			}
		}
		scan.close();
	}
}
