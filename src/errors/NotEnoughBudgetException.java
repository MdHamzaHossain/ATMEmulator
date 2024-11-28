package errors;

public class NotEnoughBudgetException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotEnoughBudgetException() {
	    super("You can't loan that much money");
	  }
}
