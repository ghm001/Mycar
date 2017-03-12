/**
 * 
 */
package com.car.assest.Contral;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.assest.service.assestService;
import com.car.utils.annotation.mybatis.util.returninfo;
import com.google.gson.Gson;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:30:17 
 */
@Controller
public class assestContral {
	@Resource
    assestService assservice;
	//获取所有资产
	@ResponseBody
	@RequestMapping(value="/car/getassest",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String getasse(HttpServletRequest request)
	{
           int userId=Integer.parseInt(request.getParameter("userId"));
          return returninfo.returnobj2(assservice.getall(userId),"assest");  
	}
	
	
	
}
