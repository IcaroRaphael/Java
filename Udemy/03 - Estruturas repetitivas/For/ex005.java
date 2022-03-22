import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial
		 de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 Lembrando que, por definição, fatorial de 0 é 1.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n = scan.nextInt();
		
		if(n == 0) {
			System.out.println("Fatorial de 0: 1");
		}else {
			int fatorial = 1;
			for(int i = 1; i <= n; i++) {
				fatorial *= i;
			}
			System.out.printf("Fatorial de %d: %d\n", n, fatorial);
		}
		scan.close();
	}
}
