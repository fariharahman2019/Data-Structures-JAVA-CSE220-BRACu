public class WRM 
{
    ListQueue a = new ListQueue();
    
    public void RegisterPatient(Patient p)
    {
        p.ID = p.count++;
        try
        {
            a.enqueue(p);
        }
        
        catch(Exception e){
            
        }
    }
    
    public void ServePatient()
    {
       try
       {
           Patient s =(Patient) a.dequeue();
           System.out.println(s.name+" has been served");
       }
       catch(Exception e){
            
           System.out.println(e);
        }
       
    }
    
    public void CancelAll()
    {
        a.clear();
    }
    
    public boolean CanDoctorGoHome()
    {
        if(a.isEmpty()==true)
        {
            return true;
        }
        return false;
    }
    
    public void ShowAllPatient()
    {
        System.out.println(a);
    }
}