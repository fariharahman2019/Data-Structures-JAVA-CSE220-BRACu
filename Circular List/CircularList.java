public class CircularList{
  Node head;
  int size;
  /* Build a Circular List from the given circular array
   */
  public void buildFromArray(int[]cir,int st,int size){
    // TO DO
  }
  
  /* Build a Circular List from the given Non Circular List 
   */
  public void buildFromList(Node h){
    // TO DO
  }
  
  /* Build a Circular List from the given Non Circular List
   * The elements of the new list must in reverse order
   */
  public void printList(){
    //TO DO
  }
  
  /*Prints the given list*/
  public void buildReverse(){
    Node current=head.next;
    Node prev=head;
    Node tail=head.next.next;
    while(current!=head){
      prev=current;
      current=tail;
      tail=current.next;
      current.next=prev;
    }
    tail.next=head;
    head=tail;
  }
  
  /* Insert the element in the given index.
   * Index 0 is the index after the dummy head
   */ 
  public void addElement(int element, int index){
    Node n=new Node(element,null);
    if(index==0){ //for first index
      n.next=head;
      Node h=head;
      while(h.next!=head){
        h=h.next;
      }
      h.next=n;
      head=n;
    }
    else{
      Node h=head;
      for(int i=0;i<index-1;i++){
        h=h.next;
      }
      n.next=h.next;
      h.next=n;
    }
  }
  
  /* Delete the element from the given index.
   * Index 0 is the index after the dummy head
   */ 
  public void deleteElement(int index){
    if(index==0){ //for first index
      Node x=head.next;
      Node h=head;
      while(h.next!=head){
        h=h.next;
      }
      h.next=x;
      head=head.next;
    }
    else if(index==size-1){ //for last index 
      Node h=head;
      for(int i=0;i<index-1;i++){
        h=h.next;
      }
      h.next=head;
    }
    else{ // for middle index
      Node h=head;
      for(int i=0;i<index-1;i++){
        h=h.next;
      }
      h.next=h.next.next;
    }
  }
}