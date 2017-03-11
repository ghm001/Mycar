/**
 * 
 */
package com.car.shopping.Contral;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.car.shopping.service.shoppingSercice;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:31:03 
 */
@Controller
public class shoppingContral {

	@Resource
	shoppingSercice shopSercice;
}
