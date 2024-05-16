package ATMMain;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Initialize bank account with initial balance
		BankAccount account = new BankAccount(1000.0);
		ATM atm = new ATM(account);

		while (true) {
			System.out.println("\nWelcome to the ATM. Choose an option:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw:");
				double withdrawAmount = scanner.nextDouble();
				atm.withdraw(withdrawAmount);
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				double depositAmount = scanner.nextDouble();
				atm.deposit(depositAmount);
				break;
			case 3:
				atm.checkBalance();
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}