import java.util.Scanner;
public class Task3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        try
        {
            a[5]=99;
            x=n/0;
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e+" array size boro koro");
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e+" 0 diye kichu bhaag kora jae na");
        }
        finally
        {
            System.out.println("THE END");
        }
    }
}
