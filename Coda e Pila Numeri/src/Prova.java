/*
Data una PIla A contenente dieci numeri interi disordinati, trasferirli in una pila B(lista) in modo ordinato
 */
public class Prova 
{
	public static void  main(String[] args)
	{
		Pila disordinata = new Pila();
		
		
		Lista ordinato = new Lista();
		
		
		int i = 0;
		
		/*
		int casuale;
		while(i<3)
		{
			casuale = (int)(Math.random()*10);
			disordinata.push(casuale);
			i++;
		}
		*/
		
		
		System.out.println("programma: Data una PIla A contenente dieci numeri interi disordinati, trasferirli in una pila B(lista) in modo ordinato, senza contare lo zero");
		
		disordinata.push(0);
		disordinata.push(7);
		disordinata.push(3);
		disordinata.push(4);
		disordinata.push(2);
		



		
		
		System.out.println("Pila disordinata :" +disordinata);
		
		int n = 0;
		
		n = disordinata.pop();
		int m = disordinata.pop();
		
		System.out.println("N:" +n + "\nM:" +m);
		
		for ( i = 0; i < 4; i++) {
			if(n <= m) 
			{
				if(n != 0)
					ordinato.addNodeAtTheEnd(n);
				n = disordinata.pop();
				ordinato.print();
				System.out.println("N:" +n + "\nM:" +m);
			}
			else 
			{
				if(m != 0)
				ordinato.addNodeAtTheEnd(m);				
				m = disordinata.pop();
				ordinato.print();
				System.out.println("N:" +n + "\nM:" +m);
			}
			if(n == 0)
				ordinato.addNodeAtTheEnd(m);
			if(m == 0)
				ordinato.addNodeAtTheEnd(n);
			ordinato.removeDuplicate();
		}
		
		ordinato.print();
		
		
		
	
	
	
	}
	
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int i2 = 0;
		int n = 0;
		int m = 0;
		
		try
		{
			while(i2 < 3)
			{
				if(i2 == 0)
				{
					n = disordinata.pop();
					m = disordinata.pop();
				}
				for(i = 0; i < 3; i++)
				{
					if(n < m)
					{
						ordinata.push(n);
						n = disordinata.pop();
					}
					else
					{
						ordinata.push(m);
						m = disordinata.pop();
					}
				}
				
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		*/
		
		//ciclo per mettere una pila ordinata
				

