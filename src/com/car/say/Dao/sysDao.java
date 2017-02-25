/**
 * 
 */
package com.car.say.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.say.model.saying;
import com.car.utils.annotation.mybatis.MyBatisScan;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:33:47 
 */
@MyBatisScan
@Repository
public interface sysDao {

	/**
	 * @param s
	 */
	public void setSaying(saying s);

	/**
	 * @return
	 */
	public List<saying> getSaying();
	

}
