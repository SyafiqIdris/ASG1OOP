public class Registration {

	private int id;
	private String username;
	private String password;
	private String membership;
	
	Registration(){
		id = 0;
		username = "";
		password = "";
		membership = "";
	}
	
	public Registration (int newId, String newUsername, String newPassword, String newMembership) {
		id = newId;
		username = newUsername;
		password = newPassword;
		membership = newMembership;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setUsername(String newUsername) {
		username = newUsername;
	}
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	
	public void setMembership(String newMembership) {
		membership = newMembership;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getMembership() {
		return membership;
	}
	
	public String toString() {
		return "Customer ID: " + getId() + "\n" + "Username: " + getUsername() + "\n" + "Password: " + getPassword() + "\n" + "Membership status: " + getMembership();
	}
	
	public String getBorder() {
		return "---------------------------------------------------";
	}
}