package nisl.cloud.dao;

import java.util.List;

import nisl.cloud.dao.LoginDAO;
import nisl.cloud.entity.User;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class LoginDAO {

	HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public User login(String userName, String passWord) throws Exception {
		List<User> list = getHibernateTemplate().find(
				"from User as u where u.username = ? and u.password = ?", 
				new Object[] { userName, passWord });
		if (list.size() == 1)
			return list.get(0);
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
