import java.util.Scanner;
public class Task10{
  public static void main(String[] spd)
  {
    Scanner k = new Scanner (System.in);
    int b = k.nextInt();
    int [] a = new int [b];
    for(int i = 0; i < a.length; i++)
    {
      a[i] = k.nextInt();
    }
    int x = k.nextInt();
    leftRotate(a,x);
    rightRotate(a,x);
  }
  public static void leftRotate(int [] a, int r)
  {
    for(int i = r; i < a.length; i++)
    {
      System.out.print(a[i]+" ");
    }
    for(int i = 0; i < r; i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  public static void rightRotate( int [] a, int r)
  {
    for(int i = a.length - r; i < a.length; i++)
    {
      System.out.print(a[i]+" ");
    }
    for(int i = 0; i < a.length - r; i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
}
  