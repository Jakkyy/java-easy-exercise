public class PizzaCapricciosa extends Pizza{
	private Pizza p;
	PizzaCapricciosa(Pizza p){
		this.p = p;
	}
	// specie di overriding
	public String infornaPizza() {
		return this.p.infornaPizza()+" con aggiunta di carciofini e olive";
	}
}