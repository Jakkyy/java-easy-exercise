public class semaforo
{
	private String ubicazione;
	private int livelloLum;
	private String posizioneGPS;
	public String getUbicazione() {
		return ubicazione;
	}
	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}
	public int getLivelloLum() {
		return livelloLum;
	}
	public void setLivelloLum(int livelloLum) {
		this.livelloLum = livelloLum;
	}
	public String getPosizioneGPS() {
		return posizioneGPS;
	}
	public void setPosizioneGPS(String posizioneGPS) {
		this.posizioneGPS = posizioneGPS;
	}
	
	public void lampeggiaArancio()
	{
		System.out.println("il semaforo lampeggia");
	}
	
	public void spegni()
	{
		System.out.println("il semaforo è spento");
	}
	
	public void attiva()
	{
		System.out.println("il semaforo è acceso");
	}
	
	
}
