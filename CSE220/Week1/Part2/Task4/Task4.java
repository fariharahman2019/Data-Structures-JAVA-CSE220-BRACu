import java.util.Scanner;
public class Task4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        try
        {   
            a[5]=99;
            x=n/0;
        }
        
        catch(Exception e)
        {
            System.out.println(e+" thik moto number dao");
        }
    }
}
