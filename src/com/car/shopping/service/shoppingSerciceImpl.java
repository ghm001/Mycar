/**
 * 
 */
package com.car.shopping.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.shopping.Dao.shoppingDao;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:47:49 
 */
@Service
public class shoppingSerciceImpl implements shoppingSercice {

	@Resource
	shoppingDao shopdao;
}
