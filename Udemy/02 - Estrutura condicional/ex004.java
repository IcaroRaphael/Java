import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
		 * do jogo, sabendo que o memso pode começar em um dia e terminar em outro,
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Scanner scan = new Scanner(System.in);
		
		int inicio, termino, duracao;
		
		System.out.print("Insira a hora inicial: ");
		inicio = scan.nextInt();
		System.out.print("Insira a hora final: ");
		termino = scan.nextInt();
		
		if(inicio == termino) {
			duracao = 24;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}else if(inicio > termino) {
			duracao = (24-16)+termino;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}else if(termino > inicio) {
			duracao = termino - inicio;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}
		
		scan.close();
	}
}
