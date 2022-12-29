public class Patient
{
    public String name;
    public int age;
    public String blood;
    public static int count =0;
    public int ID;
    
    public Patient(String n, int a, String b)
    {
        name=n;
        age=a;
        blood=b;
    }
    
    public String toString()
    {
        String y="Name: "+name+"\n"+"ID: "+ID+"\n"+"Blood Group: "+blood+"\n";
        return y;
    }
}