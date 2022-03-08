
public class Professore extends Persona
{
	private int stipendio;
	
	public Professore(String nome, String cognome, int ggNascita, int mmNascita, int aaNascita, int stipendio) {
		super(nome, cognome, ggNascita, mmNascita, aaNascita);
		this.stipendio = stipendio;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public void Mangia()
	{
		System.out.println("il prof mangia");
	}
}
