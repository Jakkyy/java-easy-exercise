public class NodoSTRING {
    public String info;
    public NodoSTRING next;
  
    public NodoSTRING(){
      this.info = "";
      this.next = null;
    }
    public NodoSTRING(String info){
      this.info = info;
      this.next = null;
    }
    public NodoSTRING(String info, NodoSTRING next){
      this.info = info;
      this.next = next;
    }
    public String  getInfo(){
     return info;
    }
    public NodoSTRING getNext (){
      return next;
    }
    public String toString(){  // va nella lista
      if (next != null)
        return "[" + info + "]->" + next;
      else
        return "[" + info + "]->NULL";
    }
}
