import java.util.Scanner;
public class Task9
{
  public static void main(String[] args)
  {
    Scanner k =new Scanner(System.in);
    int a = k.nextInt();
    int b = k.nextInt();
    int c = k.nextInt();
    QuadEqn(a,b,c);
    firstRoot(a,b,c);
  }
  public static void QuadEqn(int m,int n, int o)
  {
      if(m==1)
      {
    System.out.println("x^2 +"+n+"x +"+o);
      }
      else
      {
          System.out.println(m+"x^2 +"+n+"x +"+o);
      }
      }
  public static void firstRoot(int m, int n, int o)
  {
    double x = (-n + Math.sqrt(n*n - 4*m*o))/(2*m);
    System.out.println((int)x);
  }
}