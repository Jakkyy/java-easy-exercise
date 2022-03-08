/*
 * dopo aver riempito una pila A di caratteri con le lettere C I A O, ottenere una pila C con le stesse lettere 
 * nello stesso ordine e la pila A vuota . Si utilizzino solo le operazioni tipiche delle pile e dati di tipo pila
 */
public class Prova
{
	public static void main(String[] args)
	{
		Pila a = new Pila(); //pila caratteri ciao
		
		Pila b = new Pila(); //pila caratteri ciao //pila vuota

		System.out.println("Pila a:" +a);
		
		System.out.println("inserisco la parola ciao:");
		
		a.push("C");
		a.push("i");
		a.push("a");
		a.push("o");
		
		System.out.println("Pila a:" +a);
		
		System.out.println("inserisco Ciao nella Pila b:");
		
		while(a.isEmpty() == false)
		{
			b.push(a.pop());
		}
		
		System.out.println("Pila a:" +a);

		System.out.println("Pila b:" +b);
		
	
		
	}
}
