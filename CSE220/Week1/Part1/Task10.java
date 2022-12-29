import java.util.Scanner;
public class Task10
{
  public static void main (String[] args)
  {
    Scanner k = new Scanner(System.in);
    int a = k.nextInt();
    int b = k.nextInt();
    if ((a == 12 && b >= 16)||(a == 3 && b <= 15)||(a < 3 && b <= 31))
    {
      System.out.println("Winter");
    }
    else if((a == 3 && b >= 16)||(a == 6 && b <= 15)||(a < 6 && b <= 31))
    {
      System.out.println("Spring");
    }
    else if((a == 6 && b >= 16)||(a == 9 && b <= 15)||(a < 9 && b <= 31))
    {
      System.out.println("Summer");
    }
    else
      System.out.println("Fall");
  }
}