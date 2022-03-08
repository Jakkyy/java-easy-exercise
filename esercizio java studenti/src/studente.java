public class studente
{
	private String nome;
	private String cognome;
	private int nascita;
	private int voti[];
	private int datavoto[];
	
	

	public studente(String nome, String cognome, int nascita)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
	}

	public int[] getDatavoto() {
		return datavoto;
	}

	public void setDatavoto(int[] datavoto) {
		this.datavoto = datavoto;
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

	public int getNascita() {
		return nascita;
	}

	public void setNascita(int nascita) {
		this.nascita = nascita;
	}

	public int[] getVoti() {
		return voti;
	}

	public void setVoti(int[] voti) {
		this.voti = voti;
	}
	
	public void elenco(int a)
	{
		int i;
		for(i = 0; i < a; i++)
		{
			System.out.println("voto ->" +voti[i]);
			System.out.println("data ->" +datavoto[i]);
		}	
	}
	
	public int media(int a)
	{
		int somma = 0, media = 0;
		
		for(int i = 0; i < a; i++)
			somma = somma + voti[i];
		media = somma / a;
		
		return media;
	}
	
	
}
