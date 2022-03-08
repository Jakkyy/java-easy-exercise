package Panino;

public class PaninoDoppio extends PaninoSemplice
{
	private PaninoSemplice p;

	public PaninoDoppio(PaninoSemplice p) {
		super();
		this.p = p;
	}
	
	public String Visualizza()
	{
		return p.Visualizza() + "Doppio ";
	}
	
	public double Costo()
	{
		return p.Costo() +2.0;
	}
}
