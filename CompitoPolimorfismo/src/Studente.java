public class Studente extends Persona
{
	private int matricola;

	public Studente(String nome, String cognome, int ggNascita, int mmNascita, int aaNascita, int matricola) {
		super(nome, cognome, ggNascita, mmNascita, aaNascita);
		this.matricola = matricola;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	public void Mangia()
	{
		System.out.println("lo studente mangia");
	}
}
