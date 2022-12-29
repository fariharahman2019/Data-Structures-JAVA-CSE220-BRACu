public class ArrayQueue implements Queue{
  int size=0;
  int front=-1;
  int rear=-1;
  Object [] details=new Object[5];
  
  // checks size of the array
  public int size(){//size check
    return size;
  }
  
  // Checks the array is empty or not
  public boolean isEmpty(){
    if (size==0){
      return true;
    }
    else{
      return false;
    }
  }
  
// Adding new item on the back of the queue
// Throwing QueueOverflowException if the queue is at maximum capacity
  public void enqueue(Object e) throws QueueOverflowException{
    if (details.length == size){ //array length r size shomane hole over flow exception handle korchhi
      throw new QueueOverflowException();
    }
    else if(size==0){
      details[size] = e; //first index e insert korchhi
      size++; //size barai
      front++; //front r rear keo barai
      rear++;
    }
    else{ // middle or last insert
     rear = (rear+1)%details.length; //rear barai and oi index e enqueue korchhi r size bariye dei
      details[rear] = e;
      size++;
    }
    
  }
  
// Removes the item from the queue
// Throwing QueueUnderflowException if the queue is empty
  public Object dequeue() throws QueueUnderflowException{
    if(size==0){ // size 0 hole khali queue tai exception handle korchhi
      throw new QueueUnderflowException();
    }
    else{
      Object temp = details[front]; // temporary variable e array er front index er value save korchhi
      details[front] = null; // front index er value null korchhi
      front = (front+1)%details.length; //front er value change korchhi
      size--; // size komacchi
      return temp; // temp e jei value send korechhi oita return korchhi
    }
  }
  
// Peeks at the item in the front of the queue
// Throwing QueueUnderflowException if the queue is empty.
  public Object peek() throws QueueUnderflowException{
    if(size == 0){
      throw new QueueUnderflowException();
    }
    else{ //front er element dekhbe
      return details[front];
    }
  }
  
// Returns array items in the queue
// like this [ x y z ]
  public String toString(){
    if(size==0){ // khali queue hole 
      return "Empty Queue";
    }
    String output ="[ ";
    int j = front; // 
    for(int i = 0 ; i<size; i++){ //loop chaliye shb values save korchhi
      output = output+details[j]+" ";
      j = (j+1)%details.length; //j er value barai
    }
    output = output+"]"; //array print
    return output;
  }
  
// Returns an array with items in the queue
  public Object[] toArray(){
    Object[] array = new Object[size]; //new array creating so save the values
    int j = front; //doing the same kaj 
    for(int i = 0 ; i<size ; i++){
      array[i] = details[j];
      j = (j+1)%details.length;
    }
    return array;
  }
  
// Searches specific item in the queue
  public int search(Object o){
    int count = 0;
    for(int i = 0 ; i<details.length ; i++){ //loop chaliye khujbo
      if(details[i] == o){
        return count;
      }
      count++;
    }
      return -1;
    }
}
