import java.util.Locale;
import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o
		 *valor da �rea deste c�rculo com quatro casas decimais conforme exemplos.
		 *
		 *F�rmula da �rea: �rea = pi * pow(raio, 2)
		 *
		 *Considere o valor de pi = 3.14159
		 *
		 *Exemplos:
		 *- Entrada: 2.00
		 *- Sa�da: A=12.5664*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, area;
		System.out.println("ENTRADA:");
		System.out.print("Insira o raio: ");
		raio = sc.nextDouble();
		System.out.println("SA�DA:");
		area = 3.14159 * (Math.pow(raio, 2));
		System.out.printf("�rea: %.4f", area);
		sc.close();
	}

}
