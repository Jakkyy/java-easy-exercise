public class ProvaCondominio
{
	public static void main(String[] args)
	{
		Persona uno = new Persona("Matteo", "De Persis", 4, 3, 2002);
		
		Persona due = new Persona("Mario", "Rossi", 5, 6, 1987);
		
		Locale a = new Locale(101.0, 97, true, 15, "Matteo", "Agnese" , 1.0, 4);
		Locale b = new Locale(94.0, 52, true, 8, "Mario", "Gaia" , 1.0, 9);
		
		if(a.getSoldiAmministratore() < b.getSoldiAmministratore())
		{
			System.out.println("sono locale a ->" +a.getSoldiAmministratore());
			System.out.println("sono locale b ->" +b.getSoldiAmministratore());
		}
		else
		{
			System.out.println("sono locale b ->" +b.getSoldiAmministratore());			
			System.out.println("sono locale a ->" +a.getSoldiAmministratore());
		}
	}
}



			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

