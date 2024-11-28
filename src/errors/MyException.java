package errors;

public class MyException extends Error {

	private static final long serialVersionUID = 1L;
	public MyException(String message) {
		super(message);
	}
}
