package com.itheima.bos.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.itheima.bos.domain.Region;
import com.itheima.bos.utils.PageBean;

public interface IRegionService {

	void importXls(File regionFile) throws FileNotFoundException, IOException;

	void pageQuery(PageBean pageBean);

	void addRegion(Region model);

	void editRegion(Region model);

	void deleteRegion(String ids);

	List<Region> findAll();

	List<Region> findRegionByQ(String q);

}
