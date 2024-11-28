package errors;

public class WrongPasswordException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongPasswordException() {
	    super("Wrong Password For That ID");
	  }
}