package com.itheima.bos.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.Entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.utils.PageBean;

/**
 * 持久层通用实现
 * @author KellyGuo
 *
 * @param <T>
 */

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {
	Class<T> entityClass;

	@Resource
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public BaseDaoImpl() {
		ParameterizedType superClass = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = superClass.getActualTypeArguments();
		entityClass = (Class<T>) actualTypeArguments[0];
	}

	
	
	@Override
	public void add(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	@Override
	public void delete(T entity) {
		this.getHibernateTemplate().delete(entity);
		
	}

	@Override
	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
		
	}



	@Override
	public List<T> findAll() {
		String Hql = "FROM "+ entityClass.getSimpleName();
		return (List<T>) this.getHibernateTemplate().find(Hql);
	}

	@Override
	public T findById(Serializable id) {		
		return this.getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public void pageQuery(PageBean pageBean) {
		int currentPage = pageBean.getCurrentPage();
		Integer pageSize = pageBean.getPageSize();
		DetachedCriteria detachedCriteria = pageBean.getDetachedCriteria();
		//总记录数
		detachedCriteria.setProjection(Projections.rowCount());
		List<Long> total = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
		pageBean.setTotal(total.get(0).longValue());
		//条目列表		
		detachedCriteria.setProjection(null);
		List rows = this.getHibernateTemplate().findByCriteria(detachedCriteria, (currentPage - 1)*pageSize, pageSize);
		pageBean.setRows(rows);
	}

	/**
	 * 执行任何更新，删除
	 */
	@Override
	public Integer executeUpdate(String queryName, Object... objects) {
		Session currentSession = this.getSessionFactory().getCurrentSession();
		Query query = currentSession.getNamedQuery(queryName);
		int i = 0;
		for (Object object:objects) {
			query.setParameter(i++,object);
		}
		return query.executeUpdate();
	}

	@Override
	public void saveOrUpdate(T entity) {
		this.getHibernateTemplate().saveOrUpdate(entity);
		
	}




}
