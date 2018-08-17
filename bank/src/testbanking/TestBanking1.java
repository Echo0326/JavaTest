/*
 * This class creates the program to test the banking1 classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
package testbanking;
import banking1.*;

public class TestBanking1 {

  public static void main(String[] args) {
    Account  account=new Account(500.00);

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating an account with a 500.00 balance.");
    account.withraw(150.00);
	//code
    System.out.println("Withdraw 150.00");
   	//code
    account.deposit(22.50);
    System.out.println("Deposit 22.50");
    account.withraw(47.62);
	//code
    System.out.println("Withdraw 47.62");
   	//code
    // Print out the final account balance
    System.out.println("The account has a balance of " + account.getBalance());
  }
}
