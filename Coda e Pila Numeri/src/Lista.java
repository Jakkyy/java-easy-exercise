public class Lista 
{

	// testa della lista
	public Nodo head = null;

	/*
	 * Metodo che aggiunge un nodo in testa
	 */
	public int add(int data)
	{
	
		Nodo newNode = new Nodo(data);

		// Se la lista è vuota...
		if (this.head == null) {
			// fi diventare il nuovo nodo la testa
			this.head = newNode;
		} else {
			newNode.next = this.head;

			this.head = newNode;
		}
		return data;
	}

	/*
	 * Metodo che aggiunge un nodo alla lista in fondo
	 */
	public void addNodeAtTheEnd(int data) {
		// Creo il nuovo nodo
		Nodo newNode = new Nodo(data);

		// Guardo se la lista è vuota
		if (this.head == null) {
			// Fai diventare il nuovo nodo la testa
			this.head = newNode;
		} else {
			Nodo cur = this.head;
			// vado fino alla fine
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}

	/*
	 * Metodo che aggiunge un nodo in una posizione della lista
	 */
	public void add(int position, int data) {
		// Creo nodo
		Nodo newNode = new Nodo(data);

		Nodo cur = this.head, prev = this.head;

		if (position == 1) {
			// Metto all'inizio
			newNode.next = head;
			// Il nuovo nodo è la testa
			this.head = newNode;
			return;
		}

		// vado fino alla fine
		while (cur.next != null && --position > 0) {
			// update the prev and cur references
			prev = cur;
			cur = cur.next;
		}

		// prev lo faccio puntare al nuovo nodo
		prev.next = newNode;

		// & new node punta al corrente
		newNode.next = cur;
	}



	/*
	 * Metodo che cancella il primo dato della lista corrispondente
	 */
	public void deleteFirstOccurenceOfData(int data) {
		//guardo se la lista è vuota
		if (this.head == null) {
			System.out.println("The List is empty.\n");
			return;
		}

		Nodo cur = this.head, prev = this.head;

		// trovo il dato nella prima posizione
		if (this.head.info == data) {
			this.head = this.head.next;
			return;
		}

		// visito la lista fino a quando non trovo il valore
		while (cur != null && cur.info != data) {

			// update the prev and cur references
			prev = cur;
			cur = cur.next;
		}

		// se il nodo è trovato...
		if (cur != null) {
			prev.next = cur.next;
		} else {
			System.out.println("The data " + data + " could not be found in the List");
		}
	}

	/*
	 * Metodo che stampa
	 */
	public void print() {
		if (this.head == null) {
			System.out.println("The List is empty.");
		} else {
			Nodo cur = this.head;
			while (cur != null) {
				System.out.print(cur.info + " -> ");
				cur = cur.next;
			}
			System.out.println("NULL\n");
		}
	}
		
	// rimuove i duplicati
	public void removeDuplicate() {  
	        //Node current will point to head  
	        Nodo current = head, succ = null, prec = null;  
	  
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            while(current != null){  
	                //Node prec  punta al precedente nella lista 
	                prec = current;  
	                //succ  punta al successivo
	                succ = current.next;  
	  
	                while(succ != null) {  
	                    //scorro i nodi successivi a currente per trovare duolicati 
	                    if(current.info == succ.info) {  
	                        //se in succ.data c'è un duplicato allora lo elimino con la successiva istruzione:  
	                        prec.next = succ.next;  
	                    }  
	                    else {  
	                        //prec diventa il successivo  
	                        prec = succ;  
	                    }  
	                    // avanzo nel puntatore ai successici della lista
	                    succ = succ.next;  
	                }  
	                // ora passo all'elemento successivo da confrontare
	                current = current.next;  
	            }  
	        }  
	    }  
	

}