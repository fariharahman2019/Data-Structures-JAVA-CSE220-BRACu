public class StackTester{
  public static void main(String[]args){
    ListStack stack=new ListStack();
    try{
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.push(50);
      System.out.println(stack);
      System.out.println(stack.peek());
      stack.pop();
      System.out.println(stack.peek());
      stack.pop();
      System.out.println(stack.peek());
      System.out.println(stack);
      //System.out.println(stack.toArray());
      Object [] Yoto=stack.toArray();
      for(int i=0;i<Yoto.length;i++){
        System.out.print(Yoto[i]+" ");
      }
      System.out.println();
      System.out.println(stack.search(50));
      System.out.println(stack.search(10));
    }
    catch(StackOverflowException e){
      System.out.println("Stack Full");
    }
    catch(StackUnderflowException e){
      System.out.println("Stack Empty");
    }
  }
}

