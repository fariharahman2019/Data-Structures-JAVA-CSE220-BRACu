import java.util.Scanner;
public class Task7
{
    public static void main(String[] args)
    {
        int array[] = new int[5];
        
        takeArray(array);
        printStar(array);
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
    
    public static void printStar(int a[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=0; i<=a[a[num]];i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}