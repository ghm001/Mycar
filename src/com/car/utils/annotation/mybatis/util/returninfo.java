/**
 * 
 */
package com.car.utils.annotation.mybatis.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午3:54:36 
 */
public class returninfo {
	public static String returning()
	{
		Map<String, String> aHashMap=new HashMap<String, String>();
		aHashMap.put("flag", "finsh");
		String json=new Gson().toJson(aHashMap);
		return json;
	}

	
	public static String returnobj(List<Object> bj)
	{
		 return new Gson().toJson(bj);	
	}
	
	public static String returnobj2(Object ob,String state)
	{
		Map<String, Object> aMap=new HashMap<String, Object>();
		aMap.put(state, ob);
		return new Gson().toJson(aMap);
	}
}
