
public class User {
	
	private int userId;
	private String userName;
	private String userPassword;
	private String userMail;
	
	
	public User(int userId, String userName, String userPassword, String userMail) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userMail = userMail;
	}


	public User() {
		
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserMail() {
		return userMail;
	}


	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	

}
