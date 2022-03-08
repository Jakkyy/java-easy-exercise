public class Pila{
  private Nodo pTesta;  //top della pila
  private String elem[];
  private int top;
  
  public Pila(){
    pTesta = null;
  }
  public void push(String elemento){
    pTesta = new Nodo(elemento, pTesta);
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
		  return "";
	  return elem[top-1];
  }
}
