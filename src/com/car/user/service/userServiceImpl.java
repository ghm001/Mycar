/**
 * 
 */
package com.car.user.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.user.Dao.UserDao;
import com.car.user.model.userinfo;

/**
 * @author gaohongming
 * 创建时间：2017年2月13日 下午3:13:32 
 */
@Service
public class userServiceImpl implements userService{

	@Resource
	UserDao userdao;
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#RegistUserByQQ(java.lang.String)
	 */

	@Transactional
	public int RegistUserByQQ(userinfo user) {
		int num=0;
		num=userdao.RegistUserByQQ(user);
		return num;
	}
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#RegisterByusername(com.car.user.model.userinfo)
	 */
	@Transactional
	public int RegisterByusername(userinfo u) {	
		int num=0;
		num=userdao.RegisterByusername(u);
		return num;
	}
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#RegistBySina(com.car.user.model.userinfo)
	 */
	@Transactional
	public int RegistBySina(userinfo u) {	
		int num=0;
		num=userdao.RegistBySina(u);
		return num;
	}
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#JudegUser(com.car.user.model.userinfo)
	 */
	@Override
	public userinfo JudegUser(userinfo u) {
		return userdao.JudegUser(u);
	}
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#ChangeLongloginflag(int)
	 */
	@Override
	public void ChangeLongloginflag(Map<String, Integer> flag) {
		userdao.ChangeLongloginflag(flag);
	}
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#ChangePassWord(int)
	 */
	@Override
	public int ChangePassWord(userinfo u) {
		return userdao.ChangePassWord(u);
	}
	/* (non-Javadoc)
	 * @see com.car.user.service.userService#changeuserinfo(com.car.user.model.userinfo)
	 */
	@Override
	public int changeuserinfo(userinfo u) {
		return userdao.changeuserinfo(u);
	}

}
