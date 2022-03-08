public class NodoINT {
    public int info;
    public NodoINT next;
  
    public NodoINT(){
      this.info = 0;
      this.next = null;
    }
    public NodoINT(int info){
      this.info = info;
      this.next = null;
    }
    public NodoINT(int info, NodoINT next){
      this.info = info;
      this.next = next;
    }
    public int  getInfo(){
     return info;
    }
    public NodoINT getNext (){
      return next;
    }
    public String toString(){  // va nella lista
      if (next != null)
        return "[" + info + "]->" + next;
      else
        return "[" + info + "]->NULL";
    }
}
