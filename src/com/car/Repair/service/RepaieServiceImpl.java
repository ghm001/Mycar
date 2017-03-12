/**
 * 
 */
package com.car.Repair.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.Record.model.recoed;
import com.car.Repair.Dao.RepairDao;
import com.car.Repair.model.repair;
import com.car.assest.model.Assest;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:46:49 
 */
@Service
public class RepaieServiceImpl implements RepaieService {

	@Resource
	RepairDao repadao;

	/* (non-Javadoc)
	 * @see com.car.Repair.service.RepaieService#addOne(com.car.Repair.model.repair)
	 */
	@Override
	public void addOne(repair re) {
		repadao.addOne(re);
		
	}

	/* (non-Javadoc)
	 * @see com.car.Repair.service.RepaieService#getall(int)
	 */
	@Override
	public List<repair> getall(int id) {
		// TODO Auto-generated method stub
		return repadao.getall(id);
	}

	/* (non-Javadoc)
	 * @see com.car.Repair.service.RepaieService#seleteOne(int)
	 */
	@Override
	public void seleteOne(int id) {
		repadao.deleteOne(id);
	}

	/* (non-Javadoc)
	 * @see com.car.Repair.service.RepaieService#changestate(int)
	 */
	@Override
	public void changestate(int id) {
		// TODO Auto-generated method stub
		repadao.changestate(id);
	}

	/* (non-Javadoc)
	 * @see com.car.Repair.service.RepaieService#addReoair(com.car.Record.model.recoed)
	 */
	@Override
	public void addReoair(recoed re) {
		
		repadao.addReoair(re);
	}

	/* (non-Javadoc)
	 * @see com.car.Repair.service.RepaieService#addmoney(com.car.assest.model.Assest)
	 */
	@Override
	public void addmoney(Assest assert1) {
		repadao.addmoney(assert1);
		
	}

	
}
