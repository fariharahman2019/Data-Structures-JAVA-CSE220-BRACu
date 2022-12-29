public class ListStack implements Stack{
    int size;
    Node top;
    
    
    public ListStack(){
        size = 0;
        top = null;
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
        Node newTop = new Node(e, top);
        this.top = newTop;
        size++;
    }
    public Object pop() throws StackUnderflowException
    {
        if(this.size<=0)
        {
            throw new StackUnderflowException();
        }
        Node p = this.top;
        this.top=this.top.next;
        size--;
        return p;
    }
    public Object peek() throws StackUnderflowException
    {
        if(this.size<=0)
        {
            throw new StackUnderflowException();
        }
        Node p = this.top;
        return p;
    }
    public String toString()
    {
        String s = "";
        for(Node n=top; n!=null; n=n.next)
        {
             s=s+" "+n.val;
        }
        return s;
    }
    public Object[] toArray()
    {
        Object[] a = new Object[this.size];
        int i=0;
        for(Node n=top; n!=null; n=n.next)
        {
            a[i]=n.val;
        }
        return a;
    }
    public int search(Object e)
    {
        int i=0;
        int p=-1;
        for(Node n=top; n!=null; n=n.next)
        {
            i++;
            if(n.val==e)
            {
                p= size-i;
                break;
            }
        }
        return p;
    }
}