package modelo;

public class Moeda {
	private double valor;
	private double cotacao;
	private String nome;
	
	
	public Moeda (double valor, double cotacao, String nome) {
		this.valor = valor;
		this.cotacao = cotacao;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getCotacao() {
		return cotacao;
	}

	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}

}
