package ex004;

public class ConverterMoeda {
	
	public static double cotacaoDolar;
	
	public static double calculaDolar(double quantidade) {
		return (quantidade * cotacaoDolar) * 1.06;
	}
}