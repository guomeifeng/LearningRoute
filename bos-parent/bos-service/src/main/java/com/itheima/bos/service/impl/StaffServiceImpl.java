package com.itheima.bos.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.base.IStaffDao;
import com.itheima.bos.domain.Staff;
import com.itheima.bos.service.IStaffService;
import com.itheima.bos.utils.PageBean;
@Transactional
@Service
public class StaffServiceImpl implements IStaffService {
	@Autowired
	private IStaffDao staffDao;
	@Override
	public void addStaff(Staff staff) {
		
		staffDao.add(staff);
	}
	@Override
	public void pageQuery(PageBean pageBean) {
		staffDao.pageQuery(pageBean);
		
	}
	@Override
	public void deleteByBatch(String ids) {
		if (StringUtils.isNotBlank(ids)) {
			String[] idlist = ids.split(",");
			for (String id : idlist) {
				staffDao.executeUpdate("staff.updateDeltag", 'X', id);
			}
		}
	
	}
	@Override
	public void restoreByBatch(String ids) {
		if (StringUtils.isNotBlank(ids)) {
			String[] idlist = ids.split(",");
			for (String id : idlist) {
				staffDao.executeUpdate("staff.updateDeltag", null, id);
			}
		}
		
	}
	@Override
	public void editStaff(Staff model){
		Staff staff = staffDao.findById(model.getId());
		staff.setName(model.getName());
		staff.setHaspda(model.getHaspda());
		staff.setStandard(model.getStandard());
		staff.setStation(model.getStation());
		staff.setTelephone(model.getTelephone());
		staffDao.update(staff);
		
	}

}
