public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
    Node n = new Node (a[0], null);
    head = n;
    for(int i=1; i<a.length; i++){
    Node array_node  = new Node ( a[i],  null );
    n.next = array_node;
    n = n.next;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO 
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int count = 0;
    for(Node n = head; n!= null;  n= n.next){
    count++;
    }
    return count; 
// please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO    
    Node n = head;
    while (n!= null){
    System.out.print(n.element + " ");
    n = n.next;
    }
    System.out.println();
  }
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    int x = 0;
    for(Node n= head; n!=null; n=n.next){
      if(x==idx){
      return n;
      }
    else{
       x++;
      }
    }
    return null; // please remove this line!
  }

  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    int i=0;
    for (Node n=head; n!=null; n=n.next)
    {
      if(i==idx){
      return n.element;
      }
      else{
      i++;
      }
    }
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
        int i=0;
    for (Node n=head; n!=null; n=n.next)
    {
      if(i==idx){
        Object temp = n.element;
        n.element = elem;
      return temp;
      }
      else{
      i++;
      }
    }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
        int i=0;
    for (Node n=head; n!=null; n=n.next)
    {
      if(n.element==elem){
      return i;
      }
      else{
      i++;
      }
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
            int i=0;
    for (Node n=head; n!=null; n=n.next)
    {
      if(n.element==elem){
      return true;
      }
      else{
      i++;
      }
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node copyfield = new Node(head.element, null);
    Node tail = copyfield;
    for(Node n=head.next; n!=null; n=n.next){
   Node p = new Node(n.element, null);
     tail.next = p;
     tail=tail.next;
    }
    return copyfield; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    Node x = head;
    Node tail = new Node(head.element , null);
    for(x = head.next; x!= null; x = x.next){
    tail = new Node(x.element, tail);
    }
    return tail; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    if(idx>=0 && idx<=countNode()){
      Node n = new Node(elem, null);
      if(idx==0){
        n.next = head;
        head = n;
      }
      else if(idx==countNode()){
        Node h = head;
        while(h.next!=null){
          h = h.next;
        }
        h.next=n;
      }
      else{
        Node h = head;
        for(int i=0; i<idx-1; i++){
          h = h.next;
        }
        Node t = h.next;
        n.next=t;
        h.next = n;
      }
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
 public Object remove(int index){
    Object bad = null;
    Node h = head;
    if(index==0)
    {
      bad = head.element;
      head = h.next;
    }else{
      Node p=null;
      for(int i=0;i<index;i++)
      {
        p=h;
        h=h.next;
      }
      bad= h.element;
      p.next=h.next;
    }   
    return bad;
  }
  
  // Rotates the list to the left by 1 position.

public void rotateLeft(){
   Node oldHead=head;
      head=head.next;
      Node tail=head;
      while(tail.next!=null){
          tail=tail.next;
      }
      tail.next=oldHead;
      oldHead.next=null;
  }
  
  // Rotates the list to the right by 1 position.

public void rotateRight(){
   Node newTail=head;
      Node pre=null;
      while(newTail.next!=null){
          pre=newTail;
          newTail=newTail.next;
      }
      newTail.next=head;
      head=newTail;
      pre.next=null;  
  }
}