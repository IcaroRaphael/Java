import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 *"São Múltiplos" ou "Não são Múltiplos", indicando se os valores lidos são
		 *múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 *crescente ou decrescente.*/
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("1º número: ");
		a = scan.nextInt();
		System.out.print("2º número: ");
		b = scan.nextInt();
		
		if (a > b) {
			if ((a % b) == 0) {
				System.out.println("São múltiplos");
			}else {
				System.out.println("Não são múltiplos");
			}
		}else if((b % a) == 0){
			System.out.println("São múltiplos");
			}else {
			System.out.println("Não são múltiplos");
		}
		
		scan.close();
	}
}
