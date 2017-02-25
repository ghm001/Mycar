/**
 * 
 */
package com.car.car.contral;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.car.model.cars;
import com.car.car.service.carService;
import com.car.utils.annotation.mybatis.util.returninfo;
import com.google.gson.Gson;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:27:58 
 */
@Controller
public class carContral {
	@Resource
	carService carservice;

	
	//通过用户id获取该用户所有的期初信息
	@ResponseBody
	@RequestMapping(value="/car/getAllCar",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
		public String getAllCar(HttpServletRequest request)
		{
			int nickNameid=Integer.parseInt(request.getParameter("nickNameid"));
			List<cars> cars=carservice.getAllCar(nickNameid);
			String json=new Gson().toJson(cars);
			return json;
		}
		//通过用户id删除用户的车辆
		@ResponseBody
		@RequestMapping(value="/car/deletedOne",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
		public String deletedOne(HttpServletRequest request)
		{
			int id=Integer.parseInt(request.getParameter("id"));
			carservice.deletedOne(id);
			return returninfo.returning();
		}
		//通过id增加一辆车辆
		@ResponseBody
		@RequestMapping(value="/car/addOne",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
		public String addOne(HttpServletRequest request)
		{
			cars car=new cars();
			car.setCarBrand(request.getParameter("carBrand"));
			car.setCarEngineNum(request.getParameter("carEngineNum"));
			car.setCarFrameNum(request.getParameter("carFrameNum"));
			car.setCarIconUrl(request.getParameter("carIconUrl"));
			car.setCarId(Integer.parseInt(request.getParameter("carId")));
			car.setCarNumber(request.getParameter("carNumber"));
			car.setCarSpecificModel(request.getParameter("carSpecificModel"));
			car.setNickNameid(Integer.parseInt(request.getParameter("nickNameid")));
			car.setTime(request.getParameter("time"));
			carservice.addOne(car);
			return returninfo.returning();
		}
		//根据一个车辆的id修改某个车辆信息
		@ResponseBody
		@RequestMapping(value="/car/changeone",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
		public String changeone(HttpServletRequest request)
		{
			cars car=new cars();
			car.setId(Integer.parseInt(request.getParameter("id")));
			car.setCarBrand(request.getParameter("carBrand"));
			car.setCarEngineNum(request.getParameter("carEngineNum"));
			car.setCarFrameNum(request.getParameter("carFrameNum"));
			car.setCarIconUrl(request.getParameter("carIconUrl"));
			car.setCarId(Integer.parseInt(request.getParameter("carId")));
			car.setCarNumber(request.getParameter("carNumber"));
			car.setCarSpecificModel(request.getParameter("carSpecificModel"));
			car.setTime(request.getParameter("time"));
			return returninfo.returning();
		}
		
}
