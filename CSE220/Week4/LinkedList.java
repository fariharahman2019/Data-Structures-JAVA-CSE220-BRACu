public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
      Node tail = new Node(a[0], null);
      head = tail;
    for(int i=1; i<a.length; i++)
    {
       Node n1= new Node(a[i], null);
       tail.next = n1;
       tail = n1;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
   
   int count=1;
   Node n = head;
   while(n.next!=null)
   {
       n = n.next;
       count++;
       
   }
    return count;
  }
  
  /* prints the elements in the list */
  public void printList(){
    for(Node n=head; n!=null; n=n.next)
    {
        System.out.print(n.element+" ");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int count=0;
    Node currN=head;
    while(count<idx)
    {
        currN=currN.next;
        count++;
    }
    return currN; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node n=head;
    for(int i=0; i<idx; i++)
    {
        n=n.next;
    }
    return n.element; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    Node n= head;
    Object old;
    if(idx<0 || idx>countNode())
    {
        return null;
    }
    else
    {
        for(int i=0; i<idx; i++)
        {
            n=n.next;
        }
        old=n.element;
        n.element=elem;
        return old;
    }
     // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
      boolean flag=false;
      for(Node n = head; n!=null; n=n.next)
      {
          if(n.element==elem)
          {
              flag=true;
          }
      }
      if(flag==true)
      {
          int count=0;
          Node currN=head;
          while(currN.element!=elem)
          {
              count++;
              currN = currN.next;
          }
          return count;
      }
      else
      {
          return -1;
      }
      // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
      
      if(indexOf(elem)!=-1)
      {Node currN=head;
          boolean flag =false;
          while(currN.next!=null)
          {
              if(currN.element.equals(elem))
              {
                  currN=currN.next;
              }
              else
              {
                  flag=true;
                  break;
              }
          }
          return flag;
      }
      else
      {
          return false;
      }// please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
   Node n = new Node(head.element, null);
   Node newhead = n;
   for(Node h=head.next; h!=null; h=h.next)
   {
      Node temp = new Node(h.element, null);
      n.next = temp;
      n = temp; 
     
   }
   
    return newhead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node newHead=null;
    for(Node n=head; n!=null; n=n.next)
    {
        Node temp = new Node(n.element, null);
        temp.next=newHead;
        newHead = temp;
    }
    return newHead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    Node newNode = new Node(elem, null);
        if(idx==0)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            int count = 0; 
            Node currN= head; 
            Node prevN=null;
            while(count<idx)
            {
                prevN=currN;
                currN=currN.next;
                count++;
            }
            newNode.next = currN;
            prevN.next=newNode;
        }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    Node newNode = new Node(head.element, null);
    Object removed = null;
    Node currN = head;
        if(index==0)
        {
            removed = head.element;
            head = currN.next;
        }
        else
        {
            int count = 0; 
            Node prevN=null;
            while(count<index)
            {
                prevN=currN;
                currN=currN.next;
                count++;
            }
            removed= currN.element;
//            newNode.next = currN;
            prevN.next=currN.next;
        }
        
  return removed; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    int count=0;
    Node currN=head; 
    Node prevN=null;
    while(count<1)
    {
        prevN=currN;
        currN = currN.next;
        count++;
    }
    Node newHead=currN;
    prevN.next=null;
    while(currN.next!=null)
    {
        currN = currN.next;
    }
    currN.next=head;
    head = newHead;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
      Object elem=null;
      for( Node n=head; n!=null; n=n.next)
      {
          elem = n.element;
          
      }
      insert(elem, 0);
      nodeAt(countNode()-2).next = null;
  }
  
}