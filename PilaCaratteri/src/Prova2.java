/*
dopo aver riempito una pila A con le lettere C I A O, ottenere una pila C con le stesse lettere nello stesso ordine e
la pila A inalterata. Si utilizzino solo le operazioni tipiche delle pile e dati di tipo pila
*/
public class Prova2 
{
	public static void main(String[] args)
	{
		Pila a = new Pila();
		
		Pila c = new Pila();
		
		System.out.println("Pila a:" +a);
		
		System.out.println("Pila c:" +a);
		
		a.push("C");
		a.push("i");
		a.push("a");
		a.push("o");
		
		System.out.println("Pila a:" +a);
		
		while(a.isEmpty() == false)
		{
			c.push(a.pop());
			
		}
		
		while(c.isEmpty() == false)
		{
			a.push(c.pop());
		}
		
		
		
		
		System.out.println("\nPila a:" +a);
		
		System.out.println("\nPila c:" +c);
		
		
		
		
		
	}
}
