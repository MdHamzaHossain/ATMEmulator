package structuraldata;

import errors.MyException;
import errors.NotEnoughBalanceException;
import errors.WrongPasswordException;

public class Account {
	public int debt = 0;
	public int id;
	public int balance=0;
	private String password;
	public String name;
	public String email;
	public String address;
	public Bank bank;
	public Account (String n, String p, String e, String a, Bank b) {
		name=n;
		password=p;
		email=e;
		address=a;
		bank = b;
		balance = 100;
	}
	public void validatePassword (String pw) throws MyException {

		if  (!password.equals(pw)) throw new MyException("Enter the valid password!");
		
	}
	public void validateBalance(int amount) throws MyException{
		if(amount > balance) throw new MyException("Your balance in insufficient. Balance: " + this.balance);
		
	}
	
}
