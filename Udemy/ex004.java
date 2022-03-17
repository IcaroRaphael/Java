import java.util.Locale;
import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, seu número de horas
		 *trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
		 *A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double funcionario, horas, valorHora, salario;
		System.out.print("Nº do Funcionário: ");
		funcionario = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Valor p/ Hora: ");
		valorHora = sc.nextDouble();
		
		System.out.printf("Number: %.2f\n", funcionario);
		salario = horas * valorHora;
		System.out.printf("Salário: U$%.2f\n", salario);
		sc.close();
	}
}
