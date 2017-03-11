/**
 * 
 */
package com.car.Repair.Contral;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.car.Repair.service.RepaieService;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:30:49 
 */
@Controller
public class RepairContral {

	@Resource
	RepaieService reService;
}
