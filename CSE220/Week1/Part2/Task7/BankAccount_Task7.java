public class BankAccount_Task7
{
  private String name;
  private String accountID;
  private String address;
  private double balance;
  
  public BankAccount_Task7(String n, String i, String a, double b)
  {
    name = n; 
    accountID = i;
    address = a;
    balance = b;
  }
  
  public String getName()
  {
    return name;
  }
  public void setName(String n)
  {
    name = n;
  }
  public String getAccountID()
  {
    return accountID;
  }
  public void setAccountID(String i)
  {
    accountID = i;
  }
  public String getAddress()
  {
    return address;
  }
  public void setAddress(String a)
  {
    address =a;
  }
  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b)
  {
    balance = b;
  }
  public void addInterest()
  {
    double interest = (balance*7.0)/100.00;
    balance = balance+interest;
    
  }


}