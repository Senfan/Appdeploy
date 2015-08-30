package nisl.cloud.entity;


public class Flavor {
	
	private int flavid;
	private String name;
	private int memory;
	private int vcpus;
	private int disk;
	
	public int getFlavid() {
		return flavid;
	}
	public void setFlavid(int flavid) {
		this.flavid = flavid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getVcpus() {
		return vcpus;
	}
	public void setVcpus(int vcpus) {
		this.vcpus = vcpus;
	}
	public int getDisk() {
		return disk;
	}
	public void setDisk(int disk) {
		this.disk = disk;
	}

}
