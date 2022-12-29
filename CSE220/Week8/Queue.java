public interface Queue
{
    public int size();
        
    public boolean isEmpty();
    
    public void enqueue(Object e) throws QueueOverflowException;
    
    public Object dequeue() throws QueueUnderflowException;
    
    public String toString(); 
    
    public void clear();
}