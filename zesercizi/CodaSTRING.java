public class CodaSTRING {
  
    private NodoSTRING pTesta;
    private NodoSTRING pCoda;
    
    public CodaSTRING(){
      pTesta = null;
      pCoda = null;
    }
     public void enqueue(String dato){
      if (isEmpty()){
        pTesta = new NodoSTRING(dato, pTesta);
        pCoda = pTesta;
      }
      else{
        pCoda.next = new NodoSTRING(dato, null);
        pCoda = pCoda.next;
      }
    }
    public String dequeue(){
      if(isEmpty())
          return ("-1");
      String top = pTesta.getInfo();
      pTesta = pTesta.getNext();
      return top;
    }
    public String toString(){
      if (pTesta == null)
        return "[]->NULL";
      else
        return "[]->" + pTesta + "";
    }
    public boolean isEmpty(){
      return pTesta == null;
    }
    public void makeEmpty1(){
      pTesta = null;
      pCoda = null;
    }
}
