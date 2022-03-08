import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rubrica<E extends Contatto>
{
	private List <E> rubrica;
	
	public Rubrica()
	{
		this.rubrica=new ArrayList<E>();
	}

	public void AggiungiContatto(E contatto)
	{
		this.rubrica.add(contatto);
	}
	
	public void RimuoviContatto(E contatto)
	{
		this.rubrica.remove(this.rubrica.remove(rubrica.indexOf(contatto)));
	}

	public String Cerca(String nome, String cognome)
	{
		return Contatto.getNumeroTelefono();
	}
	
	public String toString()
	{
		String s="Rubrica Contatti\n";
		s+="---------Rubrica:------------\n";
		Iterator<E> it=this.rubrica.iterator();
		while(it.hasNext())
		{
			E contatto=it.next();
			s+=contatto.toString() +"\n";
		}
		return s;
	}
	






}
