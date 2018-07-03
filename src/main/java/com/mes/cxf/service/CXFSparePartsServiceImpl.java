package com.mes.cxf.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mes.cxf.bean.SpareParts;
import com.mes.cxf.dao.SparePartsDao;

@Component("CXFSparePartsService")
@WebService(endpointInterface = "com.mes.cxf.service.CXFSparePartsService", serviceName = "spareParts")
public class CXFSparePartsServiceImpl implements CXFSparePartsService {
	@Autowired
	private SparePartsDao sparePartsDao;
	public void setSparePartsDao(SparePartsDao sparePartsDao) {
		this.sparePartsDao = sparePartsDao;
	}
	
	@Override
	public int sayHello(SpareParts spareParts) {
		Integer result=sparePartsDao.getListCount(spareParts);
		List<SpareParts> result2=sparePartsDao.selectAll();
		for(SpareParts a:result2){
			System.out.println("hhhhhhhhhhhhhhhhhhhhhh"+a.getDescription());
		}
		
		return result;
	}
}
