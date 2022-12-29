import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        int array[] = new int[5];
        int array2[] = new int[array.length];
        
        takeArray(array);
        array2=square(array);
        print(array2);
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
    
    public static int[] square(int a[])
    {
        int b[] = new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            b[i]= a[i]*a[i];
        }
        return b;
    }
    
    public static void print(int x[])
    {
        for(int i=0; i<x.length; i++)
        {
            System.out.print(x[i]+" ");
        }
        
    }
}