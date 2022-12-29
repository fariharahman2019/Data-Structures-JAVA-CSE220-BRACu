public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack()
    {
        size=0;
        data = new Object[5];
    }
    
    public int size()
    {
        return this.size;
    }
    
    public boolean isEmpty()
    {
        boolean flag = false;
        if(this.size==0)
        {
            flag=true;
        }
        return flag;
    }
    
    public void push(Object e) throws StackOverflowException
    {
        if(this.size==data.length)
        {
            throw new StackOverflowException();
        }
        data[size]= e;
        size++;
    }
    
    public Object pop() throws StackUnderflowException
    {
        if(this.size<=0)
        {
            throw new StackUnderflowException();
        }
        Object p = this.size-1;
        data[size-1]=null;
        size--;
        return p;
 }
    
    public Object peek() throws StackUnderflowException
    {
        if(this.size<0)
        {
            throw new StackUnderflowException();
        }
        Object p = this.size-1;
        return p;
    }
    
    public String toString()
    {
        String s = "";
        for(int i=size-1; i>=0; i--)
        {
             s=s+" "+data[i];
        }
        return s;
    }
    
    public Object[] toArray()
    {
        Object[] a = new Object[this.size];
        for(int i=this.size-1, j=0; i>=0; i--, j++)
        {
            a[j]=data[i];
        }
        return a;
    }
    
    public int search(Object e)
    {
        int p=-1;
        for(int i=size-1; i>=0; i--)
        {
            if(data[i]==e)
            {
                p= size-i;
                break;
            }
        }
        return p;
    }
}