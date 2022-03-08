public class PizzaConPastaIntegrale extends Pizza {
	private Pizza p;
	PizzaConPastaIntegrale(Pizza p){
		this.p = p;
	}
	// specie di overriding
	public String infornaPizza() {
		return this.p.infornaPizza()+" con pasta integrale";
	}

}