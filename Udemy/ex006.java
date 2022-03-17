import java.util.Locale;
import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
	    /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
	 *A, B e C. Em seguida, calcule e mostre:
	 *a) A área do triângulo retângulo que tem A por base e C por altura.
	 *b) A área do círculo de raio C. (pi = 3.14159).
	 *c) A área do trapézio que tem A e B por bases e C por altura.
	 *d) A área do quadrado que tem lado B.
	 *e) A área do retângulo que tem lados A e B.
	 *
	 *Exemplo:
	 *- Entrada: 3.0 4.0 5.2
	 *- Saída:
	 *  TRIANGULO: 7.800
		CIRCULO: 84.949
	    TRAPEZIO: 18.200
	    QUADRADO: 16.000
	    RETANGULO: 12.000*/
	Locale.setDefault(Locale.US);
	double A, B, C, a, b, c, d, e;
	Scanner sc = new Scanner(System.in);
	System.out.print("Insira o valor de A: ");
	A = sc.nextDouble();
	System.out.print("Insira o valor de B: ");
	B = sc.nextDouble();
	System.out.print("Insira o valor de C: ");
	C = sc.nextDouble();
	a = (A*C)/2;
	System.out.printf("TRIÂNGULO: %.3f\n", a);
	b = 3.14159 * Math.pow(C, 2);
	System.out.printf("CÍRCULO: %.3f\n", b);
	c = ((A + B)*C)/2;
	System.out.printf("TRAPÉZIO: %.3f\n", c);
	d = Math.pow(B, 2);
	System.out.printf("QUADRADO: %.3f\n", d);
	e = A * B;
	System.out.printf("RETÂNGULO: %.3f\n", e);
	sc.close();
  }
}