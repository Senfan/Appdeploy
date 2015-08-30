package nisl.cloud.action;


import nisl.cloud.entity.User;
import nisl.cloud.service.LoginService;
import nisl.cloud.service.LoginService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String userName;
	private String passWord;
	
	LoginService loginService;

	public String login() throws Exception {
		User usr = loginService.checkLogin(userName, passWord);
		if(usr!=null){
			ActionContext.getContext().getSession().put("usr",usr);
			return this.SUCCESS;
		}
		return this.ERROR;
	}
	
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("usr");
		ActionContext.getContext().getSession().clear();
		return this.SUCCESS;
	}
	
	public void setLoginBO(LoginService loginService) {
		this.loginService = loginService;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
