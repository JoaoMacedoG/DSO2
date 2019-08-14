package modelo;

import interfaces.iFachadaCarteiraMoeda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class FachadaCarteiraMoedas implements iFachadaCarteiraMoeda{
	
	private static FachadaCarteiraMoedas singleton;
	private List<Dados> dadosGerais;
	private  Usuario usuario;
	private CarteiraUsuario carteira;

	
	
	private FachadaCarteiraMoedas() {
		this.dadosGerais = new ArrayList<Dados>();
		this.usuario = new Usuario("joao", "joao1");
		
		Moeda dolar = new Moeda(100.0, 1.0, "dolar");
		Moeda real = new Moeda(100.0, 1.0, "real");
		Moeda bitcoin = new Moeda(100.0, 1.0, "bitcoin");
		Moeda euro = new Moeda(100.0, 1.0, "euro");
		Moeda etherum = new Moeda ( 100.0, 1.0, "etherum");
		
		this.carteira = new CarteiraUsuario(dolar, real, bitcoin, euro, etherum);
	
	}
	
	
	public static FachadaCarteiraMoedas getInstance() {
		if (singleton == null)
			singleton = new FachadaCarteiraMoedas();
		return singleton;
	}
	
	public void comprarMoeda(String idUsuario) {
		
	}
	
	public boolean autenticarLogin(String login, String senha) {
		if (login == usuario.getIdUsuario() && senha == usuario.getSenha()) {
			return true;
		}
		
		return false;
		
	}
	
	public void efetuarSaque(double valorRetirado, String nomeMoeda) {
		//if (nomeMoeda ) // achar jeito de comparar as moedas nome
		
		
	}
	
	public void efetuarDeposito(Moeda moedaDepósito) {
		
		
	}
	public double valorDaMoedaEmReal(Moeda moedaParaConverter) {
		return 0.0;
	}


	public void armazenarDados(String tipoDeAcao, Moeda moedaUsadaNaAcao, double valorMoedaUsada) {
		Dados dadoNovo = new Dados(tipoDeAcao, moedaUsadaNaAcao, valorMoedaUsada);
		dadosGerais.add(dadoNovo);
		
	}


	public List<Dados> recuparDados() {
		return dadosGerais;
	}


	public void removerDados(Integer idAcao) {
		for (int i = 0; i < dadosGerais.size(); i++) {
			Dados dado = this.dadosGerais.get(i);
			if (dado.getIdAcao() == idAcao) {
				dadosGerais.remove(dado);
			}
		}
		
	}
	
	
	
	
	

}
