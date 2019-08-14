package interfaces;
import java.util.List;

import modelo.Dados;
import modelo.Moeda;



public interface iFachadaCarteiraMoeda {
	
	public void armazenarDados(String tipoDeAcao, Moeda moedaUsadaNaAcao, double valorMoedaUsada);
	
	public List<Dados> recuparDados();
	
	public void removerDados(Integer idAcao);
		
	
	
	

}
