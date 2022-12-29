import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    String option = "Enter your Choice:\n1.Register patient\n2.Serve patient\n3.Cancel all appointments\n4.Can doctor go home\n5.List of all patient\n6.Exit"; // All of the options theuser wants tp select
    System.out.println("Link List Based Queue WRM Hospital System");
    System.out.println(option);     // Printing the options so that user can select                              
    int choice = 0 ; // choosing for which system the user wants to know
    WRM w = new WRM(); // creating an object in WRM class
    
    while(choice!=6){ // creating a loop
      try{
        choice = input.nextInt(); // user input dibe
        if(choice == 1){
          w.RegisterPatient(); // 1 dile RegisterPatient method call hobe
          System.out.println("---\n"+option);
        }
        else if(choice == 2){
          w.ServePatient(); // 2 dile ServePatient method call hobe
          System.out.println("---\n"+option);
          
        }
        else if(choice ==  3){
          w.CancelAll(); // 3 dile CancelAll method call hobe
          System.out.println("---\n"+option);
          
        }
        else if(choice == 4){
          w.CanDoctorGoHome(); // 4 dile CanDoctorGoHome method call hobe
          System.out.println("---\n"+option);
        }
        else if(choice == 5){
          w.ShowAllPatient(); // 5 dile ShowAllPatient method call hobe
          System.out.println("---\n"+option);
        }
        else if(choice == 6){
          System.out.println("Thank You"); // 6 dile Exit
        }
        else{
          System.out.println(option);
        }
      }
      
      catch(Exception e){
        System.err.println("Input Mismatch! Please, try Again.\n"+option); // error ashle exception dibe r option choose korte dibe
        input.next();
      }
    }
  }
}
