package j09_클래스2.User;

public class User {
	
	private String Username;
	private int password;
	private String name;
	private String email;
	
	public User() {}

	public User(String username, int password, String name, String email) {
		super();
		Username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Username=" + Username + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

	








}
