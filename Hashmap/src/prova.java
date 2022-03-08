//Import the HashMap class
import java.util.HashMap;
public class prova
{

	  public static void main(String[] args)
	  {
	   
	    HashMap<String, String> esercizio = new HashMap<String, String>();
	    esercizio.put("BBBFRC01P04D969D", "Federico");
	    esercizio.put("LIIVZB53D11L348L", "Linda");
	    esercizio.put("GMTGTK39H52E475R", "Gianluca");
	    esercizio.put("STNVFY48E12G327R", "Stefano");
	    esercizio.put("FWENBF65S61C442Q", "Franco");
	    
	    
	    
	    /*
	    esercizio.remove("FWENBF65S61C442Q");
	    System.out.println(esercizio);
	    */
	    
	    
	    for (String i : esercizio.keySet())
	    {
	    	  System.out.println("key: " + i + " valore: " + esercizio.get(i));
	    }
	  }
}