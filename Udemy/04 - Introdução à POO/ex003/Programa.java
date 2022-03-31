package ex003;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um aluno e as três notas que ele 
		 obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo
		 e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		 ano. Dizer também se o aluno está aprovado ou reprovado e, em caso negativo,
		 quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 60% da nota). Você deve criar uma classe Estudante para resolver este problema.*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("Nome: ");
		estudante.nome = scan.nextLine();
		System.out.print("1º nota: ");
		estudante.nota1 = scan.nextDouble();
		System.out.print("2º nota: ");
		estudante.nota2 = scan.nextDouble();
		System.out.print("3º nota: ");
		estudante.nota3 = scan.nextDouble();
		
		System.out.printf("Nota final: %.2f\n", estudante.notaFinal());
		
		if((estudante.notaFinal() >= 0) && (estudante.notaFinal() < 60)) {
			System.out.println("Situação: Reprovado!");
			System.out.printf("Faltam %.2f pontos.\n", estudante.faltaPontos());
		}
		else if((estudante.notaFinal() >= 60) && (estudante.notaFinal() <= 100)){
			System.out.println("Situação: Aprovado!");
		}
		scan.close();
	}
}
