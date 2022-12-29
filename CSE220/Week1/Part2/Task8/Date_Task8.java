public class Date_Task8
{
    public int dt;
    public int mnth;
    public int yr;
    
    public Date_Task8(int d, int m, int y)
    {
        dt=d;
        mnth=m;
        yr=y;
        
    }
    
    public int getMnth()
    {
        return mnth;
    }
    public int getDt()
    {
        return dt;
    }
    public int getYr()
    {
        return yr;
    }
    
    public void setDt(int d)
    {
        dt = d;
    }
    public void setMnth(int m)
    {
        mnth = m;
    }
    public void setYr(int y)
    {
        yr = y;
    }
    
    public void displayDate()
    {
        System.out.println("Date: "+mnth+"/ "+dt+"/ "+yr);
    }
}