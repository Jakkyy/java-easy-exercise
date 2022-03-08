public class Cane
{
	private Mammifero madre;
	
	public Cane(Mammifero madre)
	{
		this.madre = madre;
	}
	
	public void mangia() {
		System.out.println("questo è di cane");
		this.madre.mangia();
	}
}
