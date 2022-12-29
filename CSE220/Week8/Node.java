public class Node{
    Object val;
    Node next;
    Node prev;
    
    public Node(Object v, Node n){
        val = v;
        next = n;
    }
    public Node(Object v, Node n, Node p)
    {
        val = v;
        next = n;
        prev = p;
    }
}