/**
 * 
 */
package com.car.Repair.Contral;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.Record.model.recoed;
import com.car.Repair.model.repair;
import com.car.Repair.service.RepaieService;
import com.car.assest.model.Assest;
import com.car.utils.annotation.mybatis.util.returninfo;
import com.google.gson.Gson;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:30:49 
 */
@Controller
public class RepairContral {
	@Resource
	RepaieService reService;
	
	/*
	 * 通过用户id进行增加一条维修订单
	 */
	@ResponseBody
	@RequestMapping(value="/Repair/addOne",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String addOne(HttpServletRequest request)
	{
		repair re=new repair();
		re.setUserId(Integer.parseInt(request.getParameter("userId")));
		re.setShopType(request.getParameter("shopType"));
		re.setShopName(request.getParameter("shopName"));
		re.setShopIconUrl(request.getParameter("shopIconUrl"));
		re.setShopAddress(request.getParameter("shopAddress"));
		re.setOrderTime(request.getParameter("orderTime"));
		//re.setOrderState(Integer.parseInt(request.getParameter("orderState")));
		re.setMoney(Integer.parseInt(request.getParameter("money")));
		reService.addOne(re);
		return returninfo.returning();
	}
	
	/*
	 * 通过用户的id获取所有的订单
	 */
	@ResponseBody
	@RequestMapping(value="/Repair/getall",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String getall(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("userId"));
		List<repair> aList=reService.getall(id);
		String json=new Gson().toJson(aList);
		return json;
	}
	
	/*
	 * 通过订单号进行删除某个订单
	 */
	@ResponseBody
	@RequestMapping(value="/Repair/deleteOne",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String deleteOne(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("userId"));
		reService.seleteOne(id);
		return returninfo.returning();
	}
	/*
	 * 结算某个订单
	 */
	@ResponseBody
	@RequestMapping(value="/Repair/buyOne",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String BuyOne(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		recoed re=new recoed();
		re.setCumMoney(Integer.parseInt(request.getParameter("cumMoney")));
		re.setCumTime(request.getParameter("cumTime"));
		re.setCumType(request.getParameter("cumType"));
		re.setUserId(Integer.parseInt(request.getParameter("userId")));
		Assest assert1=new Assest();
		assert1.setUserId(re.getUserId());
		assert1.setCarRepair(re.getCumMoney());
		//先进性订单状态修改
		reService.changestate(id);
		//进行订单消费信息录入
		reService.addReoair(re);
		//总资产进行改变
		reService.addmoney(assert1);
		return returninfo.returning();
	}
	
	
}
