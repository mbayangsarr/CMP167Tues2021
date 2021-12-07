import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

// work on bank office and bank class to implement the savingaccount class that you have been created.
public class Bank {
//public int code;
public String address;
private String name;
//private ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();

private HashMap<String, CheckingAccount> accountsWithOwner = new HashMapString,CheckingAccount>();


public Bank(String name, String address) {
	this.address = address;
	this.name = name;
	System.out.println("Bank has been created");
}
public void openCheckingAcct(String owner) {
	
	CheckingAccount acct = new CheckingAccount();
	accountsWithOwner.put(owner,acct);
	//checkingAccountList.add(acct);
	System.out.println("Account #"+acct.number + "has been created");
	
}
public void displayAllAccts() {
	for (Entry<String,CheckingAccount> entry  :accountsWithOwner.entrySet) {
		System.out.println("Owner :"+ entry.getkey() + "Account "+ entry.getValue().toString());
		
		
		
	}
	
	
}
public void depositMoney(String owner, double account) {
	if(accountsWithOwner.containsKey(owner)) {
		accountsWithOwner.get(owner).deposit(amount);
		
	}else {
		System.out.println("User not found");
		
	}
}
@Override
public String toString() {
	//public String toString() {
		return "Bank" + name + "address" + "number of clients"+ accountsWithOwner.size();
		
	}
}
