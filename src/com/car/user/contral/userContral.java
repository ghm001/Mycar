/**
 * 
 */
package com.car.user.contral;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.user.model.userinfo;
import com.car.user.service.userService;
import sun.misc.BASE64Decoder;

import net.sf.json.*;
;


/**
 * @author gaohongming
 * 创建时间：2017年2月13日 下午3:18:12 
 */
@Controller
public class userContral {
	@Resource
	userService userservice;
	/*
	 * 用户注册功能
	 * 通过qq注册
	 * 2017/2/14
	 * 返回用户注册的id，失败则返回error
	 */
	@ResponseBody
	@RequestMapping(value="/car/RegistByQQ",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String RegisterByQQ(HttpServletRequest request){
		System.out.println("新增加注册用户");
		int i=0;
		userinfo u=new userinfo();
		/*
		 * 这里还可以添加其他传送过来的数据添加到对象中并且写入。
		 */
		u.setQq(request.getParameter("qq"));
		u.setNickName(request.getParameter("nickName"));
		u.setHeadImageUrl(request.getParameter("headImageUrl"));
		if(userservice.JudegUser(u)==null)
		{
		userservice.RegistUserByQQ(u);
		System.out.println("-----------------------------");
		System.out.println("用户的id为------------"+u.getId());
		System.out.println("-----------------------------");
		return u.getId()+"";
		}else {
			return "error";
		}
	}
	/*
	 * 通过账号进行注册
	 */
	@ResponseBody
	@RequestMapping(value="/car/RegistUsername",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String RegisterByusername(HttpServletRequest request)
	{
		System.out.println("新增加注册用户");
		int i=0;
		userinfo u=new userinfo();
		/*
		 * 这里还可以添加其他传送过来的数据添加到对象中并且写入。
		 */
		u.setUsername(request.getParameter("username"));
		u.setPassWord(request.getParameter("passWord"));
		if(userservice.JudegUser(u)==null)
		{
		userservice.RegisterByusername(u);
		System.out.println("-----------------------------");
		System.out.println("用户的id为------------"+u.getId());
		System.out.println("-----------------------------");
		return u.getId()+"";
		}
		else {
			return "error";
		}
	}
	/*
	 * 通过新浪账号注册
	 */
	@ResponseBody
	@RequestMapping(value="/car/RegistSina",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String RegistBySina(HttpServletRequest request)
	{
		System.out.println("新增加注册用户");
		int i=0;
		userinfo u=new userinfo();
		/*
		 * 这里还可以添加其他传送过来的数据添加到对象中并且写入。
		 */
		u.setNickName(request.getParameter("nickName"));
		u.setHeadImageUrl(request.getParameter("headImageUrl"));
		u.setSina(request.getParameter("Sina"));
		if(userservice.JudegUser(u)==null)
		{
		userservice.RegistBySina(u);
		System.out.println("-----------------------------");
		System.out.println("用户的id为------------"+u.getId());
		System.out.println("-----------------------------");
		return u.getId()+"";
		}else {
			return"error";
		}
	}
	/*
	 * 通过用户账号密码进行登陆
	 * 登陆后返回用户的信息
	 */
	@ResponseBody
	@RequestMapping(value="/car/LoginByuser",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String LoginByusername(HttpServletRequest request)
	{
		userinfo u=new userinfo();
		Map<String,Integer> flag=new HashMap<String, Integer>();
		u.setUsername(request.getParameter("username"));
		u.setPassWord(request.getParameter("passWord"));
		userinfo ut;
		ut=userservice.JudegUser(u);
		if(ut!=null)
		{/*
		    这里有个弊端，返回的用户登陆状态为0，所以要在前端进行修改一下
		*/
			System.out.println("id为"+ut.getId()+"的用户使用账号密码进行登陆");
			flag.put("loginflag", 1);
			flag.put("id", ut.getId());
			userservice.ChangeLongloginflag(flag);
			return JSONObject.fromObject(ut).toString();
		}
		else {
			u.setUsername("error");
			return JSONObject.fromObject(u).toString();
		}
	}
	/*
	 * 通过用户的qq号码进行登陆
	 * 登陆后返回用户的信息
	 */
	@ResponseBody
	@RequestMapping(value="/car/LoginByqq",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String LoginByqq(HttpServletRequest request)
	{
		userinfo u=new userinfo();
		Map<String,Integer> flag=new HashMap<String, Integer>();
		u.setQq(request.getParameter("qq"));
		userinfo ut;
		/*
		 * 这个方法不仅可以判断用户是否存在账户中，传入子账户或者qq或者新浪账号都可以进行判断
		 */
		ut=userservice.JudegUser(u);
		if(ut!=null)
		{/*
		    这里有个弊端，返回的用户登陆状态为0，所以要在前端进行修改一下
		*/
			System.out.println("id为"+ut.getId()+"的用户使用账号密码进行登陆");
			flag.put("loginflag", 1);
			flag.put("id", ut.getId());
			userservice.ChangeLongloginflag(flag);
			return JSONObject.fromObject(ut).toString();
		}
		else {
			u.setUsername("error");
			return JSONObject.fromObject(u).toString();
		}
	}
	/*
	 * 通过用户的Sina账号进行登陆
	 * 登陆后返回用户的信息
	 */
	@ResponseBody
	@RequestMapping(value="/car/LoginBySina",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String LoginBySina(HttpServletRequest request)
	{
		userinfo u=new userinfo();
		Map<String,Integer> flag=new HashMap<String, Integer>();
		u.setSina(request.getParameter("Sina"));
		userinfo ut;
		/*
		 * 这个方法不仅可以判断用户是否存在账户中，传入子账户或者qq或者新浪账号都可以进行判断
		 */
		ut=userservice.JudegUser(u);
		if(ut!=null)
		{/*
		    这里有个弊端，返回的用户登陆状态为0，所以要在前端进行修改一下
		*/
			System.out.println("id为"+ut.getId()+"的用户使用账号密码进行登陆");
			flag.put("loginflag", 1);
			flag.put("id", ut.getId());
			userservice.ChangeLongloginflag(flag);
			return JSONObject.fromObject(ut).toString();
		}
		else {
			u.setUsername("error");
			return JSONObject.fromObject(u).toString();
		}
	}
	
	/*
	 * 下面是修改用户信息部分
	 * 
	 */
	
	/*这个只有用户是账号密码进行注册的才能修改
	 * 用户密码修改
	 * 修改完之后直接回退出登录同时修改登录状态
	 * 失败会返回error
	 * 成功则返回finsh
	 * 传入用户id
	 */
	@ResponseBody
	@RequestMapping(value="/car/changePassWord",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String changePassWord(HttpServletRequest request)
	{
		userinfo u=new userinfo();
		Map<String,Integer> flag=new HashMap<String, Integer>();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setPassWord(request.getParameter("passWord"));
		int num=userservice.ChangePassWord(u);
		if(num!=0)
		{
			flag.put("loginflag", 0);
			flag.put("id", u.getId());
			userservice.ChangeLongloginflag(flag);
			return "finsh";
		}
		return"errpr";
	}
	
	
	/*
	 * qq进行绑定,只能是用户名和密码的进行修改
	 * 使用update先判断在进行绑定
	 * 失败返回error
	 */
	@ResponseBody
	@RequestMapping(value="/car/ChangeQQ",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	   public String ChangeQQ(HttpServletRequest request)
	   {
		   userinfo u=new userinfo();
		   u.setQq(request.getParameter("qq"));
		   u.setId(Integer.parseInt(request.getParameter("id")));
		   userinfo ut=new userinfo();
		   ut=userservice.JudegUser(u);
		   if(ut==null||ut.getId()==u.getId())
		   {
			   userservice.changeQQ(u);
			   return "finsh";
		   }  
		return "error";   
	   }
	
	/*
	 * 只能是用户名密码的进行修改
	 * Sina账号进行绑定
	 */
	@ResponseBody
	@RequestMapping(value="/car/ChangeSina",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	   public String ChangeSina(HttpServletRequest request)
	   {
		 userinfo u=new userinfo();
		   u.setSina(request.getParameter("Sina"));
		   u.setId(Integer.parseInt(request.getParameter("id")));
		   userinfo ut=new userinfo();
		   ut=userservice.JudegUser(u);
		   if(ut==null||ut.getId()==u.getId())
		   {
			   userservice.changeSina(u);
			   return "finsh";
		   }  
		return "error";   
	   }
	
	/*
	 * 用户信息修改，传入完整的用户信息对象，包括用户的id
	 */
	
	@ResponseBody
	@RequestMapping(value="/car/Changeuserinfo",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	   public String Changeuserinfo(HttpServletRequest request)
	   {
		userinfo u=new userinfo();
		u.setAddress(request.getParameter("address"));
		u.setBirthday(request.getParameter("birthday"));
		u.setEmail(request.getParameter("email"));
		u.setNickName(request.getParameter("nickName"));
		u.setPhoneNumber(request.getParameter("phoneNumber"));
		u.setSex(request.getParameter("sex"));
		u.setId(Integer.parseInt(request.getParameter("id")));
		int num=userservice.changeuserinfo(u);
		if(num!=0)
		{
			return "finsh";
		}
		return "error";   
	   }
	/*
	 * 传过来一个用户对象必须包括的信息有 qq   或者 Sina   或者用户账号 和一个标志   
	 *  额外传送字段flag  1代表是用用户名进行登陆的   2代表是qq登陆的  3代表是Sina登陆的 ，
	 *  还有讲用户图片传送过来使用userIconContent进行标示
	 */
	@ResponseBody
	@RequestMapping(value="/car/SetuserIcon",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String getusericon(HttpServletRequest request)
	{
		 String fileName="/";
		 userinfo u=new userinfo();
		 u.setId(Integer.parseInt(request.getParameter("id")));
		 u.setQq(request.getParameter("qq"));
		 u.setUsername(request.getParameter("username"));
		 
		 u.setSina(request.getParameter("Sina"));	 	
		 System.out.println("--------"+u.getQq()+"---"+u.getUsername()+"---  "+u.getSina());
		 userinfo ut=new userinfo();
		 ut=userservice.JudegUser(u);
		 System.out.println("------------------"+ut.getHeadImageUrl()+"-------------"+ut.getUsername());
		 System.out.println("------------------"+request.getParameter("userIconContent"));
		 //传过来的图片
	     String icon=request.getParameter("userIconContent");	     
	     String path=request.getSession().getServletContext().getRealPath("/img/usericon");	 
	     
	     String OldImageUrl=ut.getHeadImageUrl();	 
	     //判断是什么方式进行登陆的
	     if(request.getParameter("flag").equals("1"))
	     {
	    	 fileName=fileName+u.getUsername().trim()+".png";
	    	 u.setHeadImageUrl(fileName);
	     }
	     if (request.getParameter("flag").equals("2")) {
			  fileName=fileName+u.getQq().trim()+".png";
			  u.setHeadImageUrl(fileName);
		  }
	     if (request.getParameter("flag").equals("3")) {
	    	 fileName=fileName+u.getSina().trim()+".txt";
	    	 u.setHeadImageUrl(fileName);
		  }
	     File img=new File(path+fileName);	
	     //先删除原来的头像
	     File file=new File(path+OldImageUrl);
	        if(file.exists()){
	            file.delete();
	        }
	        try {
	            //再写入新头像
	            byte [] user=new BASE64Decoder().decodeBuffer(icon);
	            OutputStream os=new FileOutputStream(img);
	            os.write(user,0,user.length);
	            os.flush();
	            os.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        userservice.SetuserIcon(u);        
		return request.getSession().getServletContext().getRealPath("/img/usericon"+fileName);
	}
	
	
	 @ResponseBody
	@RequestMapping(value="/getJson",method = {RequestMethod.POST,RequestMethod.GET},produces = "text/plain;charset=UTF-8")
	public String getUserInfo(){
		userinfo user = new userinfo();
		user.setAddress("地址");
		user.setBirthday("shengri");
		user.setDynamicId(1);
		user.setEmail("qqqqqqq");
		user.setFaultId(2);
		user.setFlag(1);
		user.setHeadImageUrl("222");
		user.setId(1);
		user.setLoginflag(1);
		user.setNickName("qqqqwwwweeerrr");
		user.setOrderid(2);
		user.setPassWord("qwertyui");
		user.setPhoneNumber("sadasda");
		user.setQq("122121212");
		user.setServiceid(2);
		user.setSex("w");
		user.setSina("3333");
		user.setTime("3333");
		user.setUsername("wqewqe");
		System.out.println(user.toString());
		JSONObject jsonObject=JSONObject.fromObject(user);
		String json=jsonObject.toString();
		return json;
	}
	
	}
	
