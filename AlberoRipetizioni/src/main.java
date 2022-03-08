public class main {

	 public static void main(String[] args) 
	 {
		    AlberiBinari a = new AlberiBinari();
		 
		 
		 
		 	NodoBin A = new NodoBin();
		    NodoBin B = new NodoBin();
		    NodoBin C = new NodoBin();
		    NodoBin D = new NodoBin();
		    NodoBin E = new NodoBin();
		    NodoBin F = new NodoBin();
		    NodoBin G = new NodoBin();
		    A.info = "A"; A.sinistro = null; A.destro = null;
		    B.info = "B"; B.sinistro = null; B.destro = null;
		    C.info = "C"; C.sinistro = null; C.destro = null;
		    D.info = "D"; D.sinistro = null; D.destro = null;
		    E.info = "E"; E.sinistro = A;    E.destro = B; 
		    F.info = "F"; F.sinistro = C;    F.destro = D; 
		    G.info = "G"; G.sinistro = E;    G.destro = F;
		    NodoBin albero = G; //radice dell albero
		    System.out.println(AlberiBinari.albBin2string(albero));
		    //System.out.println(AlberiBinari.albBin2string(a.copia(albero)));
		    //System.out.println(AlberiBinari.albBin2string(a.string2albBin(a.albBin2string(albero))));
		    System.out.print("\nVisita preordine: ");
		    AlberiBinari.visitaPreordine(albero);
		    System.out.print("\nVisita postordine: ");
		    AlberiBinari.visitaPostordine(albero);
		    System.out.print("\nVisita simmetrica: ");
		    AlberiBinari.visitaSimmetrica(albero);
		    System.out.println("\nProfondita': " + a.calcolaProfondita(albero));
		    System.out.println("Presenza di \"A\": " + a.presente(albero, "A"));
		    
		    //System.out.println(albero.info);
		    
		    System.out.println("Presenza di \"PIPPO\": " + a.presente(albero, "PIPPO"));
		    System.out.println("Numero nodi: " + a.contaNodi(albero));
		    System.out.println("Numero foglie: " + a.contaFoglie(albero));
		    
		    
		    System.out.print("Lista foglie: ");
		    NodoLista p = AlberiBinari.listaFoglie(albero);
		    while (p!=null) {
		      System.out.print(p.info + " ");
		      p = p.next;
		    }
		    /*
		    System.out.print("\nArray foglie: ");
		    String[] array = a.arrayFoglie(albero);
		    for (int i = 0; i < array.length; i++)
		      System.out.print(array[i] + " ");
		     */
		    System.out.println("\nfine");
		   
		  }
}