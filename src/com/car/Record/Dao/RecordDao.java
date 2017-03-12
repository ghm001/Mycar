/**
 * 
 */
package com.car.Record.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.Record.model.recoed;
import com.car.assest.model.Assest;
import com.car.utils.annotation.mybatis.MyBatisScan;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:25:35 
 */
@MyBatisScan
@Repository
public interface RecordDao {

	/**
	 * @param re
	 */
	void setsurence(recoed re);

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
