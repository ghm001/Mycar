/**
 * 
 */
package com.car.assest.Contral;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.car.assest.service.assestService;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:30:17 
 */
@Controller
public class assestContral {
	@Resource
    assestService assservice;
	
}
