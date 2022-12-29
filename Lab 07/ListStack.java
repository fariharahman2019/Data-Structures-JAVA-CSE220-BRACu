public class ListStack implements Stack{
  int size;
  Node top;
  
  
  public ListStack(){
    size = 0;
    top = null;
  }
  
  
  
  public int size(){
    return this.size;
  }
  
  public boolean isEmpty(){
    if(top==null){
      return true;
    }
    else{
      return false;
    }
  }
  
  public void push(Object e) throws StackOverflowException{
    Node newTop=new Node(e,null);
    newTop.next=this.top;
    this.top = newTop;
    size++;
  }
  
  public Object pop() throws StackUnderflowException{
    //if stack empty thn exceptions
    //objct create value save kore value return korte hobe
    if(isEmpty())
    {
      throw new StackUnderflowException();
    }
    else{
      Node n = this.top;
      this.top=this.top.next;
      size--;
      return n;
    }
  }
  
  public Object peek() throws StackUnderflowException{
    if(isEmpty())
    {
      throw new StackUnderflowException();
    }
    else{
      Node p = this.top;
      return p.val;
    }
  }
  
  public String toString(){
    String s=" ";
    for(Node n=this.top; n!=null; n=n.next)
    {
      s=s+n.val+" ";
    }
    return "["+s+"]";
  }
  
  public Object[] toArray(){
    Object [] yoto=new Object[size];
    int count=0;
    for(Node n=top;n!=null;n=n.next){
      yoto[count]=n.val;
      count++;
    }
    return yoto;
  }
  
  public int search(Object e){
    int i=0;
    for(Node n=top;n!=null;n=n.next){
      if(n.val.equals(e)){
        return i;
      }
      i++;
    }
    return -1;
  }
}