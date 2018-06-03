package com.czh.taskflow.common.base.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.czh.taskflow.common.base.ILogService;
import com.czh.taskflow.common.base.IService;
import com.czh.taskflow.common.constants.Dict;
import com.czh.taskflow.common.constants.ErrorEnum;
import com.czh.taskflow.common.exception.BaseException;
import com.czh.taskflow.common.model.CoreContext;
import com.czh.taskflow.common.model.IRequestForm;
import com.czh.taskflow.common.model.UserVo;

/**
 * @Title: BaseService.java
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: www.chenzhehao.com
 * @author chenzhehao
 * @date 2018年6月2日
 * @version 1.0
 */
public abstract class BaseService implements IService {

	@Autowired
	private ILogService logService;

	/**
	 * @Title: prepare
	 * @Description: 业务逻辑调用前处理逻辑
	 * @param context
	 */
	public void prepare(CoreContext context) {

	}

	/**
	 * @Title: execute
	 * @Description: 调用业务逻辑代码
	 * @param context
	 */
	public abstract Map execute(CoreContext context);

	/**
	 * @Title: after
	 * @Description: 业务逻辑调用完后处理逻辑
	 * @param context
	 */
	private Map<String, ?> after(CoreContext context) {
		Map result = context.getResult();
		Map<String, Object> responMap = new HashMap<String, Object>();
		responMap.put(Dict.SUCCESS_CODE, ErrorEnum.SYS_SUCCESS.getErrCode());
		responMap.put(Dict.SUCCESS_MESSAGE, ErrorEnum.SYS_SUCCESS.getErrMsg());
		responMap.put(Dict.RET_DATA_KEY, result);
		return responMap;
	}

	@Override
	public final Map<String, ?> handler(HttpServletRequest request, IRequestForm requestForm) {
		CoreContext context = init(request, requestForm);
		logService.log(context);// 记录日志
		prepare(context);
		try {
			context.setResult(execute(context));
		} catch (Exception e) {
			if (e instanceof BaseException) {
				throw e;
			} else {
				throw new BaseException(ErrorEnum.SYS_UNKNOWN);
			}
		}
		return after(context);
	}

	/**
	 * @Title: init
	 * @Description: 初始化CoreContext
	 * @param request
	 * @param requestForm
	 * @return
	 */
	private CoreContext init(HttpServletRequest request, IRequestForm requestForm) {
		CoreContext context = new CoreContext();
		context.setHttpServletRequest(request);
		context.setForm(requestForm);
		// 绑定请求相关的数据
		if (null != request) {
			// 绑定user相关数据
			UserVo sessionUser = (UserVo) request.getAttribute("");
			if (null != sessionUser) {
				// 将用户放入上下文
				context.setUser(sessionUser);
			}
		}
		return context;
	}

}
