public class codaInalterata {
    
	public static void main(String[] args)
	{
		CodaSTRING Coda1 = new CodaSTRING();
		CodaSTRING Coda2 = new CodaSTRING();
		PilaSTRING Pila1 = new PilaSTRING();
		PilaSTRING Pila2 = new PilaSTRING ();


		String[] array = {"ciao", "ciao1", "ciao2", "ciao3", "ciao4", "ciao5", "ciao6", "ciao7", "ciao8", "ciao9"};
		//Riempo in modo casuale la coda1
		int i = 0;
		int casuale;
		while(i<10)
		{
			casuale = (int)(Math.random()*10);
			Coda1.enqueue(array[casuale]);
			i++;
		}


		while(Coda1.isEmpty() == false)
		{
			Pila1.push(Coda1.dequeue());
		}


		while(Pila1.isEmpty() == false)
		{
			Pila2.push(Pila1.pop());
		}



		//Ciclo che riempe la coda 2 con gli
		//elementi nello stesso ordine

		while(Pila2.isEmpty() == false)
		{
			Coda2.enqueue(Pila2.TopElem());
			Coda1.enqueue(Pila2.pop());
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
