import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		 *soma desses n�meros com uma mensagem explicativa, conforme exemplos.
		 *Exemplos:
		 *- Entrada: 10, 30
		 *- Sa�da: SOMA = 40*/
		int n1, n2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.print("1� N�mero: ");
		n1 = sc.nextInt();
		System.out.print("2� N�mero: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("ENTRADA:");
		System.out.printf("- %d\n", n1);
		System.out.printf("- %d\n", n2);
		System.out.println("SA�DA:");
		System.out.printf("Soma = %d\n", soma);
		sc.close();
	}

}
