public class Task7
{
  public static  void main(String[] args)
  {
    BankAccount_Task7 acc1 = new BankAccount_Task7("Sabti", "18301092", "Mohammadpur", 100);
//    acc1.setName("Sinsumbil Binte Obaed");
//    acc1.setAccountID("18301092");
//    acc1.setAddress("Mohammadpur");
//    acc1.setBalance(100000);
      acc1.addInterest();
    
    System.out.println(acc1.getName());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getAddress());
    
    System.out.println(acc1.getBalance());
    System.out.println();
    
    BankAccount_Task7 acc2 = new BankAccount_Task7("Tapu", "18301271", "Badda", 50);
//    acc2.setName("Sakib Uddin Tapu");
//    acc2.setAccountID("18301271");
//    acc2.setAddress("Badda");
//    acc2.setBalance(50);
    
    
    System.out.println(acc2.getName());
    System.out.println(acc2.getAccountID());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getBalance());
    System.out.println();
    
    BankAccount_Task7 acc3 = new BankAccount_Task7("Samiha", "18301000", "Homeless", 20);
//    acc3.setName("Samiha Raisa");
//    acc3.setAccountID("18301000");
//    acc3.setAddress("Homeless");
//    acc3.setBalance(100);
      acc3.addInterest();
    
    System.out.println(acc3.getName());
    System.out.println(acc3.getAccountID());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getBalance());
    System.out.println();
    
  }
}