import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro e dizer se este número é par
		 *ou ímpar.*/
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Insira um número: ");
		numero = scan.nextInt();
		
		if((numero % 2) == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		
		scan.close();
	}
}
