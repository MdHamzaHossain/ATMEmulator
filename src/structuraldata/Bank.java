package structuraldata;

import java.util.ArrayList;
import errors.MyException;
import gui.MainPage;

public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>(3000);
	private int budget = 10000;
	
	
	
	public Bank() {
		new MainPage(this);
	}
	public Account createAccount(String n, String p, String em, String add) {
		Account acc = new Account(n,p, em, add, this);
		int id =  this.accounts.size();
		acc.id = id;
		this.accounts.add(acc);
		return acc;
		
	}
	public static void main(String[] args) {
		new Bank();
	}
	public boolean transfer(int accId, String accPass, int recId, int amount) throws MyException{
		
		Account acc1  = findAccount(accId),
				acc2 = findAccount(recId);
		acc1.validatePassword(accPass);
		acc1.validateBalance(amount);
		acc1.balance -= amount;
		acc2.balance += amount;
		return true;
		
	}
	public boolean takeLoan(int accId, String accPass, int amount) throws MyException, Exception {
		Account acc1  = findAccount(accId);
		acc1.validatePassword(accPass);
		validateBudget(amount);
		this.budget -= amount;
		acc1.debt += amount;
		acc1.balance += amount;
		return true;
		

	}
	
	public void validateBudget(int amount) throws MyException {
		if(amount > budget) throw new MyException("We can't loan you that amount as we only have " + budget);
	}
	public Account findAccount(int accId) throws MyException {
		Account acc;
		try {
		acc = accounts.get(accId);
		if(acc == null ) throw new MyException("Account with ID: "+ accId + " doesn't exist");
		} catch (Exception e) {
			throw new MyException("Account with ID: "+ accId + " doesn't exist");
		}
		return acc;
		
	}
	
}
