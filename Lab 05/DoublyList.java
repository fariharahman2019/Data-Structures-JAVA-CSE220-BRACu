import java.util.*;

public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
      int count=0;
      for(Node n=head.next;n.element!=null;n=n.next){
          count++;
      }
      return count;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
      for(Node n=head.next;n!=head;n=n.next){
        System.out.print(n.element+" ");
      }
      System.out.print("\n");
    }
    
    public void backwardprint(){
      for(Node p=head.prev;p!=head;p=p.prev){
        System.out.print(p.element+" ");
      }
      System.out.print("\n");
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
      if(idx<0 || idx>=countNode()){
          return null;
      }
      int c=0;
      for(Node n=head.next;n.element!=null;n=n.next){
          if(c==idx){
              return n;
          }else{
              c++;
          }
      }
      return null;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
      int c=0;
      for(Node n=head.next;n.element!=null;n=n.next){
          if(n.element==elem){
              return c;
          }else{
              c++;
          }
      }
      return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
      int i=0;
      Node temp=null;
      if(idx==i){
        temp=head;
      }else{
        for(Node n=head.next;n.element!=null;n=n.next){
          if(i==idx-1){
            temp=n;
            break;
          }
          i++;
        }
      }
      Node newNode=new Node(elem,null,null);
      newNode.next=temp.next;
      newNode.prev=temp;
      temp.next.prev=newNode;
      temp.next=newNode;
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
       int i=0;
      Node temp=null;
      if(index==i){
        temp=head;
      }else{
        for(Node n=head.next;n.element!=null;n=n.next){
          if(i==index-1){
            temp=n;
            break;
          }
          i++;
        }
      }
      Node backup=temp.next;
      temp.next=backup.next;
      backup.next.prev=temp;
      return backup.element;
    }
     
}