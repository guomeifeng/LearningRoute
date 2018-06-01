package com.guo.bos.dao;

import java.io.Serializable;
import java.util.List;

import com.guo.bos.utils.PageBean;

/**
 * 持久层
 * @author KellyGuo
 *
 * @param <T>
 */
public interface IBaseDao<T> {
	public void add(T entity);
	public void delete(T entity);
	public void update(T entity);
	public void saveOrUpdate(T entity);
	public T findById(Serializable id);
	public List<T> findAll();
	public Integer executeUpdate(String queryName, Object...objects);
	public void pageQuery(PageBean pageBean);
	

}
