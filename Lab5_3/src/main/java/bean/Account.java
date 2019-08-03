package bean;

public class Account {
	private int id;
	private String user;
	private String pass;
	private boolean isAdmin;
	
	public Account() {

	}

	public Account(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public Account(String user, String pass, boolean isAdmin) {
		this.user = user;
		this.pass = pass;
		this.isAdmin = isAdmin;
	}

	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	
}
