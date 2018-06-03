package com.czh.taskflow.common.base.impl;

import java.util.Map;

import com.czh.taskflow.common.model.CoreContext;

/**
 * @Title: WriteService.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public abstract class WriteService extends BaseService {

	@Override
	public final Map execute(CoreContext context) {
		return submit(context);
	}

	@Override
	public final void prepare(CoreContext context) {
		System.out.println("记录业务数据信息");
	}

	public abstract Map submit(CoreContext context);

}
