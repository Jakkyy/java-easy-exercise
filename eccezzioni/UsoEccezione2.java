package com.azienda.esempiCorso.sessione6;

public class UsoEccezione2 
{
	public static void main(String args[])
	{
		try
		{
			EsempioEccezioni2 oggetto = new EsempioEccezioni2();
			oggetto.divisione(5,0);
		}
		catch (Exception ex) 
		{
			System.out.println("Eccezione catturata nella classe chiamante.");
		}
	}
}