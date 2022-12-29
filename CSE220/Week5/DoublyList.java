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
        Node n = head.next;
        while(n!=head)
        {
            n = n.next;
            count++;
            
        }
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        for(Node n=head.next; n!=head; n=n.next)
        {
            System.out.print(n.element+" ");
        }
        System.out.println();    
    }
    
    public void backwardprint(){
        for(Node n=head.prev; n!=head; n=n.prev)
        {
            System.out.print(n.element+" ");
        }
        System.out.println();     
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        if(countNode()<idx)
        {
            return null;
        }
        else{
            int count=0;
            Node currN=head;
            while(count<=idx)
            {
                currN=currN.next;
                count++;
            }
            return currN;
        }// please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        boolean flag=false;
        for(Node n = head.next; n!=head; n=n.next)
        {
            if(n.element==elem)
            {
                flag=true;
            }
        }
        int count=0;
        if(flag==true)
        {
            
            Node currN=head;
            while(currN.element!=elem)
            {
                count++;
                currN = currN.next;
            }
           
        }
         return count;
    }
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
//      Node newNode = new Node(elem, null, head.prev);
        if(idx<0 && countNode()<idx)
        {
            System.out.println("invalid index");
        }
//        if(idx==0)
//        {
//            Node pred = head;
//            Node succ = pred.next;
//            Node newNode = new Node(elem, succ, pred);
//        }
        Node pred = nodeAt(idx-1);
        Node succ = pred.next;
        Node newNode = new Node(elem, succ, pred);
        pred.next = newNode;
        succ.prev = newNode;
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Node removeN = nodeAt(index);
        Node pred = removeN.prev;
        Node succ = removeN.next;
        Object removed = removeN.element;
        pred.next = succ;
        succ.prev = pred;
        return removed; // please remove this line!
    }
    
    }

    
