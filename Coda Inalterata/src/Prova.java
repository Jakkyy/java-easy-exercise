/*
Data una coda A con elementi ( non sappiamo quanti) copiarla in una coda B lasciando la A inalterata.
 */

public class Prova 
{
	public static void main(String[] args)
	{
		Coda Coda1 = new Coda();
		Coda Coda2 = new Coda();
		Pila Pila1 = new Pila();
		Pila Pila2 = new Pila ();


		//Riempo in modo casuale la coda1
		int i = 0;
		int casuale;
		while(i<10)
		{
			casuale = (int)(Math.random()*10);
			Coda1.enqueue(casuale);
			i++;
		}


		while(Coda1.isEmpty() == false)
		{
			Pila1.Push(Coda1.dequeue());
		}


		while(Pila1.IsEmpty() == false)
		{
			Pila2.Push(Pila1.Pop());
		}



		//Ciclo che riempe la coda 2 con gli
		//elementi nello stesso ordine

		while(Pila2.IsEmpty() == false)
		{
			Coda2.enqueue(Pila2.TopElem());
			Coda1.enqueue(Pila2.Pop());
		}


		//Stampa coda1
		/*int z = 0;
		while(z < 10)
		{
		System.out.println(Coda1.dequeue());
		z++;
		}

		System.out.println("\n\n\n");

		//Stampa coda2
		int z1 = 0;
		while(z1 < 10)
		{
		System.out.println(Coda2.dequeue());
		z1++;
		}
		*/
		
		System.out.println("Coda 1" +Coda1);
		System.out.println("\nCoda 2" +Coda2);
	}


}
