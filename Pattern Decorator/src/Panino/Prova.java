package Panino;

public class Prova 
{
	public static void main(String[] args)
	{
		//PaninoSemplice panino = new PaninoSemplice(new PaninoScaldato(new PaninoConPatatine(new PaninoDoppio()))); non posso farlo manca il costruttore nella classe madre;
		
		PaninoScaldato panino = new PaninoScaldato(new PaninoConPatatine(new PaninoDoppio(new PaninoSemplice())));
		
		System.out.println(panino.Visualizza());
		
		System.out.println(panino.Costo());
		
		
		
	}
}
