package LearnScope;

public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;


  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
    this.interestRate = 0.02;//use this
  }

  public int getBalance(){
    return balance;
  }//getter method
  
  public void setBalance(int newBalance){
    balance = newBalance;
  }//how to change the value of private
  public void getAccountInformation(){
	    System.out.println("Money in account: " + this.getBalance());
	    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

	  }

  private double calculateNextMonthInterest(){
	    return this.balance * this.interestRate;
	  }
}