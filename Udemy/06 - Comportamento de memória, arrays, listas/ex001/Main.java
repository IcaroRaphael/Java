package ex001;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? R:");
		int quantQuartos = scan.nextInt();
		System.out.println();
		
		Aluguel[] cadastro = new Aluguel[10];
		
		for(int i = 0; i < quantQuartos; i++) {
			scan.nextLine();
			System.out.printf("%dº CADASTRO: \n", (i+1));
			
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			
			System.out.print("Email: ");
			String email = scan.nextLine();
			
			System.out.print("Nº do quarto: ");
			int quarto = scan.nextInt();
		
			cadastro[quarto] = new Aluguel(nome, email, quarto);
			System.out.println();
		}
		
		System.out.println("QUARTOS ALUGADOS:");
		for(int i = 0; i < 10; i++) {
			if(cadastro[i] != null) {
				System.out.printf("%d: %s, %s\n", cadastro[i].getQuarto(), cadastro[i].getNome(), cadastro[i].getEmail());
			}
		}
		
		scan.close();
	}
}