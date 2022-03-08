public class Prova {
	public static void main(String args[]) {
		
		PizzaBase pizzaBase=new PizzaBase();
		PizzaCapricciosa capricciosa=new PizzaCapricciosa(pizzaBase);
		//PizzaConPastaIntegrale piCapricciosa = new PizzaConPastaIntegrale(capricciosa);
		PizzaConPastaIntegrale piBase = new PizzaConPastaIntegrale(pizzaBase);
		//PizzaConNutella b=new PizzaConNutella(new PizzaCapriocciasa()));
		PizzaConPastaIntegrale piCapricciosa=new PizzaConPastaIntegrale(new PizzaCapricciosa(new PizzaBase()));
		// chiamo il metodo inforna
		//System.out.println(pizzaBase.infornaPizza());
		//System.out.println(capricciosa.infornaPizza());
		System.out.println(piCapricciosa.infornaPizza());
		//System.out.println(piBase.infornaPizza());

	}
	
}