import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int array[]= new int[5];
        for(int i=0; i<array.length; i++)
        {
            array[i] = input.nextInt();
        }
        sort(array);
        print(array);
        
    }
    
    public static int[] sort(int x[])
    {
        for(int i=0; i<x.length; i++)
        {
            for(int j=i+1; j<x.length; j++)
            {
                if(x[j]>x[i])
                {
                    int backup = x[i];
                    x[i]=x[j];
                    x[j]=backup;
                }
            
            }
        }
        return x;
    }
    
    public static void print(int x[])
    {
        for(int i=0; i<x.length; i++)
        {
            System.out.print(x[i]+" ");
        }
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2==0)
            {
                System.out.print(x[i]+" ");
            }
        }
    }
}