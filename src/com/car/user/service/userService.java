/**
 * 
 */
package com.car.user.service;

import java.util.Map;

import com.car.user.model.userinfo;

/**
 * @author gaohongming
 * 创建时间：2017年2月13日 下午3:12:50 
 */
public interface userService {
	/*
	 * 通过qq登陆
	 */
	public int RegistUserByQQ(userinfo user);

	/**
	 * @param u
	 * 通过用户名进行登陆
	 */
	public int RegisterByusername(userinfo u);

	/**
	 * @param u
	 * 通过新浪进行登陆
	 */
	public int RegistBySina(userinfo u);
	/*
	 * 判断用户是否存在
	 */
	public userinfo JudegUser(userinfo u);

	/**
	 * @param flag
	 */
	public void ChangeLongloginflag(Map<String, Integer> flag);

	/**
	 * @param u
	 * @return
	 */
	public int ChangePassWord(userinfo u);

	/**
	 * @param u
	 * @return
	 */
	public int changeuserinfo(userinfo u);

}
