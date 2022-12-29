import java.util.Scanner;
public class Task2
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        for(int i=0; i<array.length; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println(findMax(array));
        System.out.println(findMin(array));
        swap(array);
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    public static int findMax(int x[])
    {
        int max=0;
        for(int i=0; i<x.length; i++)
        {
            if(x[i]>max)
            {
                max= x[i];
            }
        }
        return max;
    }
    public static int findMin(int x[])
    {
        int min=x[0];
        for(int i=1; i<x.length; i++)
        {
            if(x[i]<min)
            {
                min= x[i];
            }
        }
        return min;
    }
    public static int[] swap(int x[])
    {
        int max=0;
        int max_loc =0;
        for(int i=0; i<x.length; i++)
        {
            
            if(x[i]>max)
            {
                max= x[i];
                max_loc = 1;
            }
        }
        int min=x[0];
        int min_loc = 0;
        for(int i=1; i<x.length; i++)
        {
            if(x[i]<min)
            {
                min= x[i];
                min_loc = i;
            }
        }
        x[min_loc]= max;
        x[max_loc] = min;
        return x;
    }
}