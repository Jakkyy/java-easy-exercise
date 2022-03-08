public class scooter extends Moto 
{
	private String bauletto;
	private String portaCellulare;
	private String kitRiparazione;

	public scooter(String modello, int potenzaCV, double prezzoListino, 
			int motorizzazione, String bauletto, String portaCellulare, String kitRiparazione) 
	{
		super(modello, potenzaCV, prezzoListino, motorizzazione);
		this.bauletto = bauletto;
		this.portaCellulare = portaCellulare;
		this.kitRiparazione = kitRiparazione;
	}

	//costruttore dft
	public scooter() 
	{
		super();
		bauletto ="";
		portaCellulare = "";
		kitRiparazione = "";
	}
	
	//getter e setter
	public String getBauletto() {
		return bauletto;
	}

	public void setBauletto(String bauletto) {
		this.bauletto = bauletto;
	}

	public String getPortaCellulare() {
		return portaCellulare;
	}

	public void setPortaCellulare(String portaCellulare) {
		this.portaCellulare = portaCellulare;
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
		
		switch(getMotorizzazione()) 
		{
		  case 1:
			  sconto = 125.0;
			  break;
		  case 2:
			  sconto = 220.0;
		      break;
		  case 3:
			  sconto = 200.0;
			  break;
		  default:
			  return sconto;
		}
		
		return sconto;
	}

	@Override
	public String toString() {
		return "Scooter "+ super.toString() + "[  bauletto=" + bauletto + ", portaCellulare=" + portaCellulare + ", kitRiparazione="
				+ kitRiparazione + ", scontoPraticato= " + scontoPraticato() + ", toString()=" + "]";
	}
	

}