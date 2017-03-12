/**
 * 
 */
package com.car.assest.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.assest.Dao.assestDao;
import com.car.assest.model.Assest;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:00:56 
 */
@Service
public class assestServiceImpl implements assestService{

	@Resource
	assestDao assdao;

	/* (non-Javadoc)
	 * @see com.car.assest.service.assestService#getall(int)
	 */
	@Override
	public Assest getall(int userId) {
		
		return assdao.getall(userId);
	}
}
