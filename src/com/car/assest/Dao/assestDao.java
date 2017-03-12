/**
 * 
 */
package com.car.assest.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.assest.model.Assest;
import com.car.utils.annotation.mybatis.MyBatisScan;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:24:23 
 */
@MyBatisScan
@Repository
public interface assestDao {

	/**
	 * @param userId
	 * @return
	 */
	Assest getall(int userId);

}
