package com.azienda.esempiCorso.sessione6;

import java.io.FileInputStream;

public class EsempioEccezioniConFinally
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fileInputStream = null; 
		try
		{
			int x = 3;
			int y = 0;
			fileInputStream = new FileInputStream("C:/temp/test.txt");
			System.out.println("Aperto il file");
			int z = x/y;
			System.out.println("z=" + z);
		}
		catch (Exception ex) 
		{
			int w = 5/0; /* forziamo appositamente un'altra eccezione per andare nel blocco finally*/
			if ( fileInputStream != null )
			{
				fileInputStream.close(); /* questa istruzione non verrà eseguita poichè la precedente rilancia un'eccezione */
				System.out.println("Chiuso il file");
			}
			System.out.println("Si è verificata un'eccezione -> siamo nel blocco catch");
		}
		finally
		{
			/* qui dovremmo rilasciare eventuali risorse rimaste aperte */
			System.out.println("Nel blocco finally");
			if ( fileInputStream != null )
			{
				fileInputStream.close();
				System.out.println("Chiuso il file");
			}
		}
	}
}