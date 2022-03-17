import java.util.Locale;
import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
	    /*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o:
	 *A, B e C. Em seguida, calcule e mostre:
	 *a) A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	 *b) A �rea do c�rculo de raio C. (pi = 3.14159).
	 *c) A �rea do trap�zio que tem A e B por bases e C por altura.
	 *d) A �rea do quadrado que tem lado B.
	 *e) A �rea do ret�ngulo que tem lados A e B.
	 *
	 *Exemplo:
	 *- Entrada: 3.0 4.0 5.2
	 *- Sa�da:
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
	System.out.printf("TRI�NGULO: %.3f\n", a);
	b = 3.14159 * Math.pow(C, 2);
	System.out.printf("C�RCULO: %.3f\n", b);
	c = ((A + B)*C)/2;
	System.out.printf("TRAP�ZIO: %.3f\n", c);
	d = Math.pow(B, 2);
	System.out.printf("QUADRADO: %.3f\n", d);
	e = A * B;
	System.out.printf("RET�NGULO: %.3f\n", e);
	sc.close();
  }
}