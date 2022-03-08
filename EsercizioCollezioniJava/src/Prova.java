public class Prova
{
	public static void main(String[] args)
	{
		Rubrica<Contatto> miaRubrica = new Rubrica<Contatto>();
		
		Contatto uno = new Contatto("Stefano", "Posca", "3409429942");
		miaRubrica.AggiungiContatto(uno);
		//System.out.println(uno.toString());
		//System.out.println(miaRubrica.Cerca("Stefano", "Posca"));
		
		Contatto due = new Contatto("Gaia", "Fiorentini", "3477136109");
		miaRubrica.AggiungiContatto(due);
		
		Contatto tre = new Contatto("Matteo","De Persis", "3290408196");
		miaRubrica.AggiungiContatto(tre);
		//System.out.println(tre.toString());
		
		System.out.println(miaRubrica.toString());
	}
}
