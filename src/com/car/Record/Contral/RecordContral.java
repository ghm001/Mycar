/**
 * 
 */
package com.car.Record.Contral;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.Record.model.recoed;
import com.car.Record.service.RecordService;
import com.car.assest.model.Assest;
import com.car.utils.annotation.mybatis.util.returninfo;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:30:28 
 */
@Controller
public class RecordContral {

	@Resource
	RecordService recoService;
	//保险
	@ResponseBody
	@RequestMapping(value="/car/setinsurence",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String setInsurebce(HttpServletRequest request)
	{
		recoed re=new recoed();
		re.setUserId(Integer.parseInt(request.getParameter("userId")));
		re.setCumType("保险");
		re.setCumTime(request.getParameter("cumTime"));
		re.setCumMoney(Integer.parseInt(request.getParameter("cumMoney")));
		recoService.setInsurence(re);
		//资产增加
		Assest assest=new Assest();
		assest.setUserId(Integer.parseInt(request.getParameter("userId")));
		assest.setCarInsurance(Integer.parseInt(request.getParameter("carInsurance")));
		recoService.addInsurance(assest);
		return returninfo.returning();
	}
	//获取所有消费记录
	@ResponseBody
	@RequestMapping(value="/car/getallRecord",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String getallRecord(HttpServletRequest request)
	{
		int userId=Integer.parseInt(request.getParameter("userId"));
		        return returninfo.returnobj(recoService.getallRecord(userId));
	}
	
	
	//删除某个记录传过来id
	@ResponseBody
	@RequestMapping(value="/car/deleteOne",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String deleteOne(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		recoService.deleteOne(id);
		return returninfo.returning();
	}
	
	
	
	
	
}
