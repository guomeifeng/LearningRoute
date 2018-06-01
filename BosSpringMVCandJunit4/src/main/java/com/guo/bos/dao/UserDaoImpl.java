package com.guo.bos.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.guo.bos.model.User;

@Repository
@Transactional 
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

	public User findUserByUsernameAndPassword(String username, String password) {
		String hql = "FROM User u WHERE u.username = ? AND u.password = ?";
		List<User> userlist = (List<User>) this.getHibernateTemplate().find(hql,username,password);
		
		if (userlist != null && userlist.size() > 0) {
			return userlist.get(0);
		}
		return null;
		
		
	}

}
