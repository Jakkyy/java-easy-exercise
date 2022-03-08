public class PilaSTRING {
    private NodoSTRING pTesta;  //top della pila
    private String elem[];
    private int top;
    
    public PilaSTRING(){
      pTesta = null;
    }
    public void push(String elemento){
      pTesta = new NodoSTRING(elemento, pTesta);
    }
    public String pop(){
      if(isEmpty())
        return("NULL");
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
    
    public String TopElem()
    { 
        if (isEmpty())
            return "x";
        return elem[top-1];
    }
}
