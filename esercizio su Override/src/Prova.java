
public class Prova
{
	public static void main(String[] args)
	{
		Tecnico a = new Tecnico("Matteo", 15, 800, "Bello");
		TecnicoSpecializzato b = new TecnicoSpecializzato("franco", 40, 1200, "figo", "specializzazione A");
		
		a.aumentaStipendio(5);
		
		b.aumentaStipendio(5);
		
		System.out.println(a.getStipendio());
		
		System.out.println(b.getStipendio());
		
		
		
		
	}
}
