import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		/*Leia um valor inteiro X (1 <= X <= 1000). Em
		 seguida mostre os �mpares de 1 at� X, um valor
		 por linha, inclusive o X, se for o caso.*/
		int cont;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		int x = scan.nextInt();
		
		for(int j = 2; j <= x; j++) {
			cont = 0;
			for(int i = 1; i <= j; i++) {
				if((j % i) == 0) {
					cont++;
					}
				}
			if(cont == 2) {
				System.out.printf("Numero %d � primo.\n", j);
			}
		}
		scan.close();
	}
}
