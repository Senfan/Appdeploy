package nisl.cloud.entity;

public class UserProvider {
	private String upid;
	private String username;
	private int provid;
	private String account;
	private String password;
	
	//getter and setter
	public String getUpid() {
		return upid;
	}
	public void setUpid(String upid) {
		this.upid = upid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getProvid() {
		return provid;
	}
	public void setProvid(int provid) {
		this.provid = provid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
