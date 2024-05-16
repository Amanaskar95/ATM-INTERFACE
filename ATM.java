package ATMMain;

import java.util.Scanner;

//Class to represent the ATM machine
class ATM {
	private BankAccount userAccount;

	public ATM(BankAccount account) {
		this.userAccount = account;
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (userAccount.withdraw(amount)) {
				System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
			} else {
				System.out.println("Insufficient funds.");
			}
		} else {
			System.out.println("Invalid amount.");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			userAccount.deposit(amount);
			System.out.println("Deposit successful. New balance: " + userAccount.getBalance());
		} else {
			System.out.println("Invalid amount.");
		}
	}

	public void checkBalance() {
		System.out.println("Your current balance is: " + userAccount.getBalance());
	}
}

