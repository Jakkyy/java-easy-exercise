public class Pila{ 

    private int top;
    private final int MAXX;
    private int elem[];
    private static final int MAXDEFAULT = 10;

    public Pila(){
        this(MAXDEFAULT);
    }

    public Pila(int max){ 
        top = 0;
        MAXX = max;
        elem = new int[MAXX];
    }

    public boolean IsFull(){ 
        return (top == MAXX);
    }

    public boolean IsEmpty() { 
        return (top == 0);
    }

    public void Clear() { 
        top = 0;
    } 

    public boolean Push(int val){ 
        if (IsFull())
            return false;
        elem[top++] = val;
        return true;
    }

    public int Pop() { 
        if (IsEmpty())
            return 0;
        return elem[--top];
    }


    public int TopElem(){ 
        if (IsEmpty())
            return 0;
        return elem[top-1];
    }
}