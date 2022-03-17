import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 *calcule e motre a diferença do produto de A e B pelo produto de C e D segundo
		 *a fórmula: DIFERENÇA = (A*B - C*D).
		 *Exemplos:
		 *- Entrada: 5, 6, 7, 8
		 *- Saída: Diferença = -26*/
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferença;
		System.out.println("ENTRADA:");
		System.out.print("Valor de A: ");
		a = sc.nextInt();
		System.out.print("Valor de B: ");
		b = sc.nextInt();
		System.out.print("Valor de C: ");
		c = sc.nextInt();
		System.out.print("Valor de D: ");
		d = sc.nextInt();
		System.out.println("SAÍDA:");
		diferença = (a*b)-(c*d);
		System.out.printf("Diferença: %d\n", diferença);
		sc.close();
	}
}
