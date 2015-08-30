package nisl.cloud.entity;

public class Vm {
	
	//Fields
	private Integer vmid;
	private Integer provid;
	private Integer appid;
	private Integer flavid;
	
	//Getter and Setter
	public Integer getVmid() {
		return vmid;
	}
	public void setVmid(Integer vmid) {
		this.vmid = vmid;
	}
	public Integer getProvid() {
		return provid;
	}
	public void setProvid(Integer provid) {
		this.provid = provid;
	}
	public Integer getAppid() {
		return appid;
	}
	public void setAppid(Integer appid) {
		this.appid = appid;
	}
	public Integer getFlavid() {
		return flavid;
	}
	public void setFlavid(Integer flavid) {
		this.flavid = flavid;
	}
	
}
