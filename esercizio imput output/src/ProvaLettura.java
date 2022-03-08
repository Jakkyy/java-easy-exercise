import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProvaLettura
{
	public static void main(String[] args)
	{
		//Cane c = new Cane(new Mammifero());
		//c.mangia();
		// TODO Auto-generated method stub
		// notare la ereditarietà per composizione!!!
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("sas");
		
		try 
		{
			String s, s2 = new String();
			s = "";
			
		    while(s != null)
		    {
		    	s = in.readLine();
		    	s2 += s + "\n"; 
		    }
		    in.close();
		} 
		catch (IOException e)
		{
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
