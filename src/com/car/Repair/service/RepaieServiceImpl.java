/**
 * 
 */
package com.car.Repair.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.Repair.Dao.RepairDao;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:46:49 
 */
@Service
public class RepaieServiceImpl implements RepaieService {

	@Resource
	RepairDao repadao;
}
