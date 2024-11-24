package structuraldata;

public class Account {
	private int debt = 0;
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
	}
	private boolean validatePassword (String pw) {
		return (password == pw );
	}
	
}
