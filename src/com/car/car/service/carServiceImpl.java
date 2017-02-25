/**
 * 
 */
package com.car.car.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.car.Dao.carDao;
import com.car.car.model.cars;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:27:17 
 */
@Service
public class carServiceImpl implements carService{

	@Resource
	 carDao cardao;
	
	@Transactional
	public List<cars> getAllCar(int nickNameid) {
		return cardao.getAllCar(nickNameid);
	}

	@Transactional
	public void deletedOne(int id) {
	  cardao.deletedOne(id);
	}

	
	@Transactional
	public void addOne(cars q) {
		cardao.addOne(q);
	}

	@Transactional
	public void changeone(cars t) {
		cardao.changeone(t);
	}

}
