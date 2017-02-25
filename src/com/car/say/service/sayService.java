/**
 * 
 */
package com.car.say.service;

import java.util.List;

import com.car.say.model.saying;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:34:41 
 */
public interface sayService {

	/**
	 * 
	 */
	void setSaying(saying s);

	/**
	 * @return
	 */
	List<saying> getSaying();

}
