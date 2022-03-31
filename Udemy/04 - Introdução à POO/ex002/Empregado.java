package ex002;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public double salarioAumento(double percentual) {
		this.salarioBruto += salarioBruto * (percentual / 100);
		return salarioBruto;
	}
}