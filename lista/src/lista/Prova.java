package lista;

public class Prova {

	public static void main(String[] args) 
	{
		ListaSemplice list = new ListaSemplice();
		System.out.println("Creazione della mia Linked List\n");
		list.print();
		list.add(100);
		list.print();
		list.add(200);
		list.print();
		list.add(900);
		list.print();
		list.add(800);
		list.print();
		list.add(200);
		list.print();
		list.add(800);
		list.print();
		list.add(900);
		System.out.println("lista prima:");
		list.print();
		
		list.removeDuplicate();
		System.out.println("lista dopo:");
		list.print();
		///---
		ListaSemplice lista1 = new ListaSemplice();
		for (int i = 1; i <= 8; i++) {
			lista1.addNodeAtTheEnd(i);
			lista1.print();
		}
		
		lista1.print();
		lista1.deleteFirstOccurenceOfData(1);
		lista1.print();
		lista1.deleteFirstOccurenceOfData(8);
		lista1.print();
		lista1.deleteFirstOccurenceOfData(4);
		lista1.print();
	}
}

