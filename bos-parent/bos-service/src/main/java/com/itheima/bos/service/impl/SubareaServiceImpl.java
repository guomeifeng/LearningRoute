package com.itheima.bos.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.dao.base.ISubareaDao;
import com.itheima.bos.domain.Decidedzone;
import com.itheima.bos.domain.Region;
import com.itheima.bos.domain.Subarea;
import com.itheima.bos.service.ISubareaService;
import com.itheima.bos.utils.FileUtils;
import com.itheima.bos.utils.PageBean;

@Service
@Transactional
public class SubareaServiceImpl implements ISubareaService {
	@Autowired
	private ISubareaDao subareaDao;

	@Override
	public void add(Subarea model) {
		subareaDao.add(model);
		
	}

	@Override
	public void pageQuery(PageBean pageBean) {
		subareaDao.pageQuery(pageBean);
		
	}

	@Override
	public void deleteRegion(String ids) {
		if (StringUtils.isNotBlank(ids)) {
			String[] idArray = ids.split(",");
			for (String id:idArray) {
				subareaDao.executeUpdate("subarea.deleteById",id);
			}
		}
	}

	@Override
	public void edit(Subarea model) {
		subareaDao.update(model);
		
	}

	@Override
	public void importXls(File subareaFile) throws FileNotFoundException, IOException {
		List<Subarea> list = new ArrayList<Subarea>();
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(subareaFile));
		HSSFSheet worksheet = workbook.getSheet("Sheet1");
		for (Row row:worksheet) {
			if (row.getRowNum()==0) {
				continue;
			}
			//String id = row.getCell(0).getStringCellValue();
			String decidedzone = row.getCell(0).getStringCellValue();
			Region region = new Region(row.getCell(1).getStringCellValue());
			String addresskey = row.getCell(2).getStringCellValue();
			String startnum = row.getCell(3).getStringCellValue();
			String endnum = row.getCell(4).getStringCellValue();
			Character single = null;
			if (row.getCell(5).getStringCellValue()!=null) {
				single = row.getCell(5).getStringCellValue().toCharArray()[0];
			}else {
				
			}
			String position = row.getCell(6).getStringCellValue();
			Subarea subarea = new Subarea(null, decidedzone, region, addresskey, 
					startnum, endnum, single, position);
			//regionDao.add(region);//一条一条记录保存到数据库
			list.add(subarea);
			}
		
		for (Subarea subarea:list) {
			subareaDao.saveOrUpdate(subarea);
		}

		
	}

	@Override
	public void exportXls() throws IOException {
		//第一步：查询所有的分区数据
		List<Subarea> list = subareaDao.findAll();
		
		//第二步：使用POI将数据写到Excel文件中
		//在内存中创建一个Excel文件
		HSSFWorkbook workbook = new HSSFWorkbook();
		//创建一个标签页
		HSSFSheet sheet = workbook.createSheet("分区数据");
		//创建标题行
		HSSFRow headRow = sheet.createRow(0);
		headRow.createCell(0).setCellValue("分区编号");
		headRow.createCell(1).setCellValue("开始编号");
		headRow.createCell(2).setCellValue("结束编号");
		headRow.createCell(3).setCellValue("位置信息");
		headRow.createCell(4).setCellValue("省市区");
		
		for (Subarea subarea : list) {
			HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
			dataRow.createCell(0).setCellValue(subarea.getId());
			dataRow.createCell(1).setCellValue(subarea.getStartnum());
			dataRow.createCell(2).setCellValue(subarea.getEndnum());
			dataRow.createCell(3).setCellValue(subarea.getPosition());
			dataRow.createCell(4).setCellValue(subarea.getRegion().getName());
		}
		
		//第三步：使用输出流进行文件下载（一个流、两个头）
		
		String filename = "分区数据.xls";
		String contentType = ServletActionContext.getServletContext().getMimeType(filename);
		javax.servlet.ServletOutputStream out = ServletActionContext.getResponse().getOutputStream();
		ServletActionContext.getResponse().setContentType(contentType);
		
		//获取客户端浏览器类型
		String agent = ServletActionContext.getRequest().getHeader("User-Agent");
		filename = FileUtils.encodeDownloadFilename(filename, agent);
		ServletActionContext.getResponse().setHeader("content-disposition", "attachment;filename="+filename);
		workbook.write(out);
		
		
	}
}
