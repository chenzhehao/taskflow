package com.czh.taskflow.common.base.impl;

import org.springframework.stereotype.Service;

import com.czh.taskflow.common.base.ILogService;
import com.czh.taskflow.common.model.CoreContext;

/**
 * @Title: LogService.java
 * @Description:主要用来统计用户行为信息，通用日志
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
@Service("logService")
public class LogService implements ILogService {

	@Override
	public void log(CoreContext context) {

	}

}
