import java.util.Scanner;
import java.util.Locale;

public class ex005 {
	public static void main(String[] args) {
		/*5.A prefeitura de Jo�o Pessoa abriu uma linha de cr�dito para os
		 funcion�rios municipais. O valor m�ximo da presta��o n�o poder�
		 ultrapassar 30% do sal�rio bruto. Fazer um algoritmo que permita
		 entrar com o sal�rio bruto e o valor da presta��o e informar se o
		 empr�stimo pode ou n�o ser concedido. (comando if)*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o sal�rio: R$");
		double salario = scan.nextDouble();
		
		double max = 0.3 * salario;
		
		System.out.print("Insira a presta��o: R$");
		double prestacao = scan.nextDouble();
		
		if(prestacao <= max) {
			System.out.println("Empr�stimo aprovado!");
		}else {
			System.out.println("Empr�stimo reprovado!");
		}
		
		scan.close();
	}
}