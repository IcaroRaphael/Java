import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
		 o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
		 menos uma de duas coordenadas for NULA (nesta situação sem escrever 
		 mensagem alguma).
		 
		 Exemplos:
		 - Entrada: 2 2
		 - Saída: Primeiro
		 
		 - Entrada: 3 -2
		 - Saída: Quarto*/
		
		Scanner scan = new Scanner(System.in);
		
		int x = 1;
		int y = 1;
		
		while((x != 0) && (y != 0)) {
			System.out.print("Digite o valor de X: ");
			x = scan.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = scan.nextInt();
			if((x > 0) && (y > 0)) {
				System.out.println("Quadrante: Primeiro");
			}else if((x < 0) && (y > 0)) {
				System.out.println("Quadrante: Segundo");
			}else if((x < 0) && (y < 0)) {
				System.out.println("Quadrante: Terceiro");
			}else if((x > 0) && (y < 0)) {
				System.out.println("Quadrante: Quarto");
			}
			System.out.println("------------------------------");
		}
		System.out.println("FIM!");
		
		scan.close();
	}
}
