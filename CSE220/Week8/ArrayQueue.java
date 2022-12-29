public class ArrayQueue implements Queue
{
    int rear;
    int front;
    int size;
    Object [] data;
    
    public ArrayQueue()
    {
        front=0;
        rear=-1;
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
    
     public void enqueue(Object e) throws QueueOverflowException
     {
         rear=(rear+1)%data.length;
         if(size>=data.length)
         {
             throw new QueueOverflowException();
         }
         data[rear%data.length]= e;
         size++;
         
     }
     
     public Object dequeue() throws QueueUnderflowException
     {
         
         if(size<=0)
         {
             throw new QueueUnderflowException();
         }
         Object p = data[front%data.length];
         data[front%data.length]=null;
         front=(front+1)%data.length;
         size--;
         return p;
     }
     
     public String toString()
     {
         String s = "";
        for(int i=front; i<=rear; i++)
        {
             s=s+" "+data[i];
        }
        return s;
     }
     public void clear()
     {
         for(int i=0; i<data.length; i++)
         {
             data[i]=null;
         }
         size=0;
         front=0;
         rear=-1;
     }
}