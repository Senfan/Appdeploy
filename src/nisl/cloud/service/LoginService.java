package nisl.cloud.service;

import nisl.cloud.dao.*;
import nisl.cloud.entity.User;
/**
 * @author X
 * @version v1.0
 * create date 2013-3-11
 */
public class LoginService {

	private LoginDAO loginDAO;

	public User checkLogin(String userName, String passWord) {
		try{
			User usr = loginDAO.login(userName, passWord);
			if (usr!=null) 
				return usr;
		}catch(Exception e){
			System.out.print(e);
			System.out.println("µÇÂ¼Ê§°Ü£¡");			
		}
		return null;
	}
	
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
}
