public class Prova{
  public static void main(String[] args){


    Pila a = new Pila();
    
    System.out.println("P:" +a);
    
    System.out.println("\n inserisco tre elementi:");
    
    a.push(11);   
    a.push(22);
    a.push(33);
    
    System.out.println("P:" +a);
    
    System.out.println("\n rimozione degli elementi:");
    
    a.pop();
    
    System.out.println("P:" +a);
    
    a.pop();
    a.pop();

    System.out.println("P:" +a);

    if (a.isEmpty())
      System.out.println(" La pila e' vuota");
  }
}