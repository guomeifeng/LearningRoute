package com.itheima.bos.web.action.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.bos.domain.Subarea;
import com.itheima.bos.service.ISubareaService;
import com.itheima.bos.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class SubareaAction extends BaseAction<Subarea> {
	@Autowired
	private ISubareaService subareaService;
	
	public String add() {
		subareaService.add(model);
		return LIST;
	}
	public String pageQuery() {		
		subareaService.pageQuery(pageBean);		
		this.json2String(pageBean, new String[] {"currentPage","pageSize","detachedCriteria","subareas"});
		return NONE;
	}
	private String ids;
	private File subareaFile;
	public File getSubareaFile() {
		return subareaFile;
	}
	public void setSubareaFile(File subareaFile) {
		this.subareaFile = subareaFile;
	}
	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	public String deleteSubarea() {
		subareaService.deleteRegion(ids);
		return LIST;
	}
	
	public String edit() {
		subareaService.edit(model);
		return LIST;
	}
	public String importXls() throws FileNotFoundException, IOException {
		subareaService.importXls(subareaFile);		
		return LIST;
	}
	/**
	 * 分区数据导出功能
	 * @throws IOException 
	 */
	public String exportXls() throws IOException{
		subareaService.exportXls();
		return NONE;
	}
}
