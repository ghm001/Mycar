/**
 * 
 */
package com.car.Record.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.car.Record.Dao.RecordDao;

/**
 * @author gaohongming
 * 创建时间：2017年3月11日 下午2:46:06 
 */
@Service
public class RecordServiceImpl implements RecordService {

	@Resource
	RecordDao recodao;
}
