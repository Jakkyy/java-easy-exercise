public class Classe
{
	private String nome;
	private int capienza;
	private String collocazione;
	public String getNome() {
		return nome;
	}
	
	public Classe(String nome, int capienza, String collocazione)
	{
		this.nome = nome;
		this.capienza = capienza;
		this.collocazione = collocazione;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	public String getCollocazione() {
		return collocazione;
	}
	public void setCollocazione(String collocazione) {
		this.collocazione = collocazione;
	}
	
	
}
