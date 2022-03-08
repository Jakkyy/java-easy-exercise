package com.azienda.esempiCorso.sessione6;

public class UsoEccezioni4
{
	public static void main(String args[])
	{
		try
		{
			EsempioEccezioni4 oggetto = new EsempioEccezioni4();
			oggetto.divisione(5,0);
		}
		catch (Exception ex) 
		{
			String message = ex.getMessage();
			Throwable throwable = ex.getCause();
			System.out.println("Eccezione catturata nella classe chiamante.\nMessaggio: " + message + "\nEeccezione originale: " +
			throwable);
		}
	}
}