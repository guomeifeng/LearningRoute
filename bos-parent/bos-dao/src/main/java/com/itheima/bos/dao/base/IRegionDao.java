package com.itheima.bos.dao.base;

import java.util.List;

import com.itheima.bos.domain.Region;

public interface IRegionDao extends IBaseDao<Region> {

	List<Region> findRegionByQ(String q);

}
