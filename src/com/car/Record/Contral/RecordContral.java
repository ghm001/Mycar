/**
 * 
 */
package com.car.Record.Contral;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.car.Record.service.RecordService;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午1:30:28 
 */
@Controller
public class RecordContral {

	@Resource
	RecordService recoService;
}
