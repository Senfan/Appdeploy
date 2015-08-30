package nisl.cloud.entity;

public class App {
	
	//Fields
	private Integer appid;
	private String name;
	private String username;
	private Integer vmcnt;
	
	//Getter and Setter
	
	public Integer getAppid() {
		return appid;
	}
	public void setAppid(Integer appid) {
		this.appid = appid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getVmcnt() {
		return vmcnt;
	}
	public void setVmcnt(Integer vmcnt) {
		this.vmcnt = vmcnt;
	}
}
