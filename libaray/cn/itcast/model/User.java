package cn.itcast.model;


//�û���
public class User {

	private	String userName;
	
	private	String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName , String password) {
		this.userName = userName;
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�û���"+ this.userName +" ���룺"+ this.password;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
