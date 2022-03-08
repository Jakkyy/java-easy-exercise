public class Persona
{
	private String nome;
	private String cognome;
	private double altezza;
	private double mediaVoti;
	private String classe;
	
	public Persona(String nome, String cognome, double altezza, double mediaVoti, String classe)
	{
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.altezza = altezza;
		this.mediaVoti = mediaVoti;
		this.classe = classe;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String toString()
	{
		return "\nNome: " +nome +  "\nCognome: " +cognome + "\nAltezza: " +altezza + "\nMediaVoti: " +mediaVoti + "\nClasse: " +classe; 
	}
	
	
}
