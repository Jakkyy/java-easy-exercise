public class codaArray {
    private int head, tail;
    private final int MAX;
    private int elem[];
    private static final int MAXDEFAULT = 10;

    public codaArray(){
        this(MAXDEFAULT);
    }

    public codaArray(int max) { 
        head = tail = 0;
        MAX = max;
        elem = new int[MAX];
    }


    public boolean IsFull() { 
        return (head == (tail+1) % MAX);
    }

    public boolean IsEmpty() { 
        return ( head == tail );
    }

    public void ClearQueue() { 
        head = tail = 0;
    }


    public int FirstElem() { 
        if(IsEmpty())
            return 0;
        return elem[head];
    }


    public boolean EnQueue(int val){ 
        if(IsFull())
            return false;
        elem[tail] = val;
        tail = ++tail % MAX;
        return true;
    }

    public int DeQueue(){ 
        if(IsEmpty())
            return 0;
        int val = elem[head];
        head = ++head % MAX;
        return val;
    }
}
