/**
 * 
 */
package com.car.user.Dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.car.user.model.userinfo;
import com.car.utils.annotation.mybatis.MyBatisScan;

/**
 * @author gaohongming
 * 创建时间：2017年2月12日 下午8:32:50 
 */
@MyBatisScan
@Repository
public interface UserDao {
	public int RegistUserByQQ(userinfo user);

	/**
	 * @param u
	 * @return
	 */
	public int RegisterByusername(userinfo u);

	/**
	 * @param u
	 * @return
	 */
	public int RegistBySina(userinfo u);

	
	/**
	 * @param u
	 * @return
	 */
	public userinfo JudegUser(userinfo u);

	/**
	 * @param flag
	 */
	public void ChangeLongloginflag(Map<String, Integer> flag);

	/**
	 * @param id
	 * @return
	 */
	public int ChangePassWord(userinfo u);

	/**
	 * @param u
	 * @return
	 */
	public int changeuserinfo(userinfo u);

	/**
	 * @param u
	 */
	public void SetuserIcon(userinfo u);

	/**
	 * @param u
	 */
	public void changeQQ(userinfo u);

	/**
	 * @param u
	 */
	public void changeSina(userinfo u);

}
