package Panino;

public class PaninoConPatatine extends PaninoSemplice
{
	private PaninoSemplice p;

	public PaninoConPatatine(PaninoSemplice p) {
		super();
		this.p = p;
	}
	
	public String Visualizza()
	{
		return p.Visualizza() + "Con Patatine ";
	}
	
	public double Costo()
	{
		return p.Costo() + 1.0;
	}
}
