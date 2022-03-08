public class Stradali extends Moto 
{
	private String carena;
	private String borselloDaSerbatoio;
	private String kitRiparazione;

	public Stradali(String modello, int potenzaCV, double prezzoListino, 
			int motorizzazione, String carena, String borselloDaSerbatoio, String kitRiparazione) 
	{
		super(modello, potenzaCV, prezzoListino, motorizzazione);
		this.carena = carena;
		this.borselloDaSerbatoio = borselloDaSerbatoio;
		this.kitRiparazione = kitRiparazione;
	}

	//costruttore dft
	public Stradali() 
	{
		super();
		carena ="";
		borselloDaSerbatoio = "";
		kitRiparazione = "";
	}
	
	//getter e setter
	public String getcarena() {
		return carena;
	}

	public void setcarena(String carena) {
		this.carena = carena;
	}

	public String getborselloDaSerbatoio() {
		return borselloDaSerbatoio;
	}

	public void setborselloDaSerbatoio(String borselloDaSerbatoio) {
		this.borselloDaSerbatoio = borselloDaSerbatoio;
	}

	public String getKitRiparazione() {
		return kitRiparazione;
	}

	public void setKitRiparazione(String kitRiparazione) {
		this.kitRiparazione = kitRiparazione;
	}
	
	
	//calcola sconto
	public double scontoPraticato()
	{
		double sconto = 150;
		int scattoValore = 0;
		
		if (getPotenzaCV() > 40)
		{
			scattoValore = (getPotenzaCV()-40)/5;
			sconto = sconto + (15*scattoValore);
		}
		
		return sconto;
	}

	@Override
	public String toString() {
		return "Stradali "+ super.toString() + "[  carena=" + carena + ", borselloDaSerbatoio=" + borselloDaSerbatoio + ", kitRiparazione="
				+ kitRiparazione + ", scontoPraticato= " + scontoPraticato() + ", toString()=" + "]";
	}
	

}