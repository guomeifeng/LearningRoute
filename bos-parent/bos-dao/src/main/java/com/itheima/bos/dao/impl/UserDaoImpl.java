package com.itheima.bos.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.itheima.bos.dao.base.IUserDao;
import com.itheima.bos.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		String hql = "FROM User u WHERE u.username = ? AND u.password = ?";
		List<User> userlist = (List<User>) this.getHibernateTemplate().find(hql,username,password);
		
		if (userlist != null && userlist.size() > 0) {
			return userlist.get(0);
		}
		return null;
		
		
	}

}
