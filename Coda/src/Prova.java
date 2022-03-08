/*
Data un coda contenente i caratteri della parola GIRAFFA con in coda la lettera A e in testa la G, trasferirli in una
pila in modo che la parola sia leggibile dall'alto verso il basso ( al top c'è la G)

 */

public class Prova
{
	public static void main(String[] args)
	{
		Coda a = new Coda();
		Pila b = new Pila();
		Pila appoggio = new Pila();
		
		System.out.println("Coda: " +a);
		
		a.enqueue("G");
		a.enqueue("i");
		a.enqueue("r");
		a.enqueue("a");
		a.enqueue("f");
		a.enqueue("f");
		a.enqueue("a");
		
		System.out.println("Coda: " +a);
		
		while(a.isEmpty() == false)
		{
			appoggio.push(a.dequeue());
		}
		
		System.out.println("Coda: " +a);
		
		System.out.println("Pila appoggio: " +appoggio);
		
		while(appoggio.isEmpty() == false)
		{
			b.push(appoggio.pop());
		}
	
		System.out.println("Pila: " +b);
		
	}
}
