package tde01;

public class Produto {
	
	//ATRIBUTOS
	private static int codigo;
	private static String descricao;
	private static double valorVenda;
	private static double valorCusto;
	private static boolean promocao;
	
	//CONSTRUTOR
	public Produto(int codigo, String descricao, double valorVenda, double valorCusto, boolean promocao) {
		Produto.codigo = codigo;
		Produto.descricao = descricao;
		Produto.valorVenda = valorVenda;
		Produto.valorCusto = valorCusto;
		Produto.promocao = promocao;
	}
	
	//MÉTODOS GETTERS AND SETTERS
	public static int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		Produto.codigo = codigo;
	}
	public static String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		Produto.descricao = descricao;
	}
	public static double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		Produto.valorVenda = valorVenda;
	}
	public static double getValorCusto() {
		return valorCusto;
	}
	public void setValorCusto(double valorCusto) {
		Produto.valorCusto = valorCusto;
	}
	public static boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		Produto.promocao = promocao;
	}
}