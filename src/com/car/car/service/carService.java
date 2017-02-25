/**
 * 
 */
package com.car.car.service;

import java.util.List;

import com.car.car.model.cars;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:26:50 
 */
public interface carService {
	//通过用户id获取该用户所有的期初信息
		public List<cars> getAllCar(int nickNameid);
		//通过用户id删除用户的车辆
		public void deletedOne(int id);
		//通过id增加一辆车辆
		public void addOne(cars q);
		//根据一个车辆的id修改某个车辆信息
		public void changeone(cars t);

}
