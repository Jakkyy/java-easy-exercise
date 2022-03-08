public class Moto
{
	private String modello;
	private int potenzaCV;
    private double prezzoListino;
    private int motorizzazione;  //1-due tempi, 2-quattro tempi, 3-elettrica
    
    //costruttore con campi
	public Moto(String modello, int potenzaCV, double prezzoListino, int motorizzazione) 
	{
		this.modello = modello;
		this.potenzaCV = potenzaCV;
		this.prezzoListino = prezzoListino;
		this.motorizzazione = motorizzazione;
	}
	
	//costruttore di dft
    public Moto () 
    {
    	this.modello = "";
		this.potenzaCV = 0;
		this.prezzoListino = 0;
		this.motorizzazione = 0 ;
    }
    
    // getter e setter
    public String getModello() 
    {
		return modello;
	}

	public void setModello(String modello) 
	{
		this.modello = modello;
	}

	public int getPotenzaCV() 
	{
		return potenzaCV;
	}

	public void setPotenzaCV(int potenzaCV) 
	{
		this.potenzaCV = potenzaCV;
	}

	public double getPrezzoListino() 
	{
		return prezzoListino;
	}

	public void setPrezzoListino(double prezzoListino) 
	{
		this.prezzoListino = prezzoListino;
	}

	public int getMotorizzazione() 
	{
		return motorizzazione;
	}

	public void setMotorizzazione(int motorizzazione) 
	{
		this.motorizzazione = motorizzazione;
	}
	
	//sconto iniziale
	public double scontoPraticato()
	{
		double sconto = 0;
		
		return sconto;
	}

    //toString
	@Override
	public String toString() {
		return "Moto modello=" + modello + ", potenzaCV=" + potenzaCV + ", prezzoListino=" + prezzoListino
				+ ", motorizzazione=" + motorizzazione + "]";
	}
}
