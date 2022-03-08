package com.azienda.esempiCorso.sessione6;

public class EsempioEccezioni2
{
	public int divisione(int x,int y) throws Exception
	{
		if ( y == 0 )
		{
			throw new Exception("");
		}
		int z = x/y;
		return z;
	}

}