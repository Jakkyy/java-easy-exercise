public class Pila{
  private Nodo pTesta;  //top della pila
  private int elem[];
  private int top;
  
  public Pila(){
    pTesta = null;
  }
  public int push(int elemento){
    pTesta = new Nodo(elemento, pTesta);
    return elemento;
  }
  public int pop(){
    if(isEmpty())
      return 0;
    int top = pTesta.getInfo();
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
  
  public int TopElem()
  { 
	  if (isEmpty())
		  return 0;
	  return elem[top-1];
  }
}