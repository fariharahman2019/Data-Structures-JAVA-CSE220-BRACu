public class TestCircularArray{
  
  String [] cir;
  int size;
  int start;
  
  public TestCircularArray(String[]lin, int st, int sz){
    // Initialize the gloabal variables with the local ones
    // For the array, please copy the elements one by one from lin to cir
    // DO NO copy the address
    // Copy lin[0] to cir[st]
    
    // TO DO
    cir = new String[lin.length];
    start =st;
    size = sz;
    for(int x=st;x<st+sz;x++){
       cir[x%lin.length] = lin[x-st];
    }
    
    display();
    
  }
  
  public void sort(){
    // Sort the cir array using bubble/selection sort
    // Alert! The numbers in the array are in Strings
    // convert them to integer first
    // hint: Integet.parseInt()
    
    // TO DO
    //selection
    for(int x=start;x<start+size;x++){
        int min = Integer.parseInt(cir[x%cir.length]);
        int pos = x;
        
        for(int y=x+1;y<start+size;y++){
          if(Integer.parseInt(cir[y%cir.length])<min){
              min = Integer.parseInt(cir[y%cir.length]);
              pos = y;
          }
        
        }
        String temp = cir[x%cir.length];
        
        cir[x%cir.length] = cir[pos%cir.length];
        
        cir[pos%cir.length] = temp;
        
    }
    
    display();
  }
  public int countOdd(){
    /* From the cir array, you have to count the number of odd numbers.
     * It is not as easy as it looks. Firstly, notice that the numbers are given as strings. 
     * To determine whether a number is odd,you first have to sum up the digits. 
     * For example if one number is "234", you have to find the result of 2+3+4. 
     * If the summation is odd then consider the number as odd.
     * Then return the count.
     */
    int count=0;
    for(int x=start;x<start+size;x++){
      int sum=0;
      for(int y=0;y<cir[x%cir.length].length();y++){
          sum+=(cir[x%cir.length].charAt(y)-'0');
      }
      if(sum%2==1) count++;
        
    }
    return count;
  }
  
  public int countEven(){
    /* From the cir array, you have to count the number of even numbers.
     * It is not as easy as it looks. Firstly, notice that the numbers are given as strings. 
     * To determine whether a number is even, you first have to sum up the digits. 
     * For example if one number is "234", you have to find the result of 2+3+4. 
     * If the summation is even then consider the number as even.
     * Then return the count.
     */
    
    // TO DO
    int count=0;
    for(int x=start;x<start+size;x++){
      int sum=0;
      for(int y=0;y<cir[x%cir.length].length();y++){
          sum+=(cir[x%cir.length].charAt(y)-'0');
      }
      if(sum%2==0) count++;
        
    }
    return count;

  }
  
  public void insert(String item,int offset) throws CircularArrayException{
    /* If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must createhe CircularArrayException object send the name of the particular exception as String in the constructor
     * one of them is done for you
     * 
     * If there is/are empty space(s), insert using LEFT shift.
     * Offset means how far from start. The index has been calculated for you.
     * Offset cannot be more than size
     * Note that the element pointed by start will also shift, hence change the start at the end
     * increment size
     */
    
    if (offset<0 || offset>size){
      throw new CircularArrayException("Invalid offset");
    }
    
    if (size==cir.length){
      throw new CircularArrayException("Array full");
    }
    
    int idx = (start+offset)%cir.length;  
    
    
    for(int x = (start-1==-1?cir.length-1:start-1) ; x< start+ offset;x++){
        cir[x%cir.length]= cir[(x+1)%cir.length];
    }
    cir[idx]=item;
    
    if(start-1==-1) start  = cir.length-1;
    else start--;
    size++;
    
    // TO DO
    display();
  }
  
  public String delete (int offset)throws CircularArrayException{
    /* If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must send the name of the particular exception as String in the constructor
     * shown in insert()
     * 
     * Delete using right shift.
     * Note that the element pointed by start will also shift, hence change the start at the end
     * decrement size
     * return the delete element
     */
    
    // TO DO
    
    if (offset<0 || offset>size){
      throw new CircularArrayException("Invalid offset");
    }
    
    if (size==cir.length){
      throw new CircularArrayException("Array full");
    }
    
    for(int x= start+offset;x>=start;x--){
        cir[x%cir.length] = cir[(x-1)%cir.length];
    }
    size--;
    start++;

    display();
    return null;
  }
  
  public void display(){
    int i = 0;
    int st = start;
    while(i<size){
      System.out.print(cir[st]+" ");
      i++;
      st = (st+1)%cir.length;
    }
    System.out.println();
  }
  
  
}