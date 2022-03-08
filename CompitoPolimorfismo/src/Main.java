
public class Main
{
	public static void main(String[] args)
	{
		Studente a = new Studente("Matteo", "De Persis", 4, 3, 2002, 22);
		
		Professore b = new Professore("Franco", "De Paoli", 10, 5, 1982, 1250);
		
		Persona c = new Professore("Gianni", "Bello", 8, 7, 1999, 800);
		
		c.Mangia(); //UPCASTING
		
		a.Mangia();
		
		b.Mangia();
		
		
	}
}
