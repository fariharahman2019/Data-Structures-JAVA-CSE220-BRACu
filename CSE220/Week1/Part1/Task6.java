import java.util.Scanner;
public class Task6
{
    public static void main(String [] args)
    {
        int array[] = new int[5];
        
        takeArray(array);
        System.out.println(palindrome(array));
    }
    
    public static int[] takeArray(int a[])
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<a.length; i++)
        {
            a[i] = input.nextInt();
        }
        return a;
    }
    
    public static boolean palindrome(int a[])
    {
        for(int i=0; i<a.length/2; )
        {
            for(int j=a.length-1; j>=a.length/2+1; )
            {
                if(a[i]==a[j] && a[i++]==a[j--])
                {
                    return true;
                }
            }
        }
        return false; 
    }
}
