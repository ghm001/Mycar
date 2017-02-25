/**
 * 
 */
package com.car.say.Contral;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.say.model.saying;
import com.car.say.service.sayService;
import com.car.utils.annotation.mybatis.util.imageutil;
import com.car.utils.annotation.mybatis.util.returninfo;
import com.google.gson.Gson;

/**
 * @author gaohongming
 * 创建时间：2017年2月23日 下午2:33:31 
 */
@Controller
public class sysContral {

	@Resource
	sayService sayservice;
	/*
	 * 传入完整的说说信息，包括用户的id还有说说上传的图片
	 */
	@ResponseBody
	@RequestMapping(value="/car/setSaying",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String setSaying(HttpServletRequest request)
	{
		String image1="";
		String image2="";
		String image3="";
		String image4="";
		String image5="";
		String image6="";
		saying s=new saying();
		s.setDescription(request.getParameter("description"));
		s.setTime(request.getParameter("time"));
		s.setUserid(Integer.parseInt(request.getParameter("userid")));
		String path=request.getSession().getServletContext().getRealPath("/img/usersay");
		if(request.getParameter("image1")!=null&&!request.getParameter("image1").equals(""))
		{
			 image1=request.getParameter("image1");
			 s.setUrl1(imageutil.setimage(s.getUserid()+"", path, image1));
		}
		if(request.getParameter("image2")!=null&&!request.getParameter("image2").equals(""))
		{
			image2=request.getParameter("image2");
			 s.setUrl2(imageutil.setimage(s.getUserid()+"", path, image2));
		}
		if(request.getParameter("image3")!=null&&!request.getParameter("image3").equals(""))
		{
			 image3=request.getParameter("image3");
			 s.setUrl3(imageutil.setimage(s.getUserid()+"", path, image3));
		}
		if(request.getParameter("image4")!=null&&!request.getParameter("image4").equals(""))
		{
			 image4=request.getParameter("image4");
			 s.setUrl4(imageutil.setimage(s.getUserid()+"", path, image4));
		}
		if(request.getParameter("image5")!=null&&!request.getParameter("image5").equals(""))
		{
		    image5=request.getParameter("image5");
		    s.setUrl5(imageutil.setimage(s.getUserid()+"", path, image5));
		}
		if(request.getParameter("image6")!=null&&!request.getParameter("image6").equals(""))
		{
			 image6=request.getParameter("image6");
			 s.setUrl6(imageutil.setimage(s.getUserid()+"", path, image6));
		}
		sayservice.setSaying(s);
		return returninfo.returning();
	}
	
	/*
	 * 取最新的前10条说说信息
	 */
	@ResponseBody
	@RequestMapping(value="/car/getSaying",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String getSaying(HttpServletRequest request)
	{
		List<saying> list=sayservice.getSaying();
		String json=new Gson().toJson(list);
		return json;
		
	}
	
	
	
}
