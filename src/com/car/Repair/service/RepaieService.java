/**
 * 
 */
package com.car.Repair.service;

import java.util.List;

import com.car.Record.model.recoed;
import com.car.Repair.model.repair;
import com.car.assest.model.Assest;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:32:38 
 */
public interface RepaieService {

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
	void seleteOne(int id);

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
