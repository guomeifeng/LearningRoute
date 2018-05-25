package com.itheima.bos.service;

import com.itheima.bos.domain.Staff;
import com.itheima.bos.utils.PageBean;

public interface IStaffService {

	void addStaff(Staff staff);

	void pageQuery(PageBean pageBean);

	void deleteByBatch(String ids);

	void restoreByBatch(String ids);

	void editStaff(Staff model);

}
