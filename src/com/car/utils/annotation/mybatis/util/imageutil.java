/**
 * 
 */
package com.car.utils.annotation.mybatis.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import sun.misc.BASE64Decoder;

/**
 * @author gaohongming
 * 创建时间：2017年2月25日 下午7:55:10 
 */
public class imageutil {
	public static String setimage(String imgName,String path,String imageContent)
	{
		 //生成图片的随机数
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        String time=dateFormat.format(date);

        //图片文件的名称
        String fileName="/"+imgName.trim()+time.trim()+".png";
        System.out.println(fileName);
        //创建图片文件
        File imgFile=new File(path+fileName);
        System.out.println(path+fileName);

        try {
            //向服务器端写文件
            byte [] bytes=new BASE64Decoder().decodeBuffer(imageContent);
            OutputStream os=new FileOutputStream(imgFile);
            os.write(bytes,0,bytes.length);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      return fileName;
	}

}
