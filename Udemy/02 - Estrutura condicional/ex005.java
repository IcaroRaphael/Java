import java.util.Scanner;
import java.util.Locale;
public class ex005 {
	public static void main(String[] args) {
		/* Com base na tabela abaixo, escreva um programa que leia o código de um item
		 * e a quantidade deste item. A segui, calcule e mostre o valor da conta a pagar.*/
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cod, quant;
		double preco, total;
		preco = 0;
		
		System.out.print("Insira o código: ");
		cod = scan.nextInt();
		System.out.print("Insira a quantidade: ");
		quant = scan.nextInt();
		
		if(cod == 1) {
			preco = 4.0;
		}else if(cod == 2) {
			preco = 4.50;
		} if(cod == 3) {
			preco = 5.0;
		}else if(cod == 4) {
			preco = 2.0;
		}else if(cod == 5) {
			preco = 1.50;
		}
		
		total = preco * quant;
		System.out.printf("Total: R$%.2f\n", total);
		
		scan.close();
	}
}
