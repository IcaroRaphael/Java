import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 *soma desses números com uma mensagem explicativa, conforme exemplos.
		 *Exemplos:
		 *- Entrada: 10, 30
		 *- Saída: SOMA = 40*/
		int n1, n2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.print("1º Número: ");
		n1 = sc.nextInt();
		System.out.print("2º Número: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("ENTRADA:");
		System.out.printf("- %d\n", n1);
		System.out.printf("- %d\n", n2);
		System.out.println("SAÍDA:");
		System.out.printf("Soma = %d\n", soma);
		sc.close();
	}

}
