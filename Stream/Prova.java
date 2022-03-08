import java.util.*;

/*
Scrivere il programma Scrivi<cognome>.java che scrive i dati relativi ad una persona ( nome, cognome, et�, altezza
in metri, media voti, classe) in un file di tipo binario SALVATAGGIO.DAT utilizzando i tipi che desiderate per i campi. 
Ripristinarli poi con un diverso programma (Leggi<cognome>.java).

 */

public class Prova 
{
	public static void main(String args[]) throws IOException
	{
		Persona a = new Persona("Matteo", "De Persis", 1.75, 6.0, "4C");
		Persona b = new Persona("gioele", "Cella", 1.79, 4.0, "4C");
		
		
		File f = new File("Cognomi.txt");
		//FileOutputStream in = new FileOutputStream("Cognomi.txt", true);
		 
		 
		 if(f.exists() == true) {
			 FileOutputStream in = new FileOutputStream("Cognomi.txt", true);
			 PrintWriter scrivi = new PrintWriter(in);
			 
			 BuffereReader i0n = new BufferedReader(new InputStreamReader(System.in));
			 String x = i0n.readLine("ciao");
			 scrivi.append(x);
			 scrivi.append(b.toString());
			 
			 
			 
			 scrivi.close();
			 
			 System.out.println("il file esiste");
		 }
		 else if(f.createNewFile()) 
		 {
			 PrintWriter scrivi = new PrintWriter(f);
			 
			 scrivi.println("NON ORA");
			 scrivi.close();
			 System.out.println("file creato");
		 }
	}
}
