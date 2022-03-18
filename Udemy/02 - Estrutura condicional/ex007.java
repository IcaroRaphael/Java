import java.util.Scanner;
import java.util.Locale;
public class ex007 {
	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as         
		coordenadas de um ponto em um plano. A seguir, determine qual o quadrante
		ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na
		origem (x = y = 0).
		Se o ponto estiver na origem, escreva a mensagem “Origem”.
		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme
		for a situação.

		EXEMPLOS:
		- Entrada: 4.5 -2.2
		- Saída: Q4

		- Entrada: 0.1 0.1
		- Saída: Q1

		- Entrada: 0.0 0.0
		- Saída: Origem*/
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double x, y;
		String saida = "";
		
		System.out.print("Digite a coordenada de X: ");
		x = scan.nextDouble();
		System.out.print("Digite a coordenada de Y: ");
		y = scan.nextDouble();
		
		if((x == 0) && (y == 0)) {
			saida = "Origem";
		}else if((x > 0) && (y > 0)) {
			saida = "Q1";
		}else if((x < 0) && (y > 0)) {
			saida = "Q2";
		}else if((x < 0) && (y < 0)) {
			saida = "Q3";
		}else if((x > 0) && (y < 0)) {
			saida = "Q4";
		}
		System.out.printf("Quadrante: %s\n", saida);
		
		scan.close();
	}
}
