import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalogo<E extends Moto>
{
		private List<E> catalogo;
		
		//costruttore
		public Catalogo()
		{
			this.catalogo=new ArrayList<E>();
		}
		
		//aggiunta moto
		public void aggiungiMoto(E moto)
		{
			this.catalogo.add(moto);
		}
		
		//aggiunta moto
		public void cancellaMoto(E moto)
		{
			this.catalogo.remove(this.catalogo.remove(catalogo.indexOf(moto)));
		}
		
		// prezzo totale
	    public double calcolaPrezzoTotale()
		{
			double prezzo = 0;
			
			if (this.catalogo.isEmpty())
			{
				System.out.println("Il catalogo non contiene moto, quindi prezzo totale= "+ prezzo);
			}
			
			Iterator<E> it=this.catalogo.iterator();
			
			while(it.hasNext())
			{
				E moto=it.next();
				prezzo = prezzo + (moto.getPrezzoListino()-moto.scontoPraticato());
			}
			
			return prezzo;
		}
		
		//toString
		public String toString()
		{
			String s="Catalogo articoli";
			s+="---------Moto:------------\n";
			Iterator<E> it=this.catalogo.iterator();
			while(it.hasNext())
			{
				E moto=it.next();
				s+=moto.toString() +"\n";
			}
			
			s+="prezzo totale = "+ this.calcolaPrezzoTotale();
			return s;
		}

}