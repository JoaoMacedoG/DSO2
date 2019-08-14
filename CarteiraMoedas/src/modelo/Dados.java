package modelo;

public class Dados {
	
	private String tipoDeAcao;
	private Moeda moedaUsadaNaAcao;
	private int idAcao;
	private double valorMoeda;
	
	public Dados(String tipoDeAcao, Moeda moedaUsadaNaAcao, double valorMoeda){
		this.tipoDeAcao = tipoDeAcao;
		this.moedaUsadaNaAcao = moedaUsadaNaAcao;
		this.idAcao = setIdAcao(idAcao);
		this.valorMoeda = moedaUsadaNaAcao.getValor();
	}

	public double getValorMoeda() {
		return valorMoeda;
	}

	public void setValorMoeda(double valorMoeda) {
		this.valorMoeda = valorMoeda;
	}


	public Integer getIdAcao() {
		return idAcao;
	}

	public int setIdAcao(int idAcao) {
		this.idAcao = idAcao + 1;
		return this.idAcao;
		
	}

	public String getTipoDeAcao() {
		return tipoDeAcao;
	}

	public void setTipoDeAcao(String tipoDeAcao) {
		this.tipoDeAcao = tipoDeAcao;
	}

	public Moeda getMoedaUsadaNaAcao() {
		return moedaUsadaNaAcao;
	}

	public void setMoedaUsadaNaAcao(Moeda moedaUsadaNaAcao) {
		this.moedaUsadaNaAcao = moedaUsadaNaAcao;
	}

}
