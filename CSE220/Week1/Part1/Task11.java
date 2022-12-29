import java.util.Scanner;
public class Task11
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        System.out.println(allDigitOdd(num));
        
    }
    
    public static boolean allDigitOdd(int a)
    {
//        int l =a;
        boolean flag = true;
        int count=0;
        for(int i=a; i>=0; i=i/10)
        {
            count++;
        }
        int divider=1;
        for(int i=1; i<count; i++)
        {
            divider = divider*10;
        }
        
        for(int j=10; j<=divider; j=j*10)
        {
            if((a%j)%2==0)
            {
                flag= false;
                break;
            }
            a=a/10;
        }
        
        return flag;
    }
}