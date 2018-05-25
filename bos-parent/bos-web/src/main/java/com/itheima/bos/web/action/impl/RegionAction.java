package com.itheima.bos.web.action.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.bos.domain.Region;
import com.itheima.bos.service.IRegionService;
import com.itheima.bos.web.action.base.BaseAction;
@Controller
@Scope("prototype")
public class RegionAction extends BaseAction<Region> {
	private File regionFile;
	@Autowired
	private IRegionService regionService;
	
	public String addRegion() {
		regionService.addRegion(model);
		return LIST;
	}
	
	public String editRegion() {
		regionService.editRegion(model);
		return LIST;
	}
	private String ids;
	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String deleteRegion() {
		regionService.deleteRegion(ids);
		return LIST;
	}
	public String importXls() throws FileNotFoundException, IOException {
		regionService.importXls(regionFile);		
		return LIST;
	}

	public String pageQuery() {		
		
		regionService.pageQuery(pageBean);		
		this.json2String(pageBean, new String[] {"currentPage","pageSize","detachedCriteria","subareas"});
		return NONE;
	}
	public void setRegionFile(File regionFile) {
		this.regionFile = regionFile;
	}
	private String q;
	public String listAjax() {
		
		List<Region> list = null;
		if (StringUtils.isNotBlank(q)) {
			list = regionService.findRegionByQ(q);
		}else {
			list = regionService.findAll();
		}
		this.json2String(list, new String[] {"subareas"});
		return NONE;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}
}
