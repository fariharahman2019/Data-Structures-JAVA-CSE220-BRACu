import java.util.Scanner;
public class Task5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        int c[] = new int[10];
        
        makeCount(a,c);
        print(c);
    }   
    public static int[] makeCount(int array[], int count[])
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<array.length; i++)
        {
            System.out.println("Please enter a number");
            array[i] = input.nextInt();
            for(int j=0; j<count.length; j++)
            {
                if(array[i]==j)
                {
                    count[j]++;
                }
            }
        }
        return count;
    }
    
    public static void print(int x[])
    {
        for(int i=0; i<x.length; i++)
        {
            System.out.println(i+" was found "+x[i]+" times");
        }
        
    }
}