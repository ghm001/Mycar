/**
 * 
 */
package com.car.say.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.say.Dao.sysDao;
import com.car.say.model.saying;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:35:01 
 */
@Service
public class sayServiceImpl implements sayService{

	@Resource
	sysDao sysdao;
	/* (non-Javadoc)
	 * @see com.car.say.service.sayService#setSaying(com.car.say.model.saying)
	 */
	@Transactional
	@Override
	public void setSaying(saying s) {
        sysdao.setSaying(s);

		
	}
	/* (non-Javadoc)
	 * @see com.car.say.service.sayService#getSaying()
	 */
	@Override
	public List<saying> getSaying() {
		// TODO Auto-generated method stub
		return sysdao.getSaying();
	}

}
