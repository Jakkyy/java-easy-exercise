package com.azienda.esempiCorso.sessione6;

public class EsempioEccezioni4 
{
	public int divisione(int x,int y) throws Exception
	{
		int z = 0;
		try
		{
			z = x/y;
		}
		catch (ArithmeticException ex) 
		{
			throw new RuntimeException("Il dividendo non può essere uguale a 0",ex);
		}
		return z;
	}	
}