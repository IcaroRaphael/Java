import java.util.Locale;
import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 *trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio.
		 *A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double funcionario, horas, valorHora, salario;
		System.out.print("N� do Funcion�rio: ");
		funcionario = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Valor p/ Hora: ");
		valorHora = sc.nextDouble();
		
		System.out.printf("Number: %.2f\n", funcionario);
		salario = horas * valorHora;
		System.out.printf("Sal�rio: U$%.2f\n", salario);
		sc.close();
	}
}
