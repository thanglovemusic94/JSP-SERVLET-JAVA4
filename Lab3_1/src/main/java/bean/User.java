package bean;

public class User {
	private String useame;
	private String password;
	private String lastname;
	private boolean isadmin;

	public User() {
	}

	public User(String useame, String password) {
		this.useame = useame;
		this.password = password;
	}

	public String getUseame() {
		return useame;
	}

	public void setUseame(String useame) {
		this.useame = useame;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

}
