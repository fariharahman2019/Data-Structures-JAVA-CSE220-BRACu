import java.util.Scanner;
public class WRM{ // This WRM is only for Array Based queue
  Scanner input = new Scanner (System.in);
  Queue q= new ArrayQueue();; // Initializing an Object
  public static int id = 1000000; // static id
  
  public void RegisterPatient(){
    id++; // Id barbe 
    System.out.println("Enter Name"); //user theke inputs nei
    String n = input.next();
    System.out.println("Enter Age");
    int a = input.nextInt();
    System.out.println("Enter Blood Group");
    String b = input.next();
    Patient p1 = new Patient (n , a, b, id);  // Patient er obj create kore shb pathailam
    try{
      q.enqueue(p1); // array te Enqueue korlam
      System.out.println(p1.name+" Added");
    }
    catch(QueueOverflowException e){
      System.err.println("Queue Full! Cannot Enqueue\n"+e);
    }
  }
  
  
  public void ServePatient(){
    try{
      Patient p2 = (Patient) q.dequeue(); //patient served (delete) hobe
      System.out.println(p2.name+" has been served");
    }
    catch(QueueUnderflowException e){
      System.err.println("No Appointment is Available");
    }
  }
  
  public void CancelAll(){
    if(q.size()>0){
      System.out.println("All Appointment is canceled");
    }
    for(int i = 0 ; i<=q.size() ; i++){//loop chaliye shb patient delete korte hobe
      try{
        q.dequeue();
      }      
      catch (QueueUnderflowException e){
        System.err.println("No Appointment is Available");
      }
    }
  }
  
  public void CanDoctorGoHome(){
    if(q.isEmpty()){
      System.out.println("There is no patient to serve in this hospital.");// shb empty hole doctor can go home
    }
    else{
      System.out.println("There is Still patients who are in waiting room.");
    }
  }
  
  public void ShowAllPatient(){ //this method will show all patients
    Object [] temp = q.toArray();
    //albhabetically sorted
    for(int i = 0 ; i<q.size() ; i++){
      for(int j = i+1 ; j<q.size() ; j++){
        Patient a = (Patient) temp[i];
        Patient b = (Patient) temp[j];
        if(a.name.compareTo(b.name)>0){
          Object swap = temp[i];
          temp[i] = temp[j];
          temp[j] = swap;
        }
      }
    }
    if(q.size()==0){
      System.err.println("No Appointment is Available");
    }
    else{
      for(int i = 0 ; i<temp.length ; i++){
        System.out.println(temp[i]);
      }
    }
    
  }
}
