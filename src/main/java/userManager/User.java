package userManager;


import java.util.Objects;

public class User {

	private int id;
	private String password;
	private String lastname;
	private String firstname;
	
	public User() {}
	public User(int id, String password, String lastName, String firstName) {
		this.id = id;
		this.password = password;
		this.lastname = lastName;
		this.firstname = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public boolean verifIdentity(String password) {
		Objects.requireNonNull(password);
		if (this.password.equals(password)) {
			return true;
		}
		return false;
	}
	
}
