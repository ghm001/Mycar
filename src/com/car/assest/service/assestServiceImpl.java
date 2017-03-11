/**
 * 
 */
package com.car.assest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.assest.Dao.assestDao;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:00:56 
 */
@Service
public class assestServiceImpl implements assestService{

	@Resource
	assestDao assdao;
}
