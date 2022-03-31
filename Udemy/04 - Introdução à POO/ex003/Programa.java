package ex003;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um aluno e as tr�s notas que ele 
		 obteve nos tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo
		 e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		 ano. Dizer tamb�m se o aluno est� aprovado ou reprovado e, em caso negativo,
		 quantos pontos faltam para o aluno obter o m�nimo para ser aprovado (que �
		 60% da nota). Voc� deve criar uma classe Estudante para resolver este problema.*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("Nome: ");
		estudante.nome = scan.nextLine();
		System.out.print("1� nota: ");
		estudante.nota1 = scan.nextDouble();
		System.out.print("2� nota: ");
		estudante.nota2 = scan.nextDouble();
		System.out.print("3� nota: ");
		estudante.nota3 = scan.nextDouble();
		
		System.out.printf("Nota final: %.2f\n", estudante.notaFinal());
		
		if((estudante.notaFinal() >= 0) && (estudante.notaFinal() < 60)) {
			System.out.println("Situa��o: Reprovado!");
			System.out.printf("Faltam %.2f pontos.\n", estudante.faltaPontos());
		}
		else if((estudante.notaFinal() >= 60) && (estudante.notaFinal() <= 100)){
			System.out.println("Situa��o: Aprovado!");
		}
		scan.close();
	}
}
