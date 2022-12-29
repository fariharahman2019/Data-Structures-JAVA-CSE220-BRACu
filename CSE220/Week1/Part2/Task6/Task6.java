public class Task6
    
    
{
    public static void main(String[] args)
    {
        double h, w, a;
        Square_Task6 s1 = new Square_Task6();
        s1.setHeight(3);
        s1.setWidth(4);
        h = s1.getHeight();
        w = s1.getWidth();
        a = s1.getArea();
        
        System.out.println("Heigth ="+h);
        System.out.println("Width ="+w);
        System.out.println("Area ="+a);
    }
}