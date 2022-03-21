import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
		 Para cada leitura de senha incorreta informada, escrever a mensagem "Senha 
		 Invalida". Quando a senha for informada corretamente deve ser impressa a 
		 mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 correta é o valor 2002.
		 
		 Exemplos:
		 - Entrada: 2200
		 - Saída: Senha Inválida
		 
		 - Entrada: 1020
		 - Saída: Senha Inválida
		 
		 - Entrada: 2002
		 - Saída: Acesso Permitido*/
		
		Scanner scan = new Scanner(System.in);
		
		int tentativa = 0;
		int senha = 2002;
		
		while(tentativa != senha) {
			System.out.print("Digite a senha: ");
			tentativa = scan.nextInt();
			if(tentativa == senha) {
				System.out.println("Acesso Permitido.");
			}else {
				System.out.println("Senha Inválida.");
			}
		}
		
		scan.close();
	}
}
