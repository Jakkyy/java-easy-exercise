package Panino;

public class PaninoScaldato extends PaninoSemplice
{
	private PaninoSemplice p;

	public PaninoScaldato(PaninoSemplice p) {
		super();
		this.p = p;
	}
	
	public String Visualizza()
	{
		return p.Visualizza() + "Scaldato ";
	}
	
	public double Costo()
	{
		return p.Costo() + 0.5;
	}
	
	
}
