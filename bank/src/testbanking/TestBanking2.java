package testbanking;/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */

import banking1.Account;
import banking2.*;

public class TestBanking2 {

  public static void main(String[] args) {
    Account account=new Account(500.00);
    Customer customer=new Customer("Jane","Smith");
    // Create an account that can has a 500.00 balance.
    System.out.println("Creating the customer Jane Smith.");
    //code
    customer.setAccount(account);
    System.out.println("Creating her account with a 500.00 balance.");
    //code
    customer.getAccount().withraw(150.00);
    System.out.println("Withdraw 150.00");
   
	//code
    customer.getAccount().deposit(22.50);
    System.out.println("Deposit 22.50");
  	//code
    customer.getAccount().withraw(47.62);
    System.out.println("Withdraw 47.62");
   	//code
    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + customer.getAccount().getBalance());
  }
}
