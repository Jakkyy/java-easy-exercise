public class Ipermotard extends Moto 
{

	private double altezzaManubrio;
	private String sella;
	private String kitRiparazione;

	public Ipermotard(String modello, int potenzaCV, double prezzoListino, 
			int motorizzazione, double altezzaManubrio, String sella, String kitRiparazione) 
	{
		super(modello, potenzaCV, prezzoListino, motorizzazione);
		this.altezzaManubrio = altezzaManubrio;
		this.sella = sella;
		this.kitRiparazione = kitRiparazione;
	}

	//costruttore dft
	public Ipermotard() 
	{
		super();
		altezzaManubrio =0.0;
		sella = "";
		kitRiparazione = "";
	}
	
	//getter e setter
	public double getaltezzaManubrio() {
		return altezzaManubrio;
	}

	public void setaltezzaManubrio(double altezzaManubrio) {
		this.altezzaManubrio = altezzaManubrio;
	}

	public String getsella() {
		return sella;
	}

	public void setsella(String sella) {
		this.sella = sella;
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
		double sconto = 0;
		int scattoValore = 0;
		
		if (getPotenzaCV() > 60)
		{
			scattoValore = (getPotenzaCV()-60)/10;
			sconto = 50*scattoValore;
		}
		
		return sconto;
	}

	@Override
	public String toString() {
		return "Ipermotard "+ super.toString() + "[  altezzaManubrio=" + altezzaManubrio + ", sella=" + sella + ", kitRiparazione="
				+ kitRiparazione + ", scontoPraticato= " + scontoPraticato() + ", toString()=" + "]";
	}
	

}
