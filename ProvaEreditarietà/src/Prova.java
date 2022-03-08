
public class Prova
{
	public static void main(String[] args)
	{
		Auto a = new Auto(1200, "nero", "AHF75T", 150, 4);
		
		AutoFuoristrada b = new AutoFuoristrada(1550, "verde", "GGREF47", 170, 4, 4);
		
		a.metodo();
		//a.strada();
		
		b.strada();
		b.metodo();
		
		
	}
}
