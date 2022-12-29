public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;

  public CircularArray(Object [] lin, int st, int sz)
  {
      this.start= st; this.size=sz;
      this.cir= new Object [lin.length];
    for(int i=0, j=start; i<lin.length; i++, j++)
    {
        cir[j%lin.length]= lin[i];
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear()
  {
        for(int i=0; i<cir.length; i++)
        {
            System.out.print(cir[i]+" ");
        }
        System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward()
  {
    for(int i=start; i<start+size; i++)
        {
            System.out.print(cir[i%cir.length]+" ");
//            System.out.println(i);
        }
    System.out.println();
  }
  
  
  public void printBackward(){
  for(int i=start+size-1; i>=start; i--)
        {
            System.out.print(cir[i%cir.length]+" ");
        }
    System.out.println();
   
  }
  
  // With no null cells
  public void linearize()
  {
      Object b[] = cir;
    this.cir = new Object[size];
    for(int i=start, j=0; i<start+size; i++,j++)
    {
        if(b[i%b.length]!=null)
        {
            cir[j]=b[i%b.length];
        }
    }
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity)
  {
    Object b[] = this.cir;
    this.cir = new Object[newcapacity];
    for(int i=start; i<size+start; i++)
    {
        cir[i] = b[i%b.length]; 
    }
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity)
  {
      
      resizeStartUnchanged(newcapacity);
      Object b[] = cir;
      this.cir = new Object[newcapacity];
      for(int i=start, j=0; i<start+size; i++,j++)
      {
              cir[j]=b[i%b.length];
      }
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos)
  {
      if(cir.length==size)
      {
          resizeStartUnchanged(cir.length+3);
      }  
      for(int from=(start+size-1)%cir.length, to=(start+size)%cir.length; from>pos; from--, to--)
      {
          cir[to] = cir[from];
      }
      cir[start+pos]=elem;
      size++;
  }
  
  public void insertByLeftShift(Object elem, int pos)
  {
    if(cir.length==size)
      {
          resizeStartUnchanged(cir.length+3);
      }  
      for(int from=start%cir.length, to=start-1%cir.length; from<=start+pos; from++, to++)
      {
          cir[to] = cir[from];
      }

      cir[start+pos]=elem;
      size++;
      start--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos)
  {
      int n=size-pos-1;
      int from=(start+pos+1)%cir.length;
      int to;
      for(int i=0;i<n;i++)
      {
          to=from-1; 
          if(to<0) 
          {
              to=cir.length-1;
          }
          cir[to%cir.length]=cir[from%cir.length];
          from++;
      }
      cir[(start+size-1)%cir.length]=null;
      size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
      int n=pos;
      int from=(start+pos-1)%cir.length;
      int to;
      for(int i=0;i<n;i++)
      {
          if(from<0) 
          {
              from=cir.length-1;
          }
          to=from+1;
          cir[to%cir.length]=cir[from%cir.length];
          from--;
      }
      cir[start]=null;
      size--;
      start=(start++)%cir.length;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
      boolean status=true; 
      int n=size/2;
      for(int i=0,s=start, t=start+size-1; i<n; s++,i++,t--)
      {
          if(t<0) 
          {
              t=cir.length-1;
          }
          if(cir[s%cir.length]!=cir[t%cir.length]) 
          {
              status=false;
          }
      }
      if (status==true) 
      {
          System.out.println("This array is a palindrome.");
      }
      else 
      {
          System.out.println("This array is NOT a palindrome.");
      }
  }

  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    for(int i=start; i<start+size; i++)
        {
            for(int j=i+1; j<start+size; j++)
            {
                if((int) cir[i%cir.length] > (int) cir[j%cir.length])
                {
                    Object backup = cir[i%cir.length];
                    cir[i%cir.length] = cir[j%cir.length];
                    cir[j%cir.length] = backup;
                }
            }
        }
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k)
  {
      
      boolean flag = true;
      for(int i=start; i<start+size; i++)
      {
          if(!cir[i%cir.length].equals(k.cir[i%k.cir.length]))
          {
              flag = false; 
          }
      }
    
    return flag; // Remove this line
  }
}