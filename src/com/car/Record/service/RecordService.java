/**
 * 
 */
package com.car.Record.service;

import java.util.List;

import com.car.Record.model.recoed;
import com.car.assest.model.Assest;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:32:22 
 */
public interface RecordService {

	/**
	 * @param re
	 */
	void setInsurence(recoed re);

	/**
	 * @param assest
	 */
	void addInsurance(Assest assest);

	/**
	 * @param userId
	 * @return
	 */
	List<Object> getallRecord(int userId);

	/**
	 * @param id
	 */
	void deleteOne(int id);

}
