
import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		/*2.Fa�a um programa que leia 10 n�meros inteiros e exiba na tela a
		 mensagem �Par� se ele for um n�mero par, ou ��mpar� se ele for um 
		 n�mero �mpar. (Comando if).*/
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Insira o %d� valor: ", i);
			int num = scan.nextInt();
			if((num % 2) == 0) {
				System.out.println("Tipo: Par");
			}else {
				System.out.println("Tipo: �mpar");
			}
			System.out.println("-=--=--=--=--=--=--=--=--=--=-");
		}
		System.out.println("Fim!");
		scan.close();
	}
}