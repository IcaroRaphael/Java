import java.util.Scanner;
import java.util.Locale;

public class ex003 {
	public static void main(String[] args) {
		/*3.Uma empresa decidiu dar 20% de aumento aos funcion�rios cujos
		 sal�rios s�o inferiores a 500 reais. Escreva um programa que leia
		 o sal�rio de v�rios funcion�rios e mostre o valor do sal�rio
		 reajustado ou uma mensagem caso o funcion�rio n�o tenha direito
		 ao aumento. O programa ser� encerrado quando se digitar �fim� para
		 o nome do funcion�rio. (Comando while)*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome = "";
		
		while(nome.equals("FIM") == false){
			System.out.print("Insira o nome: ");
			nome = scan.next().toUpperCase();
			if(nome.equals("FIM") == false) {
				System.out.print("Insira seu Sal�rio: ");
				double salario = scan.nextDouble();
				if(salario < 500) {
					double novoSalario = salario * 1.2;
					System.out.printf("Novo sal�rio: %.2f\n", novoSalario);
				}else {
					System.out.println("Desculpe, voc� n�o possui direito ao aumento.");
				}
			}
			System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
		}
		
		scan.close();
	}
}