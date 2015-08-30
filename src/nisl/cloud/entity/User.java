package nisl.cloud.entity;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;


@SuppressWarnings("serial")
public class User implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private Set apps = new HashSet();
	private Set providers = new HashSet();

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getApps() {
		return apps;
	}

	public void setApps(Set apps) {
		this.apps = apps;
	}

	public Set getProviders() {
		return providers;
	}

	public void setProviders(Set providers) {
		this.providers = providers;
	}
	
}