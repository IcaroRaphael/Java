package ex001;

public class Banco {
	private static int numeroConta;
	private static String nomeTitular;
	private static double valorConta;
	private static int senhaBanco;

	public Banco(int numeroConta, String nomeTitular, double valorConta, int senhaBanco) {
		Banco.numeroConta = numeroConta;
		Banco.nomeTitular = nomeTitular;
		Banco.valorConta = valorConta;
		Banco.senhaBanco = senhaBanco;
	}
	
	public static String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		Banco.nomeTitular = nomeTitular;
	}

	public static double getValorConta() {
		return valorConta;
	}

	public void setValorConta(double valorConta) {
		Banco.valorConta = valorConta;
	}
	
	public static void deposito(double valorDeposito) {
		Banco.valorConta += valorDeposito;
	}
	
	public static void saque(double valorSaque) {
		Banco.valorConta -= valorSaque;
	}

	public static int getNumeroConta() {
		return numeroConta;
	}

	public static int getSenhaBanco() {
		return senhaBanco;
	}

}