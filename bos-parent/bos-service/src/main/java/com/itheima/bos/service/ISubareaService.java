package com.itheima.bos.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.itheima.bos.domain.Subarea;
import com.itheima.bos.utils.PageBean;

public interface ISubareaService {

	void add(Subarea model);

	void pageQuery(PageBean pageBean);

	void deleteRegion(String ids);

	void edit(Subarea model);

	void importXls(File subareaFile) throws FileNotFoundException, IOException;

	void exportXls() throws IOException;

}
