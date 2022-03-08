public class TecnicoSpecializzato extends Tecnico 
{
	private String specializzazione;

	public TecnicoSpecializzato(String nome, int anzianita, double stipendio, String progetto,
			String specializzazione) 
	{
		super(nome, anzianita, stipendio, progetto);
		this.specializzazione = specializzazione;
	}

	
	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	public double aumentaStipendio(double incremento)
	{
		super.setStipendio((getAnzianita() * incremento)*10);
		return getStipendio();
	}
}
