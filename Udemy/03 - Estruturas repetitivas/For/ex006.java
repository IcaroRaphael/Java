import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		/*Ler um número inteiro N e calcular todos os seus divisores.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int n = scan.nextInt();
		
		System.out.printf("Divisores de %d: ", n);
		for(int i = 1; i <= n; i++) {
			if((n % i) == 0) {
				System.out.printf("%d  ", i);
			}
		}
		scan.close();
	}
}
