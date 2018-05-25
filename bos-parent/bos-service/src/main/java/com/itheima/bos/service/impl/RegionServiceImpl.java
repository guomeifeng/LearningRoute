package com.itheima.bos.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.base.IRegionDao;
import com.itheima.bos.domain.Region;
import com.itheima.bos.service.IRegionService;
import com.itheima.bos.utils.PageBean;
@Service
@Transactional
public class RegionServiceImpl implements IRegionService {
	@Autowired
	private IRegionDao regionDao;
	@Override
	public void importXls(File regionFile) throws FileNotFoundException, IOException {
		List<Region> list = new ArrayList<Region>();
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(regionFile));
		HSSFSheet worksheet = workbook.getSheet("Sheet1");
		for (Row row:worksheet) {
			if (row.getRowNum()==0) {
				continue;
			}
			String id = row.getCell(0).getStringCellValue();
			String province = row.getCell(1).getStringCellValue();
			String city = row.getCell(2).getStringCellValue();
			String district = row.getCell(3).getStringCellValue();
			String postcode = row.getCell(4).getStringCellValue();
			Region region = new Region(id, province, city, district, postcode, null, null, null);
			//regionDao.add(region);//一条一条记录保存到数据库
			list.add(region);
			}
		
		for (Region region:list) {
			regionDao.saveOrUpdate(region);
		}
	}
	@Override
	public void pageQuery(PageBean pageBean) {
		regionDao.pageQuery(pageBean);
		
	}
	@Override
	public void addRegion(Region model) {
		regionDao.add(model);
		
	}
	@Override
	public void editRegion(Region model) {
		Region region = regionDao.findById(model.getId());
		region.setProvince(model.getProvince());
		region.setCity(model.getCity());
		region.setCitycode(model.getCitycode());
		region.setDistrict(model.getDistrict());
		region.setPostcode(model.getPostcode());
		region.setShortcode(model.getShortcode());
		region.setSubareas(model.getSubareas());
		regionDao.update(region);
		
	}
	@Override
	public void deleteRegion(String ids) {
		if (StringUtils.isNotBlank(ids)) {
			String[] idArray = ids.split(",");
			for (String id:idArray) {
				regionDao.executeUpdate("region.deleteById",id);
			}
		}
		
	}
	@Override
	public List<Region> findAll() {
		return regionDao.findAll();
	}
	@Override
	public List<Region> findRegionByQ(String q) {
		return regionDao.findRegionByQ(q);
	}

}
