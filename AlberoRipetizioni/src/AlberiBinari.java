import java.util.StringTokenizer;

public class AlberiBinari 
{
	//Visite dell'albero

	  //Visita in Preordine
	  public static void visitaPreordine(NodoBin a) {
	    if (a == null) //albero vuoto
	      return;
	    else {
	      System.out.print(a.info + " ");  //opera su nodo corrente
	      visitaPreordine(a.sinistro);     //visita sottoalb. sin.
	      visitaPreordine(a.destro);       //visita sottoalb. des.
	    }
	  }


	  //Visita in Postordine
	  public static void visitaPostordine(NodoBin a) {
	    if (a == null) //albero vuoto
	      return;
	    else {
	      visitaPostordine(a.sinistro);    //visita sottoalb. sin.
	      visitaPostordine(a.destro);      //visita sottoalb. des.
	      System.out.print(a.info + " ");  //opera su nodo corrente
	    }
	  }


	  //Visita in Simmetrica
	  public static void visitaSimmetrica(NodoBin a) {
	    if (a == null) //albero vuoto
	      return;
	    else {
	      visitaSimmetrica(a.sinistro);    //visita sottoalb. sin.
	      System.out.print(a.info + " ");  //opera su nodo corrente
	      visitaSimmetrica(a.destro);      //visita sottoalb. des.
	    }
	  }

	      
	  //Esempi di uso delle visite per realizzare funzionalita'
	  // calcolo della profondita' di un albero (con prof. foglia == 0)
	  public static int calcolaProfondita(NodoBin a) {
	    if (a == null) //albero vuoto
	      return -1;
	    else {
	      int profsx = calcolaProfondita(a.sinistro); //visita sottoalb. sin.
	      int profdx = calcolaProfondita(a.destro);   //visita sottoalb. des.
	      if (profsx > profdx) return profsx + 1;     //opera su nodo corrente
	      else return profdx + 1; 
	    }
	  }

	  // verifica della presenza di un dato elemento nell'albero
	  public static boolean presente(NodoBin a, String x) {
	    if (a == null) // albero vuoto
	      return false;
	    else if (a.info.equals(x)) return true; //opera su nodo corrente
	    else return presente(a.sinistro,x) ||   //visita sottoalb. sin.
	                presente(a.destro,x);       //visita sottoalb. des.
	  }

	  // conta i nodi dell'albero
	  public static int contaNodi(NodoBin a) {
	    if (a == null) //albero vuoto
	      return 0;
	    else {
	      int nodisx = contaNodi(a.sinistro); //visita sottoalb. sin.
	      int nodidx = contaNodi(a.destro);   //visita sottoalb. des.
	      return 1 + nodisx + nodidx;         //opera su nodo corrente
	    }
	  }
	    

	  // conta le foglie dell'albero
	  public static int contaFoglie(NodoBin a) {
	    if (a == null) //albero vuoto
	      return 0;
	    else if (a.sinistro == null && a.destro == null) // foglia
	      return 1;
	    else {
	      int fogliesx = contaFoglie(a.sinistro); //visita sottoalb. sin.
	      int fogliedx = contaFoglie(a.destro);   //visita sottoalb. des.
	      return fogliesx + fogliedx;             //opera su nodo corrente
	    }
	  }

	  // restituire una lista contenente le foglie dell'albero
	  public static NodoLista listaFoglie(NodoBin a) {
	    if (a == null)
	      return null;
	    else if(a.sinistro == null && a.destro == null) { //foglia
	      NodoLista ris = new NodoLista();
	      ris.info = a.info;
	      ris.next = null;
	      return ris;
	    }
	    else {
	      NodoLista listasx = listaFoglie(a.sinistro); //visita sottoalb. sin.
	      NodoLista listadx = listaFoglie(a.destro);   //visita sottoalb. des.
	      return append(listasx, listadx);             //opera su nodo corrente
	    }
	  }

	  // restituire un array contenente le foglie dell'albero
	  public static String[] arrayFoglie(NodoBin a) {
	    Env e = new Env();
	    e.array = new String[contaFoglie(a)];
	    e.i = 0;
	    aggiornaEnv(a,e);
	    return e.array;
	  }
	  
	  private static void aggiornaEnv(NodoBin a, Env e) {
	    if (a == null)
	      return;
	    else if(a.sinistro == null && a.destro == null) { //foglia
	      e.array[e.i] = a.info;
	      (e.i)++;
	    }
	    else {
	      aggiornaEnv(a.sinistro,e); //visita sottoalb. sin.
	      aggiornaEnv(a.destro,e);   //visita sottoalb. des.
	                                 //sul nodo corrente non si deve fare altro
	    }
	  }


	  public static NodoBin copia(NodoBin a) {
	    if (a == null) return null;
	    else {
	      NodoBin b = new NodoBin();
	      b.info = a.info;
	      b.sinistro = copia(a.sinistro);
	      b.destro = copia(a.destro);
	      return b;
	    }
	  }


	  public static String albBin2string(NodoBin a) {
	    if (a == null) 
	      return "( )";
	    else 
	      return "( " + 
	                a.info + 
	                " " + 
	                albBin2string(a.sinistro) +
	                " " +
	                albBin2string(a.destro) +
	             " )";
	  }

	  public static NodoBin string2albBin(String s) {
	    // s deve contenere un albero in notazione parentetica con spazi
	    // che separano i vari simboli
	    StringTokenizer tks = new StringTokenizer(s);
	    return string2albBin(tks);
	  }

	  public static NodoBin string2albBin(StringTokenizer tks) {
	    String t = tks.nextToken();  // t = "("
	    t = tks.nextToken();
	    if (t.equals(")")) 
	      return null;
	    else {
	      NodoBin a = new NodoBin();
	      a.info = t;
	      a.sinistro = string2albBin(tks);
	      a.destro = string2albBin(tks); 
	      t = tks.nextToken(); // t =  ")"
	      return a;
	    }
	  }

	  // metodi ausiliari non su alberi
	  // append gia' realizzato precedentemente
	  private static NodoLista append(NodoLista p1, NodoLista p2) {
	    if (p1 == null)
	      return p2;
	    else {
	      NodoLista ris = append(p1.next,p2);
	      p1.next = ris;
	      return p1;
	    }
	  }
	    
	    /*
	    public boolean ABRcercaRic(NodoBin nodo, int val) {
	    	
	    	if(nodo == null)
	    		return false;
	    	else
	    		if(val == nodo.dato)
	    			return true;
	    		else
	    			if(val < nodo.dato)
	    				if(nodo.sinistro != null)
	    					return ABRcercaRic(nodo.sinistro,val);
	    				else
	    					return false;
	    			else
	    				if(nodo.destro != null)
	    					return ABRcercaRic(nodo.destro,val);
	    				else
	    					return false;
	    	
	  }
	  */
}