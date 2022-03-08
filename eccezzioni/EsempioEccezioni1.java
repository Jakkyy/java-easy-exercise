package com.azienda.esempiCorso.sessione6;

public class EsempioEccezioni1
{
	public static void main(String args[])
	{
		try
		{
			int x = 3;
			int y = 0;
			int z = x/y;
			System.out.println("z=" + z);
		}
		catch (Exception ex) 
		{
			System.out.println("Si è verificata un'eccezione -> siamo nel blocco catch");
			ex.printStackTrace();
		}
	}
}