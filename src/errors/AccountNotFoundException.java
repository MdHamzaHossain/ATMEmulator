package errors;

public class AccountNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException(int id) {
	    super("No Account Found with the ID: " + id);
	  }
}
