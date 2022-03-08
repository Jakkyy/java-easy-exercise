public class Prova
{
	public static void main(String[] args)
	{
		Punto x = new Punto(5.0, 8.0);
		
		Punto y = new Punto(8.0, 5.0);
		
		RadarGeometrico radar = new RadarGeometrico();
		
		System.out.println("la distanza e -> " +radar.Distanza(x,y));
		
		System.out.println(radar.seSovrapposto(x,y));
		
		
		
		
	}
}
