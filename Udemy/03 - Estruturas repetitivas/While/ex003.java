import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 será encerrado quando o código informado for o número 4. Deve ser escrito a 
		 mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 tipo de combustível, conforme exemplo*/
		
		Scanner scan = new Scanner(System.in);
		
		int tipo, alcool = 0, gasolina = 0, diesel = 0;
		
		while(true) {
			System.out.println("Qual o tipo de combustível que você usa para abastecer? ");
			System.out.println("1 - Álcool;");
			System.out.println("2 - Gasolina;");
			System.out.println("3 - Diesel;");
			System.out.println("4 - Sair;");
			System.out.print("Tipo: ");
			tipo = scan.nextInt();
			
			if(tipo == 1) {
				alcool += 1;
			}else if(tipo == 2) {
				gasolina += 1;
			}else if(tipo == 3) {
				diesel += 1;
			}else if(tipo == 4) {
				System.out.println("--------------------------------------------------------");
				System.out.println("Muito obrigado!");
				System.out.printf("Álcool: %d\n", alcool);
				System.out.printf("Gasolina: %d\n", gasolina);
				System.out.printf("Diesel: %d\n", diesel);
				break;
			}else {
				System.out.println("Código inválido!");
			}
			System.out.println("--------------------------------------------------------");
		}
		scan.close();
	}
}
