public class Pila
{ 
	private int top;
	private final int MAXX;
	private int elem[];
	private static final int MAXDEFAULT = 10;

	public Pila()
	{ 
		this(MAXDEFAULT);
	}


	public Pila(int max)
	{ 
		top = 0;
		MAXX = max;
		elem = new int[MAXX];
	}

	public boolean isFull()
	{ 
		return (top == MAXX);
	}
	
	public boolean isEmpty()
	{ 
		return (top == 0);
	}
	
	public void clear()
	{ 
		top = 0;
	}
	
	public boolean push(int val)
	{ 
		if (isFull())
			return false;
		elem[top++] = val;
		return true;
	}
	
	public int pop()
	{ 
		if (isEmpty())
			return 0;
		return elem[--top];
	}
	
	public int topElem()
	{ 	
		if (isEmpty())
			return 0;
		return elem[top-1];
	}
}

