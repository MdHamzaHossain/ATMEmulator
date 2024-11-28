package errors;

import structuraldata.Account;

public class NotEnoughBalanceException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotEnoughBalanceException(Account acc) {
	    super("Your account doesn't have enough balance, current balance: " + acc.balance);
	  }
}
