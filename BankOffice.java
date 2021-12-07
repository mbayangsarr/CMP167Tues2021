import java.util.Scanner;

public class BankOffice {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome");
		System.out.println("Enter a name for the bank");
		String bankName = input.nextLine();
		Bank bank = new Bank(bankName, bankAddress);
		while (true) {
			String answer;
			System.out.println("Do you want to open an account?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				bank.openCheckingAcct();
				
			}else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		while(true) {
			System.out.println("Do you to display all accounts");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				bank.displayAllAccts();
				
			}else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
				
			
		}
		
	}
		while(true) {
			System.out.println("Would you like to find an account's info");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				bank.displayAllAccts();
				
			}else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
				
		while(true) {
		System.out.println("Do you to display all accounts");
		answer = input.nextLine().toLowerCase();
		if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
			bank.displayAllAccts();
			
		}else if (answer.equals("no")) {
			System.out.println("Alright...");
			break;
			
		}
		System.out.println("______________________________");
		System.out.println(bank);
	}

}
