import java.util.Scanner;

public class ex007 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro positivo N. O programa
		 deve então mostrar na tela N linhas, começando de 1 até N. Para cada
		 linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
		 conforme exemplo.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			
			System.out.printf("Linha: %d|Quadrado: %.1f|Cubo: %.1f\n", i, quadrado, cubo);
		}
		
		scan.close();
	}
}
