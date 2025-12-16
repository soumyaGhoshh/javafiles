// package SoumyaGhoshLabFile;

class BankAccount{
  protected String accNumber;
  protected String accHolder;
  protected double accBalance;

  BankAccount(String accNumber, String accHolder, double accBalance){
    this.accNumber = accNumber;
    this.accHolder = accHolder;
    this.accBalance = accBalance;
  }

  void deposit(double amount){
    if(amount > 0){
      accBalance += amount;
      System.out.println("Deposited: " + amount);
    }
    else System.out.println("Invalid deposit amount.");
  }

  void withdraw(double amount){
    if(amount > 0 && accBalance >= amount){
      accBalance -= amount;
      System.out.println("Withdrawn: " + amount);
    }
    else
      System.out.println("invalid amount or insufficient balance");
  }

  void calculateInterest(){
    System.out.println("No interest for basic account");
  }

  void displayAccountInfo(){
    System.out.println("Account No.: " + accNumber);
    System.out.println("Account holer: " + accHolder);
    System.out.println("Account Balance: " + accBalance);
  }

  //can not be overriden
  final void getAccountType(){
    System.out.println("Basic Bank Account");
  }
}

class SavingsAccount extends BankAccount{
  private double interestRate;
  SavingsAccount(String accNumber, String accHolder, double accBalance, double interestRate){
    super(accNumber, accHolder, accBalance);
    this.interestRate = interestRate;
  }

  //overriden method
  void withdraw(double amount){
    if(amount > 0 && amount <= accBalance && (accBalance - amount) >= 1000){
      accBalance -= amount;
      System.out.println("Withdrawn: (maintain min 1000 rupes) " + amount);
    }
    else
      System.out.println("Withdrawal failed! Maintain atleast 1000 rupee");
  }
  //overriden method
  void calculateInterest(){
    double interest = accBalance * interestRate /100;
    accBalance += interestRate;
    System.out.println("The account balacne after interest: " + accBalance);
  }
  void displayAccountInfo(){
    super.displayAccountInfo();
    System.out.println("Interest Rate: " + interestRate);
  }
}

class CurrentsAccount extends BankAccount {
    private double overdraftLimit;
    
    public CurrentsAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }
    //overriden method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (accBalance + overdraftLimit)) {
            accBalance -= amount;
            System.out.println("Withdrawn" + amount);
            if (accBalance < 0) {
                System.out.println("Overdraft used! balance: " + Math.abs(accBalance));
            }
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
    //overriden method
    public void calculateInterest() {
        System.out.println("No interest for currents account.");
    }
    //overriden method
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft limit" + overdraftLimit);
        System.out.println("This is Current Account ");
    }
}

public class Exp7 {
  public static void main(String args[]){
    BankAccount savings = new SavingsAccount("sav100", "Soumya Ghosh", 5000, 4.5);
    BankAccount currents = new CurrentsAccount("curr100", "Soumya Ghosh", 5000, 400);

    BankAccount[] accounts = {savings, currents};
    for(BankAccount account : accounts){
      account.getAccountType();
      account.displayAccountInfo();
      account.deposit(4000);
      account.withdraw(300);
      account.calculateInterest();
    }
  }
}