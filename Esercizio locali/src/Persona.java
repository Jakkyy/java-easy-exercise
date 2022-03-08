
public class Persona
{
	private String nome;
	private String cognome;
	private int ggNascita;
	private int mmNascita;
	private int aaNascita;
	
	
	public Persona(String nome, String cognome, int ggNascita, int mmNascita, int aaNascita)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.ggNascita = ggNascita;
		this.mmNascita = mmNascita;
		this.aaNascita = aaNascita;
	}
	
	
	
	
	public void setnome(String nome)
	{
		this.nome = nome;
	}
	
	public void setcognome(String cognome)
	{
		this.cognome = cognome;
	}
	
	public void setggNascita(int ggNascita)
	{
		this.ggNascita = ggNascita;
	}
	
	public void setmmNascita(int mmNascita)
	{
		this.mmNascita = mmNascita;
	}
	
	public void setaaNascita(int aaNascita)
	{
		this.aaNascita = aaNascita;
	}

	public String getnome()
	{
		return this.nome;
	}
	
	public String getcognome()
	{
		return this.cognome;
	}
	
	public int getggNascita()
	{
		return this.ggNascita;
	}
	
	public int getmmNascita()
	{
		return this.mmNascita;
	}
	
	public int getaaNascita()
	{
		return this.aaNascita;
	}
}
