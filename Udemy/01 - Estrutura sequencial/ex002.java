import java.util.Locale;
import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 *valor da área deste círculo com quatro casas decimais conforme exemplos.
		 *
		 *Fórmula da área: área = pi * pow(raio, 2)
		 *
		 *Considere o valor de pi = 3.14159
		 *
		 *Exemplos:
		 *- Entrada: 2.00
		 *- Saída: A=12.5664*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, area;
		System.out.println("ENTRADA:");
		System.out.print("Insira o raio: ");
		raio = sc.nextDouble();
		System.out.println("SAÍDA:");
		area = 3.14159 * (Math.pow(raio, 2));
		System.out.printf("Área: %.4f", area);
		sc.close();
	}

}
