public class Cliente {
	// variabile di classe, aumenta ad ogni istanza
    public static int numPresentiOra=0;
 
    public Cliente() {
		super();
		// ad ogni istanziazione aumenta 
		numPresentiOra++;
	}
    
	public String getRischio(int maxClienti) {
		float percentClienti;
        percentClienti = (numPresentiOra * 100) / maxClienti;
        if (percentClienti < 30)
            return "Bianco";
        if (percentClienti >= 30 && percentClienti < 60)
        	return "Giallo";
        if (percentClienti >= 60 && percentClienti <= 90)
        	return "Arancione";
        if (percentClienti > 90)
        	return "Rosso";
        return "Bianco";
    }
}
