import java.util.Scanner;
import java.util.Locale;
public class ex008 {
	public static void main(String[] args) {
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes
		em pagar seus impostos, pois sabem que nele não existem políticos corruptos e
		os recursos arrecadados são utilizados em benefício da população, sem qualquer
		desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de
		Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de 
		Imposto de Renda, segundo a tabela abaixo.

		TABELA:
		- De 0 a 2000: Isento
		- De 2000.01 a 3000: 8%
		- De 3000.01 a 4500: 18%
		- Acima de 4500: 28%

		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas 
		sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% 
		sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
		O valor deve ser impresso com duas casas decimais.

		EXEMPLOS: 
		- Entrada: 3002.00
		- Saída: R$ 80.36

		- Entrada: 1701.12
		- Saída: Isento

		- Entrada: 4520.00
		- Saída: R$ 355.60*/
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double salario;
		double imposto = 0;
		
		System.out.print("Insira o valor do salário: ");
		salario = scan.nextDouble();
		
		if((salario > 0) && (salario <= 2000)) {
			imposto = 0.0;
		}else if((salario > 2000) && (salario <= 3000)) {
			imposto = (salario - 2000) * 0.08;
		}else if((salario > 3000) && (salario <= 4500)) {
			imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
		}else if(salario > 4500) {
			imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
		}
		if(imposto == 0) {
			System.out.println("Imposto: Isento");
		}else {
			System.out.printf("Imposto: %.2f\n", imposto);
		}
		
		scan.close();
	}
}
