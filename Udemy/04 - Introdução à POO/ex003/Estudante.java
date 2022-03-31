package ex003;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		double notaFinal = this.nota1 + this.nota2 + this.nota3;
		return notaFinal;
	}
	
	public double faltaPontos() {
		double faltaPontos = 0;
		if((this.notaFinal() >= 0) && (this.notaFinal() < 60)) {
			faltaPontos = 60 - this.notaFinal();
		}
		return faltaPontos;
	}
}