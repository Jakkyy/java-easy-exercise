
public class AutoFuoristrada extends Auto
{
	private int trazione4x4;
	



	public AutoFuoristrada(int cilindrata, String colore, String targa, int velMax, int consumo, int trazione4x4) 
	{
		super(cilindrata, colore, targa, velMax, consumo);
		this.trazione4x4 = trazione4x4;
	}

	public int getTrazione4x4() {
		return trazione4x4;
	}

	public void setTrazione4x4(int trazione4x4) {
		this.trazione4x4 = trazione4x4;
	}
	
	public void strada()
	{
		System.out.println("questo metodo è di fuori strada");
	}
	
		
	
	
}
