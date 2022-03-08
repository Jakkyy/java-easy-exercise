package com.azienda.esempiCorso.sessione6;

public class EsempioEccezioni3
{
	public int divisione(int x,int y) throws Exception
	{
		if ( y == 0 )
		{
			throw new Exception("Il dividendo non può essere uguale a 0");
		}
		int z = x/y;
		return z;
	}	
}