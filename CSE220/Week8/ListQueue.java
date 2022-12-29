public class ListQueue implements Queue
{
    int size;
    Node top;
    Node tail;
    
    public ListQueue()
    {
        tail= new Node(null,top,top);
        size = 0;
        top = new Node(null,tail,tail);
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        boolean flag = false;
        if(this.size==0)
        {
            flag=true;
        }
        return flag;
        
        /*or
         if(size==0) {
            return true;
         }
         return false;
         */
        
        
        
    }
    
    public void enqueue(Object e) throws QueueOverflowException
    {
        if(size==0) {
            tail.val= e;
        }else {
            Node temp = new Node(e,top,tail);
            tail.next = temp;
            top.prev = temp;
            tail = temp;
        }
        
        size++;
    }
    
    public Object dequeue() throws QueueUnderflowException
     {
         if(top==null)
         {
             throw new QueueUnderflowException();
         }
        
         Node p = top;
         top = top.next;
         top.prev=null;
         size--;
         return p;
         
     }
    public String toString()
    {
        String s =" ";
        for(Node n=top.next; n!=top; n=n.next)
        {
             s=s+" "+n.val;
        
        }
        return s;
    }
    public void clear()
    {
        top=null;
        top.next=null;
        top.prev=null;
        size=0;
    }
}