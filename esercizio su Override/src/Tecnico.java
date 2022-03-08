public class Tecnico
{
	private String nome;
	private int anzianita;
	private double stipendio;
	private String progetto;
	
	public Tecnico(String nome, int anzianita, double stipendio, String progetto) 
	{
		super();
		this.nome = nome;
		this.anzianita = anzianita;
		this.stipendio = stipendio;
		this.progetto = progetto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public String getProgetto() {
		return progetto;
	}

	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}
	
	public double aumentaStipendio(double incremento)
	{
		incremento = ((anzianita * incremento)*10);
		if(incremento > 1000)
		{
			incremento = 1000;
			stipendio = stipendio + incremento;
		}
		else
			stipendio = stipendio + incremento;
		return stipendio;
		
	}
	
		
		
		
	}




