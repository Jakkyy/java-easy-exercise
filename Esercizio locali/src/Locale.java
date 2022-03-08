
public class Locale
{
	private double mq;
	private int mCubi;
	private boolean seAbitabile;
	private int interno;
	private String locatore;
	private String proprietario;
	private double soldiAmministratore;
	private int piano;
		
		
		
	public Locale(double mq, int mCubi, boolean seAbitabile, int interno, String locatore, String proprietario,
			double soldiAmministratore, int piano)
	{
		this.mq = mq;
		this.mCubi = mCubi;
		this.seAbitabile = seAbitabile;
		this.interno = interno;
		this.locatore = locatore;
		this.proprietario = proprietario;
		this.soldiAmministratore = soldiAmministratore;
		this.piano = piano;
	}

	public double Calcolo()
	{
		double amministrazione;
		if(this.mq <= 100)
		{
			amministrazione = 3 * mq;
		}
		else
		{
			amministrazione = (100 * 3)+((mq - 100)*(1/2)) ;
		}
		setSoldiAmministratore(amministrazione);
		
		return amministrazione;
		
	}

	public double getMq() {
		return mq;
	}

	public void setMq(double mq) {
		this.mq = mq;
	}

	public int getmCubi() {
		return mCubi;
	}

	public void setmCubi(int mCubi) {
		this.mCubi = mCubi;
	}

	public boolean isSeAbitabile() {
		return seAbitabile;
	}

	public void setSeAbitabile(boolean seAbitabile) {
		this.seAbitabile = seAbitabile;
	}

	public int getInterno() {
		return interno;
	}

	public void setInterno(int interno) {
		this.interno = interno;
	}

	public String getLocatore() {
		return locatore;
	}

	public void setLocatore(String locatore) {
		this.locatore = locatore;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getSoldiAmministratore() {
		Calcolo();
		return soldiAmministratore;
	}

	public void setSoldiAmministratore(double soldiAmministratore)
	{
		
		this.soldiAmministratore = soldiAmministratore;
	}

	public int getPiano() {
		return piano;
	}

	public void setPiano(int piano) {
		this.piano = piano;
	}

}
