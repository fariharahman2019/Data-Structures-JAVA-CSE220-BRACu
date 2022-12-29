package Obaed;

public class ArrayStack implements Stack{
    int size;
    char [] data;
    
    public ArrayStack()
    {
        size=0;
        data = new char[100];
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
    
    public void push(char e) throws StackOverflowException
    {
        if(this.size==data.length)
        {
            throw new StackOverflowException();
        }
        data[size]= e;
        size++;
    }
    
    public char pop() throws StackUnderflowException
    {
        if(this.size<=0)
        {
            throw new StackUnderflowException();
        }
        char p = data[this.size-1];
        data[size-1]=' ';
        size--;
        return p;
 }
    
    public char peek() throws StackUnderflowException
    {
        if(this.size<=0)
        {
            throw new StackUnderflowException();
        }
        char p = data[this.size-1];
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
    
    public char[] toArray()
    {
        char[] a = new char[this.size];
        for(int i=this.size-1, j=0; i>=0; i--, j++)
        {
            a[j]=data[i];
        }
        return a;
    }
    
    public int search(char e)
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