package ex001;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int escolha;
		int cont = 0;
		
		saudacao();
		do {
			// MENU DE OPÇÕES
			mostraFuncoes();
			
			// VALIDAÇÃO DO MENU
			System.out.print("Resposta: ");
			while(true) {
				escolha = scan.nextInt();
				if((escolha < 1) || (escolha > 5)) {
					System.out.print("ERRO! Insira uma opção válida: ");
				}else {
					break;
				}
			}
			
			switch(escolha) {
			// CADASTRO DE CONTA
			case 1:
				if((cont == 0) && (escolha == 1)) {
					int numeroConta;
					String nomeTitular;
					double valorConta;
					int senhaBanco;
					
					cabecalho("CADASTRO");
					
					System.out.print("Número da conta: ");
					numeroConta = scan.nextInt();
					
					System.out.print("Nome do titular: ");
					nomeTitular = scan.nextLine();
					scan.nextLine();
					
					// VALIDAÇÃO DA SENHA
					System.out.print("Senha numérica (6 dígitos): ");
					while(true) {
						senhaBanco = scan.nextInt();
						if(String.valueOf(senhaBanco).length() == 6) {
							System.out.println("Senha cadastrada com sucesso!");
							break;
						}
						else {
							System.out.print("ERRO! Insira uma senha válida (6 dígitos): ");
						}
					}
					
					// VALIDAÇÃO DEPÓSITO
					System.out.print("Haverá depósito inicial? [S/N]:");
					while(true) {
						char escolhaDeposito = scan.next().toUpperCase().charAt(0);
						if(escolhaDeposito == 'S') {
							System.out.print("Valor do depósito: ");
							valorConta = scan.nextDouble();
							break;
						}
						else if(escolhaDeposito == 'N') {
							valorConta = 0.0;
							break;
						}
						else {
							System.out.println("ERRO! Insira uma opção válida [S/N]:");
						}
					}
					Banco banco = new Banco(numeroConta, nomeTitular, valorConta, senhaBanco);
				}
				else {
					System.out.println("ERRO, CONTA JÁ CADASTRADA!");
				}
				cont++;
				break;
			
			// DEPÓSITO
			case 2:
				cabecalho("DEPOSITO");
				System.out.println("* LOGIN *");
				System.out.print("Conta: ");
				int nConta = scan.nextInt();
				System.out.print("Senha: ");
				int senhaBanco = scan.nextInt();
				if((nConta == Banco.getNumeroConta()) && (senhaBanco == Banco.getSenhaBanco())){
					System.out.println("Acesso autorizado!");
					System.out.print("Valor do depósito: ");
					double deposito = scan.nextDouble();
					Banco.deposito(deposito);
					System.out.println("Depósito realizado com sucesso!");
				}
				else {
					System.out.println("Acesso negado!");
				}
				break;
				
			// SAQUE
			case 3:
				cabecalho("SAQUE");
				System.out.println("* LOGIN *");
				System.out.print("Conta: ");
				nConta = scan.nextInt();
				System.out.print("Senha: ");
				senhaBanco = scan.nextInt();
				if((nConta == Banco.getNumeroConta()) && (senhaBanco == Banco.getSenhaBanco())){
					System.out.println("Acesso autorizado!");
					System.out.print("Valor do saque: ");
					double saque = scan.nextDouble();
					Banco.saque(saque);
					System.out.println("Saque realizado com sucesso!");
				}
				else {
					System.out.println("Acesso negado!");
				}
				break;
				
			// EXTRATO
			case 4:
				cabecalho("EXTRATO");
				System.out.println("* LOGIN *");
				System.out.print("Conta: ");
				nConta = scan.nextInt();
				System.out.print("Senha: ");
				senhaBanco = scan.nextInt();
				if((nConta == Banco.getNumeroConta()) && (senhaBanco == Banco.getSenhaBanco())){
					System.out.println("Acesso autorizado!");
					mostraExtrato();
					double saque = scan.nextDouble();
					Banco.saque(saque);
				}
				else {
					System.out.println("Acesso negado!");
				}
				break;
			
			// SAIR
			case 5:
				cabecalho("Operação finalizada!");
				break;
			}

		}while(escolha != 5);
		
		scan.close();
	}
	
	public static void mostraFuncoes() {
		cabecalho("MENU");
		System.out.println("Escolha uma das seguintes operações:");
		System.out.println("1) Cadastro de conta");
		System.out.println("2) Depósito");
		System.out.println("3) Saque");
		System.out.println("4) Extrato");
		System.out.println("5) Sair");
	}
	
	public static void mostraExtrato() {
		System.out.println("N da conta: " + Banco.getNumeroConta());
		System.out.println("Titular: " + Banco.getNomeTitular());
		System.out.println("Saldo atual: " + Banco.getValorConta());
	}
	
	public static void cabecalho(String texto) {
		System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
		System.out.printf("*** %s ***\n", texto);
		System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");

	}
	
	public static void saudacao() {
	System.out.println("############ BEM VINDO AO BANCO #############");
	}
}