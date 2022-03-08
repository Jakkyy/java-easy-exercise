import java.util.ArrayList;

public class Supermercato {
    private int maxClienti;
    ArrayList<Cliente> clienti = new ArrayList<>(maxClienti);

    // si basa sui dati interni e NON  sulla variabile statica
    public String getRischioInterno(){
    	float percentClienti;
        percentClienti = ( getClientiPresenti() * 100) / getMaxClienti();
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
    
    public int getMaxClienti() {
        return this.maxClienti;
    }

    public void setMaxClienti(int maxClienti) {
        this.maxClienti = maxClienti;
    }

    public int getClientiPresenti() {
        return this.clienti.size();
    }

    public void addClienti(Cliente c)
    {
        if (this.clienti.size() < this.maxClienti)
        {
            clienti.add(c);
        }
        else
            System.out.println("supermercato pieno!");
    }

}

