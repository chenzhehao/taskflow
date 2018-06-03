package com.czh.taskflow.common.base.impl;

import java.util.Map;

import com.czh.taskflow.common.model.CoreContext;

/**
 * @Title: QueryService.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public abstract class QueryService extends BaseService {

	@Override
	public Map execute(CoreContext context) {
		return query(context);
	}

	@Override
	public final void prepare(CoreContext context) {
		super.prepare(context);
	}

	public abstract Map query(CoreContext context);

}
