package com.czh.taskflow.common.base;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.czh.taskflow.common.model.IRequestForm;

/**
 * @Title: IService.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public interface IService {

	/**
	 * @Title: handler 
	 * @Description: 业务层调用统一入口
	 * @param request
	 * @param requestForm
	 */
	public Map<String, ?> handler(HttpServletRequest request, IRequestForm requestForm);
	
}
