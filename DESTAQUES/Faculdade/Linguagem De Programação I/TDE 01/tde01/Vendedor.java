package tde01;

public class Vendedor {
	
	//ATRIBUTOS
	private static String nome;
	private static int codigo;
	private static double comissao;
	private static String endereco;
	
	//CONSTRUTOR
	public Vendedor(String nome, String endereco, int codigo) {
		Vendedor.nome = nome;
		Vendedor.endereco = endereco;
		Vendedor.codigo = codigo;
	}
	
	//MÉTODOS GETTERS AND SETTERS
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Vendedor.nome = nome;
	}
	public static int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		Vendedor.codigo = codigo;
	}
	public static double getComissao() {
		return comissao;
	}
	public static void setComissao(double comissao) {
		Vendedor.comissao = comissao;
	}
	public static String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		Vendedor.endereco = endereco;
	}
}
