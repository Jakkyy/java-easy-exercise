
public class Auto
{
	private int cilindrata;
	private String colore;
	private String targa;
	private int velMax;
	private int consumo;
	
	public Auto(int cilindrata, String colore, String targa, int velMax, int consumo)
	{
		super();
		this.cilindrata = cilindrata;
		this.colore = colore;
		this.targa = targa;
		this.velMax = velMax;
		this.consumo = consumo;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public void metodo()
	{
		System.out.println("questo metodo è di auto");
	}
	
	
}
