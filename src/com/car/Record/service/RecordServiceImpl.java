/**
 * 
 */
package com.car.Record.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.Record.Dao.RecordDao;
import com.car.Record.model.recoed;
import com.car.assest.model.Assest;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:46:06 
 */
@Service
public class RecordServiceImpl implements RecordService {

	@Resource
	RecordDao recodao;

	/* (non-Javadoc)
	 * @see com.car.Record.service.RecordService#setInsurence(com.car.Record.model.recoed)
	 */
	@Override
	public void setInsurence(recoed re) {
		recodao.setsurence(re);
		
	}

	/* (non-Javadoc)
	 * @see com.car.Record.service.RecordService#addInsurance(com.car.assest.model.Assest)
	 */
	@Override
	public void addInsurance(Assest assest) {
	  recodao.addInsurance(assest);
		
	}

	/* (non-Javadoc)
	 * @see com.car.Record.service.RecordService#getallRecord(int)
	 */
	@Override
	public List<Object> getallRecord(int userId) {
		
		return recodao.getallRecord(userId);
	}

	/* (non-Javadoc)
	 * @see com.car.Record.service.RecordService#deleteOne(int)
	 */
	@Override
	public void deleteOne(int id) {
		recodao.deleteOne(id);
	}
}
