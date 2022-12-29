public class ComplexNumber extends RealNumber
{
    private double ImaginaryValue;
    
    public double getImaginaryValue() {
        return ImaginaryValue;
    }
    public void setImaginaryValue(double r) {
        ImaginaryValue = r;
    }
    public ComplexNumber()
    {
        setRealValue(1.0);
        setImaginaryValue(1.0);
    }
    public ComplexNumber(double r, double i)
    {
        setRealValue(r);
        setImaginaryValue(i);
    }
    public void pong() {
        System.out.println("I'm in ComplexNumber class");
    }
    public void check()
    {
        pong();
        ping();
        System.out.println("Checking ended");
    }
    public String toString() {
       
        System.out.println("RealPart: "+getRealValue());
        return "ImaginrayPart: "+getImaginaryValue();
    }
}