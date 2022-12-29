public class ListQueue implements Queue{
  int size=0;
  Node front = null;
  Node rear = null;  
  
 // checks size of the array
  public int size(){//size check
    return size;
  }
  
// Checks the array is empty or not
  public boolean isEmpty(){//khali hole true
    if(size == 0){
      return true;
    }
    else{//khali na hole false
      return false;
    }
  }
  
// Adding new item on the back of the queue
// Throwing QueueOverflowException if the queue is at maximum capacity
  public void enqueue(Object o) throws QueueOverflowException{
    Node t = new Node (o , null);//new node create kori
    if(size == 0){//enqueue at the begin
      front = t;//front r rear t te rakhi
      rear = t;
    }
    else{//middle e enqueu
      rear.next = t;//rear er porer ta te t rakhi
      rear = rear.next;//rear er add change kori
    }
    size++;//size barai
    
  }
  
// Removes the item from the queue
// Throwing QueueUnderflowException if the queue is empty
  public Object dequeue() throws QueueUnderflowException{
    if (size == 0){//khali list dequeue korle exception
      throw new QueueUnderflowException();
    }
    else{
      Object temp = front.val;//temp variable e front er value save rakhi
      front = front.next;//fron er add change kori
      size--;//size komay dei
      return temp;// jei value dequeu hoise oita return kori
    }
  }
  
// Peeks at the item in the front of the queue
// Throwing QueueUnderflowException if the queue is empty.
  public Object peek() throws QueueUnderflowException{
    if(size==0){ //khali list peek korle exception
      throw new QueueUnderflowException();
    }
    else{
      return front.val; //only from value return hobe
    }
  }
  
  
// Returns array items in the queue
// like this [ x y z ]
  public String toString(){
    if(size == 0){//jodi khali list hoy
      return "Empty Queue";
    }
    String output = "[ ";
    for(Node n = front ; n!=null ; n = n.next){//loop chaliye prottek val save kori output e
      output = output+n.val+" ";
    }
    output = output+"]"; //last output return kori
    return output;
  }
  
// Returns an array with items in the queue
  public Object[] toArray(){
    Object a[] = new Object[size]; //new array creating so save the values
    Node temp = front; //temp e front save rakhi
    for(int i = 0 ; i<size ; i++){ //loop chaliye array te value save kori
      a[i] = temp.val;
      temp = temp.next;//node next e nei
    }
    return a;
  }
  
// Searches specific item in the queue
  public int search(Object o){
    int count = 0;
    for(Node n = front ; n!=null ; n = n.next){ //loop chaliye khuji
      if(n.val == o){//
        return count;
      }
      count++;
    }
    
    return -1;
    
  }
}
