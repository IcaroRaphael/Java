package especialista;

import matematica.Retangulo;
import java.util.Scanner;
import java.util.Locale;

public class EngenheiroCivil {
	
	private static String nome;
	private static int idade;

	public static void setIdade(int idade) {
		EngenheiroCivil.idade = idade;
	}

	public static void setNome(String nome) {
		EngenheiroCivil.nome = nome;
	}
	
	public static void exibirDadosPessoais() {
		System.out.println("*** DADOS PESSOAIS ***");
		System.out.println(nome);
		System.out.println(idade + " anos");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome do engenheiro: ");
		String nome = scan.nextLine();
		setNome(nome);
		
		System.out.print("Idade do engenheiro: ");
		int idade = scan.nextInt();
		setIdade(idade);
		
		exibirDadosPessoais();
		System.out.println("*** DADOS RETÂNGULO ***");
		Retangulo.definirLados(4.7, 8.2);
		System.out.printf("Area: %.2f\n", Retangulo.area());
		System.out.printf("Perimetro: %.2f\n", Retangulo.perimetro());
		
		scan.close();
	}

}