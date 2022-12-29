import java.util.Scanner;
public class Task8
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    int q = input.nextInt();
    int[] a = new int[q];
    int[] b = new int[q];
    int[] c = new int[q];
    for(int i = 0; i<q; i++)
    {
      a[i] = input.nextInt();
    }
    for(int i = 0; i<q; i++)
    {  
      b[i] = input.nextInt();   
    }
    for(int i = 0; i<q; i++)
    {
      c[i] = 5*a[i] - b[i];
    }
    for(int i = 0; i < c.length; i++)
    {
      System.out.print(c[i]+" ");
    }
    System.out.println();
  }
}
