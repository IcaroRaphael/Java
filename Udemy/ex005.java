import java.util.Locale;
import java.util.Scanner;
public class ex005 {
	public static void main(String[] args) {
		/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor
		 *unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor
		 *unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1, peca2, nPecas1, nPecas2;
		double preco, total;
		total = 0;
		System.out.print("Insira os dados: ");
		peca1 = sc.nextInt();
		nPecas1 = sc.nextInt();
		preco = sc.nextDouble();
		total = total + (preco*nPecas1);
		System.out.print("Insira os dados: ");
		peca2 = sc.nextInt();
		nPecas2 = sc.nextInt();
		preco = sc.nextDouble();
		total = total + (preco*nPecas2);
		
		System.out.printf("Produto: %d | Quantidade: %d\n", peca1, nPecas1);
		System.out.printf("Produto: %d | Quantidade: %d\n", peca2, nPecas2);
		System.out.printf("Total a pagar: U$%.2f\n", total);
		sc.close();
	}
}
