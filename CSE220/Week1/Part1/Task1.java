import java.util.Scanner;
public class Task1
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int array [] = new int[num];
        for(int i=0; i<array.length; i++)
        {
            array[i]= input.nextInt();
        }
        System.out.println(firstLast6(array));
    }
    
    public static boolean firstLast6(int x[])
    {
       
        if(x[0]==6 || x[x.length-1]==6)
        {
            return true;
        }
        return false;
    }
}