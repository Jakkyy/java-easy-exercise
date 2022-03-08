public class Lampadina
{
	private int colore;
	private int luminosita;
	private boolean stato;
	
	public Lampadina(int colore, int LMax, boolean stato)
	{
		this.colore = colore;
		this.luminosita = LMax;
		this.stato = stato;
	}
	
	public int getColore()
	{
		return colore;
	}

	public void setColore(int colore)
	{
		do
		{
			this.colore = colore;
		}
		while((colore > 0) && (colore < 3));
	}

	public int getLuminosita()
	{
		return luminosita;
	}

	public void setLuminosita(int luminosita)
	{
		this.luminosita = luminosita;
	}

	public boolean isStato()
	{
		return stato;
	}

	public void setStato(boolean stato)
	{
		this.stato = stato;
	}
	
	
	
	
	public int varLum(int n, int c)
	{
		if(c == 0)
			luminosita = luminosita - n;
		else
			luminosita = luminosita + n;
		
		return luminosita;
	}
	
	public boolean lightOn()
	{
		stato = true;
		return stato;
	}
	
	public boolean lightOff()
	{
		stato = false;
		return stato;
	}
	
	public void ColoreStringa()
	{
		if(colore == 1)
			System.out.println("verde");
		if(colore == 2)
			System.out.println("arancione");
		if(colore == 3)
			System.out.println("rosso");
	}
	
	public void lampeggia(int t)
	{
		System.out.println("la lampadina lampeggia per -> " +t);
	}
		
	public String toString()
	{
		return "codice colore=" +colore + "luminosita =" +luminosita + "stato =" +stato  +"]";
	}
		
	
	
}
	


	
	
	
	
	

