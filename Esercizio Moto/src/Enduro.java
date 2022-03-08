public class Enduro extends Moto 
{
	private String forcella;
	private String pneumatici;
	private String kitRiparazione;

	//costruttore
	public Enduro(String modello, int potenzaCV, double prezzoListino, 
			int motorizzazione, String forcella, String pneumatici, String kitRiparazione) 
	{
		super(modello, potenzaCV, prezzoListino, motorizzazione);
		this.forcella = forcella;
		this.pneumatici = pneumatici;
		this.kitRiparazione = kitRiparazione;
	}

	//costruttore dft
	public Enduro() 
	{
		super();
		forcella ="";
		pneumatici = "";
		kitRiparazione = "";
	}
	
	//getter e setter
	public String getforcella() {
		return forcella;
	}

	public void setforcella(String forcella) {
		this.forcella = forcella;
	}

	public String getpneumatici() {
		return pneumatici;
	}

	public void setpneumatici(String pneumatici) {
		this.pneumatici = pneumatici;
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
			  sconto = 170.0;
			  break;
		  case 2:
			  sconto = 200.0;
		      break;
		  default:
			  return sconto;
		}
		
		return sconto;
	}

	@Override
	public String toString() {
		return "Enduro "+ super.toString() + "[  forcella=" + forcella + ", pneumatici=" + pneumatici + ", kitRiparazione="
				+ kitRiparazione + ", scontoPraticato= " + scontoPraticato() + ", toString()=" + "]";
	}
	

}
