package errors;

public class WrongInputException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongInputException() {
	    super("Please enter valid information");
	  }
}
