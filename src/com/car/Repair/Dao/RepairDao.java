/**
 * 
 */
package com.car.Repair.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.Record.model.recoed;
import com.car.Repair.model.repair;
import com.car.assest.model.Assest;
import com.car.utils.annotation.mybatis.MyBatisScan;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:26:15 
 */
@MyBatisScan
@Repository
public interface RepairDao {

	/**
	 * @param re
	 */
	void addOne(repair re);

	/**
	 * @param id
	 * @return
	 */
	List<repair> getall(int id);

	/**
	 * @param id
	 */
	void deleteOne(int id);

	/**
	 * @param id
	 */
	void changestate(int id);

	/**
	 * @param re
	 */
	void addReoair(recoed re);

	/**
	 * @param assert1
	 */
	void addmoney(Assest assert1);

}
