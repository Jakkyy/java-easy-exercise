package com.azienda.esempiCorso.sessione6;

public class UsoEccezioni3
{
	public static void main(String args[])
	{
		try
		{
			EsempioEccezioni3 oggetto = new EsempioEccezioni3();
			oggetto.divisione(5,0);
		}
		catch (Exception ex) 
		{
			String message = ex.getMessage();
			System.out.println("Eccezione catturata nella classe chiamante. Messaggio: " + message);
		}
	}
}