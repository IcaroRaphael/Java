import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 *calcule e motre a diferen�a do produto de A e B pelo produto de C e D segundo
		 *a f�rmula: DIFEREN�A = (A*B - C*D).
		 *Exemplos:
		 *- Entrada: 5, 6, 7, 8
		 *- Sa�da: Diferen�a = -26*/
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferen�a;
		System.out.println("ENTRADA:");
		System.out.print("Valor de A: ");
		a = sc.nextInt();
		System.out.print("Valor de B: ");
		b = sc.nextInt();
		System.out.print("Valor de C: ");
		c = sc.nextInt();
		System.out.print("Valor de D: ");
		d = sc.nextInt();
		System.out.println("SA�DA:");
		diferen�a = (a*b)-(c*d);
		System.out.printf("Diferen�a: %d\n", diferen�a);
		sc.close();
	}
}
