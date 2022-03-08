class Nodo{
  public String info;
  public Nodo next;

  public Nodo(){
    this.info = "";
    this.next = null;
  }
  public Nodo(String info){
    this.info = info;
    this.next = null;
  }
  public Nodo(String info, Nodo next){
    this.info = info;
    this.next = next;
  }
  public String  getInfo(){
   return info;
  }
  public Nodo getNext (){
    return next;
  }
  public String toString(){  // va nella lista
    String q = "[";
    if (next != null)
      return q + info + "]->" + next;
    else
      return q + info + "]->NULL";
  }
}