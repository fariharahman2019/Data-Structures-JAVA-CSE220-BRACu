public class Task13{
    public static int [] removeOdd (int [] input)
    {
        int count=0;
        for(int i=0; i<input.length; i++)
        {
            if(input[i]%2==0)
            {
                count++;
            }
        }
        int a[] = new int[count];
        for(int i=0; i<a.length; )
        {
            for(int j=0; j<input.length; j++)
            {
                if(input[j]%2==0)
                {
                    a[i] = input[j];
                    i++;
                }
            }
        }
        return a;
    }
    
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}
