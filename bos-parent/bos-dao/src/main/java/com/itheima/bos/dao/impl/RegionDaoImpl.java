package com.itheima.bos.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itheima.bos.dao.base.IRegionDao;
import com.itheima.bos.domain.Region;
import com.itheima.bos.utils.PageBean;
@Repository
public class RegionDaoImpl extends BaseDaoImpl<Region> implements IRegionDao {

	@Override
	public List<Region> findRegionByQ(String q) {
		
		String Hql = "FROM Region r WHERE shortcode LIKE ? OR citycode LIKE ? OR province LIKE ? OR city LIKE ? OR district LIKE ?";
		return (List<Region>) this.getHibernateTemplate().find(Hql, "%"+q+"%","%"+q+"%","%"+q+"%","%"+q+"%","%"+q+"%");
	}

}
