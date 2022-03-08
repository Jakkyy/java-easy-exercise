
	public class RadarGeometrico
	{
	   
	    public double Distanza(Punto uno, Punto due)
	    {
	    	 return Math.sqrt(Math.pow((due.getX()-uno.getX()),2)+Math.pow((due.getY()-uno.getY()),2));
	    }
	    
	    public boolean seSovrapposto(Punto uno, Punto due)
	    {
	    	if((uno.getX() == due.getX()) && (uno.getY() == due.getY()))
	    		return true;
	    	else
	    		return false;
	    }
	    
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }


