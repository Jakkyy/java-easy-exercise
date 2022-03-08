public class Prova
{
	public static void main(String[] args)
	{
		Lista elimina = new Lista();
		
		elimina.addNodeAtTheEnd(9);
		elimina.addNodeAtTheEnd(9);

		elimina.print();
		
		elimina.removeDuplicate();
		
		elimina.print();
	}
}
