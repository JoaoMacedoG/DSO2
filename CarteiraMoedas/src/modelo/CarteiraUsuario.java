package modelo;

public class CarteiraUsuario {

	private Moeda dolar;
	private Moeda real;
	private Moeda bitcoin;
	private Moeda euro;
	private Moeda etherum;
	
	public CarteiraUsuario(Moeda dolar, Moeda real, Moeda bitcoin, Moeda euro, Moeda etherum) {
		this.dolar = dolar;
		this.real = real;
		this.bitcoin = bitcoin;
		this.euro = euro;
		this.etherum = etherum;
		
	}

	public Moeda getDolar() {
		return dolar;
	}

	public void setDolar(Moeda dolar) {
		this.dolar = dolar;
	}

	public Moeda getReal() {
		return real;
	}

	public void setReal(Moeda real) {
		this.real = real;
	}

	public Moeda getBitcoin() {
		return bitcoin;
	}

	public void setBitcoin(Moeda bitcoin) {
		this.bitcoin = bitcoin;
	}

	public Moeda getEuro() {
		return euro;
	}

	public void setEuro(Moeda euro) {
		this.euro = euro;
	}

	public Moeda getEtherum() {
		return etherum;
	}

	public void setEtherum(Moeda etherum) {
		this.etherum = etherum;
	}
	
}
