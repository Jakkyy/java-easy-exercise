public class Prova {

	public static void main(String[] args) 
	{
		Catalogo<Moto> mieMoto = new Catalogo<Moto>();
		
		Moto uno = new scooter("ScooterUno", 50, 2000.00, 
				3, "baulettoUno", "portaCellulareUno", "kitRiparazioneUno");
		
		mieMoto.aggiungiMoto(uno);
		System.out.println(uno.toString());
		
		Moto due = new Stradali("StradaleDue", 150, 1000.00, 
				2, "carenaDue", "borselloDue", "kitRiparazioneDue");
		
		mieMoto.aggiungiMoto(due);
		System.out.println(due.toString());
		
		Moto tre = new Enduro("EnduroTre", 250, 3000.00, 
				1, "forcellaTre", "pneumaticiTre", "kitRiparazioneTre");
		
		mieMoto.aggiungiMoto(tre);
		System.out.println(tre.toString());
		
		Moto quattro = new Ipermotard("IpermotardQuattro", 125, 2500.00, 
				1, 1.5, "sellaQuattro", "kitRiparazioneQuattro");
	
		mieMoto.aggiungiMoto(quattro);
		System.out.println(quattro.toString());
		
		Stradali cinque = new Stradali("StradaleCinque", 150, 1500.00, 
				1, "carenaCinque", "borselloCinque", "kitRiparazioneCinque");
		
		mieMoto.aggiungiMoto(cinque);
		System.out.println(cinque.toString());
		
		
		System.out.println("Valore totale catalogo= "+ mieMoto.calcolaPrezzoTotale());
		
		//cancellazione moto dal catalogo
		mieMoto.cancellaMoto(due);
		
		System.out.println("Nuovo valore totale catalogo= "+ mieMoto.calcolaPrezzoTotale());
		
	}

}