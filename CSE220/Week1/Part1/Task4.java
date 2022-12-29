import java.util.Scanner;
public class Task4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        
        takeNumbers(a);
        print(a);   
    } 
    
    public static int[] takeNumbers(int array[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Please enter a number");
            array[i]=sc.nextInt();
            for(int j=0; j<i; j++)
            {
                if(array[i]==array[j])
                {
                    System.out.println("You have entered a duplicate number, enter a new one");
                    i--;
                    break;
                }
            }
        }
        return array;
    }
    
    public static void print(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}