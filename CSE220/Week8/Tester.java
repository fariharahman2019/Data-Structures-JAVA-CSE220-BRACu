public class Tester
{
    public static void main(String[] args)
    {
        Patient p1 = new Patient("Sinsumbil", 20, "O+");
        Patient p2 = new Patient("Samiha", 20, "A+");
        Patient p3 = new Patient("Nazia", 20, "B+");
        WRM w = new WRM();
        
        w.RegisterPatient(p1);
        w.RegisterPatient(p2);
        w.RegisterPatient(p3);
       
        w.ServePatient();
        w.ServePatient();
        w.ServePatient();
        w.CancelAll();
        System.out.println(w.CanDoctorGoHome());
        w.RegisterPatient(p1);
        System.out.println(w.CanDoctorGoHome());
        w.ShowAllPatient();
    }
}